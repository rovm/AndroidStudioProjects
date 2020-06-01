package com.example.hello

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

//class Person{
//    //나이
//    var age: Int = 0
//    //이름
//    val name: String
//    //생성자에서 이름을 받는다
//    constructor(name: String){
//        this.name = name
//    }
//}

//이름을 생성자로 받는것을 표현
class Person(val name:String){
    //나이
    var age: Int = 0

    //닉네임 - 소문자만 허용
    var nickname: String = ""
        set(value){
            //field는 setter의 대상이 되는 field를 의미
            field = value.toLowerCase()
        }

}