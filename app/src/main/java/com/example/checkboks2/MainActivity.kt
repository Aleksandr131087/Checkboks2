package com.example.checkboks2

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.CheckBox
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private lateinit var textTV: TextView
    private lateinit var checkBox: CheckBox
    private lateinit var textTV2: TextView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textTV = findViewById(R.id.textTV)
        checkBox = findViewById(R.id.checkBox)
        textTV2 = findViewById(R.id.textTV2)

        checkBox.setOnCheckedChangeListener {buttonView, isChecked ->

            if (isChecked){
                textTV.text = "Правила дорожного движения"
                textTV2.text = """
                1. Сел за руль - пристегнись. 
                2. Пропусти пешехода.
                3. Включай поворотник.
                4. Соблюдай скоростной режим.
                """
                    .trimIndent()

            }
            else {textTV.text = "Информация"
            textTV2.text = ""}
        }
        }
    }