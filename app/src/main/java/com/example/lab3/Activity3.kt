package com.example.lab3

import android.os.Bundle



import com.example.lab3.databinding.Activity3Binding

class Activity3 : BaseActivity() {
    private lateinit var binding: Activity3Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = Activity3Binding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.bnToFirst.setOnClickListener {
            setResult(RESULT_OK)
            finish()
        }
        binding.bnToSecond.setOnClickListener {
            finish()
        }
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

}