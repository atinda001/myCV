package com.example.mycv

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import com.example.mycv.databinding.ActivityCvDetailsBinding
import com.example.mycv.databinding.ActivityMainBinding

class CvDetails : AppCompatActivity() {
    private lateinit var binding : ActivityCvDetailsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCvDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val User1 = userInfo(
            name = "Samson Atinda",
            slackName = "Samson Atinda",
            gitHub = "Atinda001",
            bio = "hardworking young dev",
            workExperience = "IT Support"
        )
        binding.etName.setText(User1.name)
        binding.etSlackName.setText(User1.slackName)
        binding.etGithub.setText(User1.gitHub)
        binding.etBio.setText(User1.bio)
        binding.etWork.setText(User1.workExperience)

        /*val textWatcher = object : TextWatcher{
            override fun afterTextChanged(p0: Editable?) {
            when(p0.hashCode()){
                    binding.etName.hashCode() -> User1.name = p0.toString()
                    binding.etSlackName.hashCode() -> User1.slackName = p0.toString()
                    binding.etGithub.hashCode() -> User1.gitHub = p0.toString()
                    binding.etBio.hashCode() -> User1.bio = p0.toString()
                    binding.etWork.hashCode() -> User1.workExperience = p0.toString()
                }
              }
           }
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {}
            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

        }   */

        binding.etName.addTextChangedListener(object : TextWatcher{
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {}

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {}

            override fun afterTextChanged(p0: Editable?) {
                User1.name = p0.toString()
            }

        })

        binding.etSlackName.addTextChangedListener(object : TextWatcher{
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {}

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {}

            override fun afterTextChanged(p0: Editable?) {
                User1.slackName = p0.toString()
            }

        })

        binding.etGithub.addTextChangedListener(object : TextWatcher{
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {}

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {}

            override fun afterTextChanged(p0: Editable?) {
                User1.gitHub = p0.toString()
            }

        })

        binding.etBio.addTextChangedListener(object : TextWatcher{
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {}

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {}

            override fun afterTextChanged(p0: Editable?) {
                User1.bio = p0.toString()
            }

        })

        binding.btnSave.setOnClickListener {
            val intent = Intent(this@CvDetails, MainActivity::class.java)
            intent.putExtra("key_name", User1.name)
            intent.putExtra("key_slack", User1.slackName)
            intent.putExtra("key_git", User1.gitHub)
            intent.putExtra("key_bio", User1.bio)
            //intent.putExtra("key_work", User1.workExperience)
            startActivity(intent)
        }
    }
}