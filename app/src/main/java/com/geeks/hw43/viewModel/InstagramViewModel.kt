package com.geeks.hw43.viewModel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.geeks.hw43.models.InstagramRepository
import com.geeks.hw43.models.InstagramResponse
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class InstagramViewModel: ViewModel() {

    private val repository = InstagramRepository()

    private val _instagramData = MutableLiveData<InstagramResponse>()
    val instagramLiveData: LiveData<InstagramResponse> get() = _instagramData

    fun fetchInstagramData(username: String) {
        viewModelScope.launch {
            try {
                val response = repository.getCurrentUser(username)
                _instagramData.value = response
            } catch (e: Exception) {
                Log.e("ololo", "fetchInstagramData: ${e.message}", )
            }
        }
    }
}