package com.example.mvvmtest.model.cats.remote

import io.reactivex.rxjava3.core.Observable
import retrofit2.http.GET

//https://cat-fact.herokuapp.com/facts
interface ICatsApi {
    @GET(END_POINT)
    fun getCatFacts() : Observable<List<CatsResponse>>

    // expected Begin_Object but was Begin_Array


}