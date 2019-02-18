package com.tolga.app.slidermvvmkotlin.service.response

import com.google.gson.annotations.SerializedName

data class CurResponse(

	@field:SerializedName("Cur_ID")
	val curID: Int? = null,

	@field:SerializedName("Cur_Name_EngMulti")
	val curNameEngMulti: String? = null,

	@field:SerializedName("Cur_Name")
	val curName: String? = null,

	@field:SerializedName("Cur_Name_Bel")
	val curNameBel: String? = null,

	@field:SerializedName("Cur_ParentID")
	val curParentID: Int? = null,

	@field:SerializedName("Cur_Code")
	val curCode: String? = null,

	@field:SerializedName("Cur_Abbreviation")
	val curAbbreviation: String? = null,

	@field:SerializedName("Cur_Periodicity")
	val curPeriodicity: Int? = null,

	@field:SerializedName("Cur_DateStart")
	val curDateStart: String? = null,

	@field:SerializedName("Cur_QuotName_Eng")
	val curQuotNameEng: String? = null,

	@field:SerializedName("Cur_QuotName")
	val curQuotName: String? = null,

	@field:SerializedName("Cur_Name_Eng")
	val curNameEng: String? = null,

	@field:SerializedName("Cur_Name_BelMulti")
	val curNameBelMulti: String? = null,

	@field:SerializedName("Cur_DateEnd")
	val curDateEnd: String? = null,

	@field:SerializedName("Cur_NameMulti")
	val curNameMulti: String? = null,

	@field:SerializedName("Cur_QuotName_Bel")
	val curQuotNameBel: String? = null,

	@field:SerializedName("Cur_Scale")
	val curScale: Int? = null

)
