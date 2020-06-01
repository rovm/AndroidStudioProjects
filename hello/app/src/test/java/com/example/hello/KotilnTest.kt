package com.example.hello

import android.content.PeriodicSync
import org.junit.Assert
import org.junit.Test

class KotilnTest{
    @Test
    fun test1(){
        Assert.assertEquals(4,2+2)
    }

    @Test
    fun testGetterSetter(){
        //코틀린의 Person 객체를 생성하고 이름을 john 으로 설정
        val person = Person("john")

        //코틀린은 age 를 직접 사용해도 자동으로 setter 가 불린다.
        person.age = 20

        //설정값이 정상적인지 테스트
        //마찬가지로 직접 프로퍼티 접근해도 자동으로 getter 가 불린다.
        Assert.assertEquals(20, person.age)
        Assert.assertEquals("john", person.name)
    }

    @Test
    fun testSetNicknmae(){
        val person = Person("john")

        person.nickname = "Banana"

        Assert.assertEquals("banana", person.nickname)
    }
}