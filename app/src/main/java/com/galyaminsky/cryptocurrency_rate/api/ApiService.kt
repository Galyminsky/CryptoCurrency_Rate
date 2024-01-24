package com.galyaminsky.cryptocurrency_rate.api

import com.galyaminsky.cryptocurrency_rate.pojo.CoinInfoListOfData
import com.galyaminsky.cryptocurrency_rate.pojo.CoinPriceInfoRawData
import io.reactivex.rxjava3.core.Single
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET("top/totalvolfull")

    fun getTopCoinsInfo(
        @Query(QUERY_PARAM_API_KEY) apiKey: String = "ff6359a78c01facc581d3584a7a58573b6e1fccfa4db5003c9d4249d655ab369",
        @Query(QUERY_PARAM_LIMIT) limit: Int = 10,
        @Query(QUERY_PARAM_TO_SYMBOL) tSym: String = CURRENCY,

        ): Single<CoinInfoListOfData>

    @GET("pricemultifull")

    fun getFullPriceList(
        @Query(QUERY_PARAM_API_KEY) apiKey: String = "ff6359a78c01facc581d3584a7a58573b6e1fccfa4db5003c9d4249d655ab369",
        @Query(QUERY_PARAM_FROM_SYMBOLS) fSyms: String,
        @Query(QUERY_PARAM_TO_SYMBOLS) tSyms: String = CURRENCY

    ): Single<CoinPriceInfoRawData>

    companion object {
        private const val QUERY_PARAM_API_KEY = "api_key"
        private const val QUERY_PARAM_LIMIT = "limit"
        private const val QUERY_PARAM_TO_SYMBOL = "tsym"
        private const val QUERY_PARAM_TO_SYMBOLS = "tsyms"
        private const val QUERY_PARAM_FROM_SYMBOLS = "fsyms"
        private const val CURRENCY = "USD"
    }

}