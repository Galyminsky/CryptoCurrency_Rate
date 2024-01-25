package com.galyaminsky.cryptocurrency_rate

import android.app.Application
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import com.galyaminsky.cryptocurrency_rate.api.ApiFactory
import com.galyaminsky.cryptocurrency_rate.database.AppDatabase
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.disposables.CompositeDisposable
import io.reactivex.rxjava3.schedulers.Schedulers

class CoinViewModel(application: Application) : AndroidViewModel(application) {

    private val db = AppDatabase.getInstance(application)
    private val compositeDisposable = CompositeDisposable()

    val priceList = db.CoinPriceInfoDao().getPriceList()

    fun loadData() {
        val disposable = ApiFactory.apiService.getTopCoinsInfo()
            .map { it.data?.map { it.coinInfo?.name }?.joinToString(",").toString() }
            .flatMap { ApiFactory.apiService.getFullPriceList(fSyms = it) }
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({
                Log.d("text_myLog", it.toString())
            }, {
                Log.d("text_myLog", it.message.toString())
            })
    }

    override fun onCleared() {
        super.onCleared()
        compositeDisposable.dispose()
    }
}