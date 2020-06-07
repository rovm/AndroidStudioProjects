package com.example.createlottonumber

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main_screen.*

class MainScreen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_screen)

//        setBtn.setOnClickListener {
//            val intent =  Intent(this@MainScreen, SettingScreen::class.java)
//            startActivity(intent)
//        }
    }

    fun goSettingScreen(view: View){
        //intent(pacakge context, 타겟이 되는 구성요소의 Class)
        val intent =  Intent(this@MainScreen, SettingScreen::class.java)
        startActivity(intent)
    }

    fun callWeb(view: View){
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.dhlottery.co.kr/gameResult.do?method=byWin&wiselog=H_C_1_1"))
        startActivity(intent)
    }
}
