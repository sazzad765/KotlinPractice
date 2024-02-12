package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.myapplication.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var value: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        binding.include.toolbar.title = "Test"
        binding.textView.text = value.toString()
        binding.button.setOnClickListener { increment() }
    }


    private fun increment() {
        value++
        binding.textView.text = value.toString()
        Log.d("TAG", "increment: $value")
    }
}