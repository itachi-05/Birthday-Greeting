package com.example.birthdaygreeting

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_birthday_greeting.*
import kotlinx.android.synthetic.main.activity_main.*

class BirthdayGreeting : AppCompatActivity() {

    companion object{
        const val NAME_EXTRA = "name_extra"
    }

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthday_greeting)

        val name = intent.getStringExtra("name")
        birthday_greetings.text = "Happy Birthday\n$name!"
    }
}