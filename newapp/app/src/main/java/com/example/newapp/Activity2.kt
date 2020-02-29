package com.example.newapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class Activity2 : AppCompatActivity() {

    var score=0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)
        val intent= this.intent
        score= intent.getIntExtra("score", 0)
    }

    fun next2(view: View) {

        val intent= Intent(this, Activity3::class.java)
        score=score+1
        intent.putExtra("score", score)
        startActivity(intent)
    }

    fun incorrect2(view: View) {
        score=score
        Toast.makeText(this@Activity2,"Неверно", Toast.LENGTH_SHORT).show()
        val intent= Intent(this, Activity3::class.java)
        intent.putExtra("score", score)
        startActivity(intent)
    }
}
