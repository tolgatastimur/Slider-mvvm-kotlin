package com.tolga.app.slidermvvmkotlin.ui.main.homepage


import android.Manifest
import android.content.Intent
import android.net.Uri
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.helper.ItemTouchHelper
import com.tolga.app.slidermvvmkotlin.BuildConfig
import com.tolga.app.slidermvvmkotlin.R
import com.tolga.app.slidermvvmkotlin.core.BaseFragment
import com.tolga.app.slidermvvmkotlin.core.Constants
import com.tolga.app.slidermvvmkotlin.databinding.FragmentMainBinding
import com.tolga.app.slidermvvmkotlin.service.response.CurResponse
import com.tolga.app.slidermvvmkotlin.utils.helpers.DragSwipeCallback
import com.tolga.app.slidermvvmkotlin.utils.helpers.SimpleItemTouchHelperCallback
import com.tolga.app.slidermvvmkotlin.utils.service.CallbackWrapper
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers
import android.support.v4.app.ActivityCompat
import android.content.DialogInterface
import android.annotation.SuppressLint
import android.app.AlertDialog
import android.content.Context
import android.content.pm.PackageManager
import android.support.v4.content.ContextCompat
import android.location.LocationManager
import android.widget.Toast
import com.tolga.app.slidermvvmkotlin.service.response.OfficialRateResponse
import com.tolga.app.slidermvvmkotlin.utils.extensions.toast
import kotlin.collections.ArrayList
import kotlin.collections.HashMap


class HomePageFragment : BaseFragment<HomePageViewModel, FragmentMainBinding>(HomePageViewModel::class.java) {


    private var mItemTouchHelper: ItemTouchHelper? = null
    private val disposable = CompositeDisposable()
    val curList = ArrayList<CurResponse>()

    override fun getLayoutRes(): Int {
        return R.layout.fragment_main
    }


    override fun initViewModel() {
        mBinding.viewModel = viewModel

    }

    override fun init() {
        mBinding.swipeRefreshLayout.setOnRefreshListener {
            updateLayout()
        }

        mBinding.floatingActionButton.setOnClickListener {
            shareWithEmail()
        }
        getData()
        initAdapter()
    }


    private fun getData() {
        showProgress()
        disposable.add(viewModel.getCur()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeWith(object : CallbackWrapper<List<CurResponse>>(activity?.application!!) {
                    override fun onSuccess(t: List<CurResponse>) {
                        hideProgress()
                        t.forEach {
                            curList.add(it)
                        }
                        (mBinding.recyclerView.adapter as HomePageAdapter).submitList(curList)
                    }

                    override fun onError(e: Throwable) {
                        super.onError(e)
                        toast("Bağlantı sağlanamadı.",Toast.LENGTH_LONG)
                        hideProgress()
                    }
                }))
    }

    private fun initAdapter() {
        mBinding.recyclerView.adapter = HomePageAdapter(object : (CurResponse?, Int?) -> Unit {
            override fun invoke(p1: CurResponse?, p2: Int?) {
                when (p2) {
                    Constants.CALLBACK_TYPE.CUR_ID -> showCurDetail(p1?.curAbbreviation.toString(), p1?.curName.toString())
                }
            }
        })
        mBinding.recyclerView.layoutManager = LinearLayoutManager(activity)

        val callback = SimpleItemTouchHelperCallback(object : DragSwipeCallback {
            override fun onItemMove(fromPosition: Int, toPosition: Int) {
                val prev = curList[fromPosition]
                curList.add(if (toPosition > fromPosition) toPosition - 1 else toPosition, prev)
                (mBinding.recyclerView.adapter as HomePageAdapter).notifyItemMoved(fromPosition, toPosition)
            }

            override fun onItemDismiss(position: Int) {
                curList.remove(curList[position])
                (mBinding.recyclerView.adapter as HomePageAdapter).submitList(curList)
                (mBinding.recyclerView.adapter as HomePageAdapter).notifyItemRemoved(position)
            }

        })
        mItemTouchHelper = ItemTouchHelper(callback)
        mItemTouchHelper!!.attachToRecyclerView(mBinding.recyclerView)
    }


