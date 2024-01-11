package com.example.greeting

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import androidx.activity.ComponentActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.greeting.data.Location
import com.example.greeting.data.createRealJejuLocationData
import com.example.greeting.ui.theme.adapters.LocationAdapter

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.recyle_exam)

        // RecylerView 인스턴스를 가져옵니다.
        val recyclerView: RecyclerView = findViewById(R.id.recyclerView2)

        // LayoutManager를 설정합니다.
        recyclerView.layoutManager = LinearLayoutManager(this)

        // Adapter를 설정합니다.
        val locationAdapter = LocationAdapter(sampleLocations)
        recyclerView.adapter = locationAdapter

        //val sendButton = findViewById<Button>(R.id.sendButton)

        //sendButton.setOnClickListener {
            //val sendText = findViewById<EditText>(R.id.sendText)
            //val sendMessage = sendText.text.toString()
            //val sendIntent = Intent(this, SubActivity::class.java)
            //sendIntent.putExtra("message", sendMessage)

            //startActivity(sendIntent)
        //}
    }
}

// 예제 데이터 사용
val sampleLocations = createRealJejuLocationData()

