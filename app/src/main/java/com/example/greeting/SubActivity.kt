package com.example.greeting

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SubActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub)

        val recieveIntent = getIntent()
        val recieveMassage = recieveIntent.getStringExtra("message")

        val textReceived = findViewById<TextView>(R.id.receivedText)
        textReceived.setText(recieveMassage)

    }
}