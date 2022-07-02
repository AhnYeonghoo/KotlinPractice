package com.yeong.databinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.yeong.databinding.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        var binding : ActivityMainBinding? = null

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

//        val btn = findViewById<Button>(R.id.testBtnId)
//        btn.setOnClickListener {
//            Toast.makeText(this, "click", Toast.LENGTH_LONG).show()
//        }

        binding.testBtnId.setOnClickListener {
            Toast.makeText(this, "click", Toast.LENGTH_LONG).show()
        }
        val test = "test value"

        Log.e("MainActivity", test)
        Log.w("MainActivity", test)
        Log.i("MainActivity", test)
        Log.d("MainActivity", test)
        Log.v("MainActivity", test)




    }
}