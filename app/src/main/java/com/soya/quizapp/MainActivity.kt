package com.soya.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnStartQuiz: Button = findViewById(R.id.btn_start_quiz)
        val etNameUser: EditText = findViewById(R.id.et_user_name)

        btnStartQuiz.setOnClickListener {
            this.requestName(etNameUser)
        }
    }

    private fun requestName(etNameUser: EditText) {
        if (etNameUser.text.isEmpty()) {
            Toast.makeText(this, "Please enter your name", Toast.LENGTH_LONG).show()
        } else {
            val intent = Intent(this, QuizQuestionsActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}