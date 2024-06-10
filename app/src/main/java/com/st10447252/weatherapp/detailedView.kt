package com.st10447252.weatherapp

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class detailedView : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_detailed_view)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val dayList = intent.getStringArrayListExtra("Day")?: arrayListOf()
        val LowTempList = intent.getIntegerArrayListExtra("LowTemp")?: arrayListOf()
        val HighTempList = intent.getIntegerArrayListExtra("HighTemp")?: arrayListOf()
        val Vibes = intent.getStringArrayListExtra("Conditions")?: arrayListOf()

        val detail_View = findViewById<TextView>(R.id.detail_textView)
        val average_view = findViewById<TextView>(R.id.average_textView)

        val dataList = intent.getStringArrayListExtra("dataList")
        detail_View.text = dataList?.joinToString(separator = "/n")

        var total = 0
        var display = ""
        for (i in dayList.indices){
            val totalWeather = LowTempList[i] + HighTempList[i]
            display += "Day:${dayList[i]}, LowTemp: ${LowTempList[i]}, HighTemp: ${HighTempList[i]}, Conditions: ${Vibes[i]}\n\n"
        }
        val averageForecast = if(dayList.isNotEmpty())
            total / dayList.size
        else 0

        detail_View.text = display
        average_view.text = "Average Forecast: $averageForecast"
    }
}