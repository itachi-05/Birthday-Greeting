package com.example.birthdaygreeting

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun birthdayGreeted(view: View) {
        val name = my_name.editableText.toString()
        if(name.isEmpty()){
            Toast.makeText(this,"Please enter name",Toast.LENGTH_SHORT).show()
        }
        else{
            val intent = Intent(this, BirthdayGreeting::class.java)
            intent.putExtra("name", name)
            startActivity(intent)
            val n: EditText = findViewById(R.id.my_name)
            n.text.clear()
            Toast.makeText(applicationContext, "Name was $name", Toast.LENGTH_SHORT).show()
        }
    }
}