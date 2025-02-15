package com.geeks.hw43.activity

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.geeks.hw43.R
import com.geeks.hw43.databinding.ActivityMainBinding
import com.geeks.hw43.models.InstagramResponse
import com.geeks.hw43.viewModel.InstagramViewModel

class MainActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    private val viewModel: InstagramViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        viewModel.fetchInstagramData("beast")

        viewModel.instagramLiveData.observe(this) { response ->
            updateUi(response)
        }
    }

    private fun updateUi(response: InstagramResponse) {
        binding.apply {
            tvInstagram.text = response.username?.user ?: "User not found"
        }
    }
}