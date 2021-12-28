package com.example.delevery_v2.ui.viewmodel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import org.mascota.data.repository.home.HomeRepository

class HomeViewModel(private val homeRepository: HomeRepository) : ViewModel() {
//    var imgUrl = ""
//
//    private val _homePart1 = MutableLiveData<ResHomePart1>()
//    val homePart1: LiveData<ResHomePart1>
//        get() = _homePart1
//
//    private val _homePart2 = MutableLiveData<ResHomePart2>()
//    val homePart2 : LiveData<ResHomePart2>
//        get() = _homePart2
//
//
//    fun getResHomePart1() = viewModelScope.launch {
//        runCatching { homeRepository.getHomePart1(MascotaSharedPreference.getUserId())}
//            .onSuccess {
//                _homePart1.postValue(it)
//                Log.d("fdadfs", it.toString())
//            }
//            .onFailure {
//                it.printStackTrace()
//            }
//    }
//
//    fun getResHomePart2() = viewModelScope.launch {
//        runCatching  { homeRepository.getHomePart2(MascotaSharedPreference.getUserId()) }
//            .onSuccess {
//                _homePart2.postValue(it)
//                Log.d("fdadfs", it.toString())
//            }
//            .onFailure {
//                it.printStackTrace()
//            }
//    }

}