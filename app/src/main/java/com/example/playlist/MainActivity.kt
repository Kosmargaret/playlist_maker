package com.example.playlist

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.playlist.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.apply {
            btnSearch.setOnClickListener(object:View.OnClickListener{
                override fun onClick(v: View?) {
                    Toast.makeText(applicationContext, "Вы нажали на кнопку поиск!", Toast.LENGTH_SHORT).show()
                }
            })
            btnMedia.setOnClickListener { Toast.makeText(applicationContext, "Вы нажали на кнопку медиатека!", Toast.LENGTH_SHORT).show() }
            btnProperties.setOnClickListener { Toast.makeText(applicationContext, "Вы нажали на кнопку настройки!", Toast.LENGTH_SHORT).show() }
        }
    }
}