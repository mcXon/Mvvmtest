package com.example.mvvmtest.model

import com.example.mvvmtest.model.cats.remote.CatsResponse

/**
 * Remove data source responsibility from the ViewModel
 */
class Repository {
    fun getCats(){

    }

    fun getDogs(){

    }

    fun getAxolotl(){

    }

    fun createPresentationData(){

    }

    sealed class PresentationData(){
        data class CatsPresentation(val dataSet : List <CatsResponse>) : PresentationData()
    }

}