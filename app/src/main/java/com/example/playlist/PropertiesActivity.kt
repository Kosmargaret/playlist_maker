package com.example.playlist

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.playlist.databinding.ActivityPropertiesBinding

class PropertiesActivity : AppCompatActivity() {
    private lateinit var binding: ActivityPropertiesBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPropertiesBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.apply {
            btnBack.setOnClickListener {
                finish()
            }
        }
    }
}