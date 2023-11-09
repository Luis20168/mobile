package com.luis.loginrpm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.luis.loginrpm.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        val screenSplash= installSplashScreen()
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        screenSplash.setKeepOnScreenCondition{false}




        binding.btnLogin.setOnClickListener {
            var name= binding.email.text.toString()
            Toast.makeText(this, "Btn login funciona ${name}", Toast.LENGTH_SHORT).show()

        }



    }
}