package com.example.bundle

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.bundle.databinding.ActivityDataBundleBinding

class dataBundle : AppCompatActivity() {
    lateinit var binding : ActivityDataBundleBinding
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDataBundleBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val bundle = intent.extras
        binding.halo.text = "Halo, " + bundle!!.getString("name")
        binding.umur.text = "Umur kamu " + bundle.getInt("age")
    }
}