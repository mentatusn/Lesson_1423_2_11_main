package ru.geekbrains.lesson_1423_2_11_main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import java.lang.IllegalStateException

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        when(BuildConfig.field1){
            3->        findViewById<TextView>(R.id.textView).text = "Здравствуйте company1"
            4->        findViewById<TextView>(R.id.textView).text =  "Здравствуйте company2"
        }
    }
}