package com.example.firstkotlinapp.mvvm

import com.example.myapplicationa4.retrofit.jsonClass
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Query

interface ObservableRetrofit {
    @GET("timingsByCity")
    //http://api.aladhan.com/v1/timingsByCity?city=Tehran&country=Iran&method=8
    fun getTimings(@Query("city")city: String,
                   @Query("country")country: String,
                   @Query("method")method: Int)
            : Observable<jsonClass>
}