package com.example.hello

class PropertySample {
    var name: String
    //setter 에서는 print 함수를 호출
    set(value: String){
        print("set")
    }//무조건 "Alice"문자열을 반환
    get():String{
        return "Alice"
    }
}