package com.example.lab3

import android.content.Intent
import android.os.Bundle



import com.example.lab3.databinding.Activity3Binding

class Activity3 : BaseActivity() {
    private lateinit var binding: Activity3Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = Activity3Binding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.bnToFirst.setOnClickListener {
            switchToActivity1()
        }
        binding.bnToSecond.setOnClickListener {
            switchToActivity2()
        }
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
    private fun switchToActivity2() {
        val intent = Intent(this, Activity2::class.java)
        intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP
        startActivity(intent)
    }
    private fun switchToActivity1(){
        val intent = Intent(this, MainActivity::class.java)
        intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP
        startActivity(intent)
    }
}