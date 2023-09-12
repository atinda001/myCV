package com.example.mycv

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mycv.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val rname = intent.getStringExtra("key_name")
        val rslack = intent.getStringExtra("key_slack")
        val rgit = intent.getStringExtra("key_git")
        val rbio = intent.getStringExtra("key_bio")
        //val rwork = intent.getStringExtra("key_work")

        binding.tvName.text = rname
        binding.tvslackName.text = rslack
        binding.tvGithub.text = rgit
        binding.tvBio.text = rbio

        binding.btnUpdate.setOnClickListener {
            val intent = Intent(this@MainActivity, CvDetails::class.java)
            startActivity(intent)
        }
    }
}