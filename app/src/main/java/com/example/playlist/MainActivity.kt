package com.example.playlist

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.playlist.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.apply {
            btnSearch.setOnClickListener {
                startActivity(Intent(this@MainActivity, SearchActivity::class.java))
            }
            btnMedia.setOnClickListener {
                startActivity(Intent(this@MainActivity, MediaActivity::class.java))
            }
            btnProperties.setOnClickListener {
                startActivity(Intent(this@MainActivity, PropertiesActivity::class.java))
            }
        }


    }
}