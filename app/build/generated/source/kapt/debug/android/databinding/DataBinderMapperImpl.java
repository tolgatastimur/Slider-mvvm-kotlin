
package android.databinding;
import com.tolga.app.slidermvvmkotlin.BR;
class DataBinderMapperImpl extends android.databinding.DataBinderMapper {
    public DataBinderMapperImpl() {
    }
    @Override
    public android.databinding.ViewDataBinding getDataBinder(android.databinding.DataBindingComponent bindingComponent, android.view.View view, int layoutId) {
        switch(layoutId) {
                case com.tolga.app.slidermvvmkotlin.R.layout.item_cur:
 {
                        final Object tag = view.getTag();
                        if(tag == null) throw new java.lang.RuntimeException("view must have a tag");
                    if ("layout/item_cur_0".equals(tag)) {
                            return new com.tolga.app.slidermvvmkotlin.databinding.ItemCurBindingImpl(bindingComponent, view);
                    }
                    if ("layout-v21/item_cur_0".equals(tag)) {
                            return new com.tolga.app.slidermvvmkotlin.databinding.ItemCurBindingV21Impl(bindingComponent, view);
                    }
                        throw new java.lang.IllegalArgumentException("The tag for item_cur is invalid. Received: " + tag);
                }
                case com.tolga.app.slidermvvmkotlin.R.layout.activity_main:
 {
                        final Object tag = view.getTag();
                        if(tag == null) throw new java.lang.RuntimeException("view must have a tag");
                    if ("layout/activity_main_0".equals(tag)) {
                            return new com.tolga.app.slidermvvmkotlin.databinding.ActivityMainBinding(bindingComponent, view);
                    }
                        throw new java.lang.IllegalArgumentException("The tag for activity_main is invalid. Received: " + tag);
                }
                case com.tolga.app.slidermvvmkotlin.R.layout.fragment_main:
 {
                        final Object tag = view.getTag();
                        if(tag == null) throw new java.lang.RuntimeException("view must have a tag");
                    if ("layout/fragment_main_0".equals(tag)) {
                            return new com.tolga.app.slidermvvmkotlin.databinding.FragmentMainBinding(bindingComponent, view);
                    }
                        throw new java.lang.IllegalArgumentException("The tag for fragment_main is invalid. Received: " + tag);
                }
        }
        return null;
    }
    @Override
    public android.databinding.ViewDataBinding getDataBinder(android.databinding.DataBindingComponent bindingComponent, android.view.View[] views, int layoutId) {
        switch(layoutId) {
        }
        return null;
    }
    @Override
    public int getLayoutId(String tag) {
        if (tag == null) {
            return 0;
        }
        final int code = tag.hashCode();
        switch(code) {
            case 1190271434: {
                if(tag.equals("layout/item_cur_0")) {
                    return com.tolga.app.slidermvvmkotlin.R.layout.item_cur;
                }
                break;
            }
            case 1887791074: {
                if(tag.equals("layout-v21/item_cur_0")) {
                    return com.tolga.app.slidermvvmkotlin.R.layout.item_cur;
                }
                break;
            }
            case 423753077: {
                if(tag.equals("layout/activity_main_0")) {
                    return com.tolga.app.slidermvvmkotlin.R.layout.activity_main;
                }
                break;
            }
            case -985887980: {
                if(tag.equals("layout/fragment_main_0")) {
                    return com.tolga.app.slidermvvmkotlin.R.layout.fragment_main;
                }
                break;
            }
        }
        return 0;
    }
    @Override
    public String convertBrIdToString(int id) {
        if (id < 0 || id >= InnerBrLookup.sKeys.length) {
            return null;
        }
        return InnerBrLookup.sKeys[id];
    }
    private static class InnerBrLookup {
        static String[] sKeys = new String[]{
            "_all"
            ,"viewModel"};
    }
}