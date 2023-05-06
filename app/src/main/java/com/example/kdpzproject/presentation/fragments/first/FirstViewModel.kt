package com.example.kdpzproject.presentation.fragments.first

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.kdpzproject.data.domain.AnimeUseCase
import com.example.kdpzproject.data.models.CatAttributes
import kotlinx.coroutines.launch

class FirstViewModel: ViewModel(){

    private val _catLiveData = MutableLiveData<List<CatAttributes>>()
    val catLiveData: LiveData<List<CatAttributes>> = _catLiveData

    private val _isLoading = MutableLiveData<Boolean>()
    val isLoading: LiveData<Boolean> = _isLoading


    init{
        getAnimeData()
    }

    fun getAnimeData()
    {
        viewModelScope.launch {
            _isLoading.postValue(true)
            val cat = AnimeUseCase.getCat()
            _catLiveData.postValue(cat.data)
            _isLoading.postValue(false)
        }
    }



}