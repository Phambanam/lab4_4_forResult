package com.example.lab3
import android.content.Intent
import android.os.Bundle

import com.example.lab3.databinding.Activity1Binding

class MainActivity : BaseActivity(){
    private lateinit var binding: Activity1Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = Activity1Binding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.bnToSecond.setOnClickListener {
           switchToActivity2()
        }
    }
    private fun switchToActivity2() {
        val intent = Intent(this, Activity2::class.java)
        startActivity(intent)
    }

}