    private fun updateLayout() {
        getData()
        initAdapter()
        mBinding.swipeRefreshLayout.isRefreshing = false
    }

    private fun showCurDetail(abbreviation: String, curName: String) {
        showProgress()
        disposable.add(viewModel.getOfficialRate(abbreviation)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeWith(object : CallbackWrapper<OfficialRateResponse>(activity?.application!!) {
                    override fun onSuccess(t: OfficialRateResponse) {
                        hideProgress()
                        val officialRate = curName + " Official rate = " + t.curOfficialRate.toString()

                        val dialog = AlertDialog.Builder(context).setTitle("Official Rate").setMessage(officialRate)
                                .setPositiveButton("Tamam") { dialog, i ->
                                    dialog.dismiss()
                                }
                        dialog.show()
                    }

                    override fun onError(e: Throwable) {
                        super.onError(e)
                        toast("Bağlantı sağlanamadı. 404 Not Found ")
                        hideProgress()
                    }
                }))


    }

    private fun shareWithEmail() = try {
        checkLocationPermission()

        val latLong: HashMap<String, Double>? = getLatitudeLongitude()
        val packageName = this.javaClass.getPackage().name
        val minSdkVersion = BuildConfig.MIN_SDK_VERSION
        val targetSdkVersion = BuildConfig.TARGET_SDK_VERSION
        val message = "PackageName : $packageName MinSdkVersion : $minSdkVersion MaxSdkVersion : \n $targetSdkVersion Latitude and Longitude :$latLong"

        if (latLong?.get("latitude") != null) {

            val intent = Intent(Intent.ACTION_SENDTO)
            intent.type = "text/plain"
            intent.putExtra(Intent.EXTRA_SUBJECT, "Tolga Taştimur Test Case")
            intent.putExtra(Intent.EXTRA_TEXT, message)
            intent.data = Uri.parse("mailto:yalkin@efectura.com")
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)

            startActivity(intent)
        } else {
            toast("Lütfen cihazınızın konum servisini açınız.", Toast.LENGTH_LONG)
        }


    } catch (e: Exception) {
        println("is exception raises during sending mail$e")
    }


    fun checkLocationPermission(): Boolean {
        if (ContextCompat.checkSelfPermission(this.context!!,
                        Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED) {

            if (ActivityCompat.shouldShowRequestPermissionRationale(this.activity!!,
                            Manifest.permission.ACCESS_FINE_LOCATION)) {

                AlertDialog.Builder(context)
                        .setTitle(R.string.title_location_permission)
                        .setMessage(R.string.text_location_permission)
                        .setPositiveButton(R.string.ok, DialogInterface.OnClickListener { dialogInterface, i ->
                            activity?.let {
                                ActivityCompat.requestPermissions(it,
                                        arrayOf(Manifest.permission.ACCESS_FINE_LOCATION),
                                        Constants.PERMISSON_REQUESTS.MY_PERMISSIONS_REQUEST_LOCATION)
                            }
                        })
                        .create()
                        .show()


            } else {
                activity?.let {
                    ActivityCompat.requestPermissions(it,
                            arrayOf(Manifest.permission.ACCESS_FINE_LOCATION),
                            Constants.PERMISSON_REQUESTS.MY_PERMISSIONS_REQUEST_LOCATION)
                }
            }
            return false
        } else {
            return true
        }
    }


    @SuppressLint("MissingPermission")
    private fun getLatitudeLongitude(): HashMap<String, Double>? {
        val latLong: HashMap<String, Double> = HashMap<String, Double>()
        val lm = activity?.getSystemService(Context.LOCATION_SERVICE) as LocationManager
        val location = lm.getLastKnownLocation(LocationManager.GPS_PROVIDER)
        val longitude = location?.longitude
        val latitude = location?.latitude

        latitude?.let { latLong.put("latitude", it) }
        longitude?.let { latLong.put("longitude", it) }

        return latLong
    }

}