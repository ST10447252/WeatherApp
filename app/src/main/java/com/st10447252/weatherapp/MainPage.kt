package com.st10447252.weatherapp

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.EditText
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlin.math.max

class MainPage : AppCompatActivity() {
   private val dayList = ArrayList<String>()
    private val HighTempList = ArrayList<Int>()
    private val LowTempList = ArrayList<Int>()
    private val VibesList = ArrayList<String>()

    private val dataList = ArrayList<String>()
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {


        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main_page)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val Day = findViewById<EditText>(R.id.userInput_day)
        val HighTemp = findViewById<EditText>(R.id.userInputMaxTemp)
        val LowTemp = findViewById<EditText>(R.id.userInput_minTemp)
        val Conditions = findViewById<EditText>(R.id.userInput_Vibes)

        val add_button = findViewById<ImageButton>(R.id.add_button)
        val clear_button = findViewById<ImageButton>(R.id.clear_button)
        val detailView = findViewById<ImageButton>(R.id.detail_button)

        add_button.setOnClickListener {
            val day = Day.text.toString()
            val maxTemp = HighTemp.text.toString()
            val minTemp = LowTemp.text.toString()
            val Vibes = Conditions.text.toString()

            if (day.isEmpty() || maxTemp.isEmpty() || minTemp.isEmpty() || Vibes.isEmpty()){

            }
            else{
                try {
                    val maxtemp = maxTemp.toInt()
                    val mintemp = minTemp.toInt()
                    val data = "day: $day, HighTemp: $maxtemp, LowTemp: $mintemp, Conditions: $Vibes"
                    dataList.add(data)
                    dayList.add(day)
                    HighTempList.add(maxtemp)
                    LowTempList.add(mintemp)
                    VibesList.add(Vibes)
                    Day.text.clear()
                    HighTemp.text.clear()
                    LowTemp.text.clear()
                    Conditions.text.clear()
                } catch (e: Exception){

                }
            }
        }

        clear_button.setOnClickListener{
            Day.text.clear()
            HighTemp.text.clear()
            LowTemp.text.clear()
            Conditions.text.clear()
        }

        detailView.setOnClickListener {
            val detailed_Page = Intent(this, detailedView::class.java).apply {
                putStringArrayListExtra("dataList", dataList)
                putStringArrayListExtra("day", dayList)
                putIntegerArrayListExtra("LowTemp", LowTempList.map { it.toString() } as ArrayList<Int> )
                putIntegerArrayListExtra("HighTemp",HighTempList.map { it.toString() } as ArrayList<Int> )
                putStringArrayListExtra("Conditions", VibesList)
            }
            startActivity(detailed_Page)
        }

    }
}




