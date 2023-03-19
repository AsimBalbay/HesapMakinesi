package com.example.ktxsimplecalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.ktxsimplecalculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.sumButton.setOnClickListener {
            mySum()
        }

        binding.subButton.setOnClickListener {
            mySub()
        }

        binding.divButton.setOnClickListener {
            myDiv()
        }

        binding.multiplyButton.setOnClickListener {
            myMultiply()
        }
    }

    fun mySum() {
        if (binding.editTextNumber.text.isNotEmpty() && binding.editTextNumber2.text.isNotEmpty()) {
            val number = binding.editTextNumber.text.toString().toInt()
            val number2 = binding.editTextNumber2.text.toString().toInt()
            val result = number + number2

            binding.resultText.text = "Result: $result"
        } else {
            Toast.makeText(this, "Alanlar boş", Toast.LENGTH_LONG).show()
        }

    }

    fun mySub() {
        if (binding.editTextNumber.text.isNotEmpty() && binding.editTextNumber2.text.isNotEmpty()) {
            val number = binding.editTextNumber.text.toString().toInt()
            val number2 = binding.editTextNumber2.text.toString().toInt()
            val result = number - number2

            binding.resultText.text = "Result: $result"
        } else {
            Toast.makeText(this, "Alanlar boş", Toast.LENGTH_LONG).show()
        }
    }

    fun myMultiply() {
        if (binding.editTextNumber.text.isNotEmpty() && binding.editTextNumber2.text.isNotEmpty()) {
            val number = binding.editTextNumber.text.toString().toInt()
            val number2 = binding.editTextNumber2.text.toString().toInt()
            val result = number * number2

            binding.resultText.text = "Result: $result"
        } else {
            Toast.makeText(this, "Alanlar boş", Toast.LENGTH_LONG).show()
        }
    }

    fun myDiv() {
        if (binding.editTextNumber.text.isNotEmpty() && binding.editTextNumber2.text.isNotEmpty()) {
            val number = binding.editTextNumber.text.toString().toInt()
            val number2 = binding.editTextNumber2.text.toString().toInt()
            val result = number / number2

            binding.resultText.text = "Result: $result"
        } else {
            Toast.makeText(this, "Alanlar boş", Toast.LENGTH_LONG).show()
        }
    }
}