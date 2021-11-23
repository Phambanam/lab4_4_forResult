package com.example.lab3

import android.content.Intent
import android.os.Bundle

import com.example.lab3.databinding.Activity2Binding


class Activity2 : BaseActivity() {
    private lateinit var binding: Activity2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = Activity2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.bnToFirst.setOnClickListener {
            switchToActivity1()
        }
        binding.bnToThird.setOnClickListener {
           switchToActivity3()
        }
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == 1 && resultCode == RESULT_OK) {
            finish()
        }
    }
    private fun switchToActivity3() {
        val intent = Intent(this, Activity3::class.java)
        startActivityForResult(intent,1  )
    }
    private fun switchToActivity1(){
        val intent = Intent(this,MainActivity::class.java)
        intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP
        startActivity(intent)
    }

}