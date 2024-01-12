package com.example.greeting

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
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
        setContentView(R.layout.activity_main)

        val mapButton = findViewById<Button>(R.id.map_button)

        mapButton.setOnClickListener {
            val mapIntent = Intent (this, MapsActivity::class.java)
            startActivity(mapIntent)
        }
    }
}


// item_location.xml, recyle_exam.xml, Location.kt, LocationAdapter, LocationViewHolder
// 이 파일들과 관련된 제주도 관광명소 좌표를 불러오는 코드!
/*class MainActivity : ComponentActivity() {
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

    }

    // 예제 데이터 사용
    val sampleLocations = createRealJejuLocationData()

}*/

