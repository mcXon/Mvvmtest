package com.example.mvvmtest.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.mvvmtest.model.Repository
import com.example.mvvmtest.model.cats.remote.CatsResponse
import com.example.mvvmtest.model.common.Network
import io.reactivex.rxjava3.core.Observable


//surviving configuration changes


class AnimalsViewModel : ViewModel() {

    // Update / Modify the mutable live data container
    private val _animals = MutableLiveData<Repository.PresentationData>()
    // Expose immutable live data to the view
    val animals : LiveData<Repository.PresentationData>
    get() = _animals

    //called after the constructo initialization
    init {
//        _animals.postValue(repo.getData)
        Network.catsApi.getCatFacts()
    }

    fun getCatFacts():Observable<List<CatsResponse>>{
        return Network.catsApi.getCatFacts()
    }
}