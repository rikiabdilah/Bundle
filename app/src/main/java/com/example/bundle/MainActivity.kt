package com.example.bundle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.bundle.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.saveBtn.setOnClickListener {
            val name = binding.name.text.toString()
            val age = 2023 - binding.tahunLahir.text.toString().toInt()
            val secondActivity = Intent(this, dataBundle::class.java)
            val bundle = Bundle()
            bundle.putString("name", name)
            bundle.putInt("age", age)
            secondActivity.putExtras(bundle)
            startActivity(secondActivity)
        }
    }
}