package com.galyaminsky.cryptocurrency_rate.pojo

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class CoinInfoListOfData(

    @SerializedName("Data")
    @Expose
    val data: List<Datum>? = null

)
