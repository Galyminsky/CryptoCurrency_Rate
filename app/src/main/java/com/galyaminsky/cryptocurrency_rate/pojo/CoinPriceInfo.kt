package com.galyaminsky.cryptocurrency_rate.pojo

import androidx.annotation.NonNull
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.galyaminsky.cryptocurrency_rate.api.ApiFactory.BASE_IMAGE_URL
import com.galyaminsky.cryptocurrency_rate.utils.convertTimestampToTime
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


@Entity(tableName = "full_price_list")
data class CoinPriceInfo(

    @SerializedName("TYPE")
    @Expose
    val type: String? = null,

    @SerializedName("MARKET")
    @Expose
    val market: String? = null,

    @PrimaryKey
    @SerializedName("FROMSYMBOL")
    @Expose
    @NonNull
    val fromSymbol: String,

    @SerializedName("TOSYMBOL")
    @Expose
    val toSymbol: String? = null,

    @SerializedName("FLAGS")
    @Expose
    val flags: String? = null,

    @SerializedName("LASTMARKET")
    @Expose
    val lastMarket: String? = null,

    @SerializedName("MEDIAN")
    @Expose
    val median: Double? = null,

    @SerializedName("TOPTIERVOLUME24HOUR")
    @Expose
    val topTierVolume24Hour: Double? = null,

    @SerializedName("TOPTIERVOLUME24HOURTO")
    @Expose
    val topTierVolume24Hourto: Double? = null,

    @SerializedName("LASTTRADEID")
    @Expose
    val lastTradeId: String? = null,

    @SerializedName("PRICE")
    val price: Double? = null,

    @SerializedName("LASTUPDATE")
    val lastUpdate: Long? = null,

    @SerializedName("LASTVOLUME")
    val lastVolume: Double? = null,

    @SerializedName("LASTVOLUMETO")
    @Expose
    val lastVolumeTo: Double? = null,

    @SerializedName("VOLUMEHOUR")
    @Expose
    val volumeHour: Double? = null,

    @SerializedName("VOLUMEHOURTO")
    @Expose
    val volumeHourTo: Double? = null,

    @SerializedName("OPENHOUR")
    @Expose
    val openHour: Double? = null,

    @SerializedName("HIGHHOUR")
    @Expose
    val highHour: Double? = null,

    @SerializedName("LOWHOUR")
    @Expose
    val lowHour: Double? = null,

    @SerializedName("VOLUMEDAY")
    @Expose
    val volumeDay: Double? = null,

    @SerializedName("VOLUMEDAYTO")
    @Expose
    val volumeDayTo: Double? = null,

    @SerializedName("OPENDAY")
    @Expose
    val openDay: Double? = null,

    @SerializedName("HIGHDAY")
    @Expose
    val highDay: Double? = null,

    @SerializedName("LOWDAY")
    @Expose
    val lowDay: Double? = null,

    @SerializedName("VOLUME24HOUR")
    @Expose
    val volume24Hour: Double? = null,

    @SerializedName("VOLUME24HOURTO")
    @Expose
    val volume24HourTo: Double? = null,

    @SerializedName("OPEN24HOUR")
    @Expose
    val open24Hour: Double? = null,

    @SerializedName("HIGH24HOUR")
    @Expose
    val high24Hour: Double? = null,

    @SerializedName("LOW24HOUR")
    @Expose
    val low24Hour: Double? = null,

    @SerializedName("CHANGE24HOUR")
    @Expose
    val change24Hour: Double? = null,

    @SerializedName("CHANGEPCT24HOUR")
    @Expose
    val changePct24Hour: Double? = null,

    @SerializedName("CHANGEDAY")
    @Expose
    val changeDay: Double? = null,

    @SerializedName("CHANGEPCTDAY")
    @Expose
    val changePctDay: Double? = null,

    @SerializedName("CHANGEHOUR")
    @Expose
    val changeHour: Double? = null,

    @SerializedName("CHANGEPCTHOUR")
    @Expose
    val changePctHour: Double? = null,

    @SerializedName("CONVERSIONTYPE")
    @Expose
    val conversionType: String? = null,

    @SerializedName("CONVERSIONSYMBOL")
    @Expose
    val conversionSymbol: String? = null,

    @SerializedName("CONVERSIONLASTUPDATE")
    @Expose
    val conversionLastUpdate: Long? = null,

    @SerializedName("SUPPLY")
    @Expose
    val supply: Long? = null,

    @SerializedName("MKTCAP")
    @Expose
    val mktCap: Double? = null,

    @SerializedName("MKTCAPPENALTY")
    @Expose
    val mktCapPenalty: Long? = null,

    @SerializedName("CIRCULATINGSUPPLY")
    @Expose
    val circulatingSupply: Long? = null,

    @SerializedName("CIRCULATINGSUPPLYMKTCAP")
    @Expose
    val circulatingSupplymktCap: Double? = null,

    @SerializedName("TOTALVOLUME24H")
    @Expose
    val totalVolume24H: Double? = null,

    @SerializedName("TOTALVOLUME24HTO")
    @Expose
    val totalVolume24Hto: Double? = null,

    @SerializedName("TOTALTOPTIERVOLUME24H")
    @Expose
    val totalTopTierVolume24H: Double? = null,

    @SerializedName("TOTALTOPTIERVOLUME24HTO")
    @Expose
    val totalTopTierVolume24Hto: Double? = null,

    @SerializedName("IMAGEURL")
    @Expose
    val imageUrl: String? = null,
) {
    fun getFormattedTime(): String {
        return convertTimestampToTime(lastUpdate)
    }

    fun getFullImageUrl(): String {
        return BASE_IMAGE_URL + imageUrl
    }
}
