package com.example.hello

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.layout_variable.*
import java.text.SimpleDateFormat
import java.util.*

class VariableKotlinActivity : AppCompatActivity() {
    var clickCount = 0;
    val starTime = System.currentTimeMillis()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_variable)

        val timeText = SimpleDateFormat("HH:mm:ss", Locale.KOREA).format(starTime)
        startTimeLabel.text = "Activity 시작시간: ${timeText}"
        clickCountLabel.text = "버튼이 클릭된 횟수: ${clickCount}"

        button.setOnClickListener{
            clickCount = clickCount + 1
            clickCountLabel.text = "버튼이 클릭된 횟수: ${clickCount}"
        }
    }
}
