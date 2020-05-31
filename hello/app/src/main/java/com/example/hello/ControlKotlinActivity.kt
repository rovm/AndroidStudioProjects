package com.example.hello

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.layout_control.*

class ControlKotlinActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_control)

        // 버튼이 클릭되었을때의 이벤트리스너를 설정한다.
        button.setOnClickListener {
            //numberField의 값을 읽어 int 형으로 반환한다.
            val number = numberField.text.toString().toInt()

            //if, else if, else 문으로 2의 배수, 3의 배수를 체크해 서로 다른 토스트 메세지를 보여준다.
//            if(number % 2 == 0){
//                Toast.makeText(applicationContext, "${number} 는 2의 배수입니다.", Toast.LENGTH_SHORT).show()
//            } else if(number % 3 == 0){
//                Toast.makeText(applicationContext, "${number} 는 3의 배수입니다.", Toast.LENGTH_LONG).show()
//            } else {
//                Toast.makeText(applicationContext, "${number}", Toast.LENGTH_LONG).show()
//            }

            //when 문은 케이스로 조건식도 사용 가능
            when {
                number % 2 == 0 -> Toast.makeText(applicationContext, "${number} 는 2의 배수입니다.", Toast.LENGTH_SHORT).show()
                number % 3 == 0 ->  Toast.makeText(applicationContext, "${number} 는 3의 배수입니다.", Toast.LENGTH_LONG).show()
                else -> Toast.makeText(applicationContext, "${number}", Toast.LENGTH_LONG).show()
            }

            //코틀린에서는 switch 문을 대체해 when을 사용할 수 있다.
            when (number){
                in 1..4 -> button.text = "실행 - 4"
                9 , 18-> {
                    button.text = "실행 - 9"
                }
                else -> button.text = "실행"
            }
        }
    }
}

/*
05 kotlin 반복문 활용
for(item in collection){
    println(item)
} // Java 의 향상된 포문과 비슷

for(i in 0..100){
    println(i)
} // 특정값을 반복하기

val collection = mutableListOf<String>("apple","banana")
for((index, value) in collection.withIndex()){
    println("the element at $index is $value")
}

var x = 0
while(x < 4){
    x++
}

do{
    val y = retrieveData()
}while(y != null) // do 블럭 내부의 변수 y에 접근가능
// 여기서부터는 y에 접근 불가

// 레이블 @는 break, return 이후 어디로 점프하는지 마킹하고 이동
loop1@ while(true){
    var x = retrieveData()

    if(x == null) break@loop1
    else{
        loop2@ while(true){
            var y = getData()
            if(y == null) break@loop2
        }
    }
}

@loop for(i in 1..100){
    for(j in 1..100){
        if(...) break@loop
    }
}

@Test
fun loopContinueTest(){
    for(i in 1..10){
        if(i % 2 == 0) continue
        print(i)
    }
}
 */

/*
4.6.01 함수선언 방법
kotlin
fun function(){} // 기본형
fun function(age:int){} // 기본형
fun function(age:int):int int{ return 0} // return 타입이 int형인 경우
코틀린의 경우 리턴값이 없는 경우 void는 Unit 타입으로 있는데 생략가능
*/