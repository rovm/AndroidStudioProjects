package com.example.hello;

import org.junit.Assert;
import org.junit.Test;

public class JavaTest {
    @Test
    public void test1(){
        Assert.assertEquals(4, 2+2);
    }

    @Test
    public void testGetterSetter(){
        //personJava 클래스의 객체를 생성하고 이름을 "John" 나이를 20으로 설정
        PersonJava personJava = new PersonJava("john");
        personJava.setAge(20);

        //설정한 값이 정상적인지 테스트
        Assert.assertEquals(20, personJava.getAge());
        Assert.assertEquals("john", personJava.getName());

        //코틀린의 Pesron 객체를 생성하고 이름을 john 나이를 20으로 설정
        Person person = new Person("john");
        person.setAge(20);

        //설정한 값이 정상적인지 테스트
        Assert.assertEquals(20, person.getAge());
        Assert.assertEquals("john", person.getName());
    }

    @Test
    public void testSetNickname(){
        //자바로 작성한 PersonJava 클래스의 객체 생성
        PersonJava personJava = new PersonJava("john");

        //대문자가 포함된 문자열을 닉네임으로 설정해도 소문자로 저정한다.
        personJava.setNickname("Apple");

        //대문자가 포함된 문자열이 소문자로 되었는지 확인
        Assert.assertEquals("apple", personJava.getNickname());

        //코틀린으로 작성한 Person 클래스 생성
        Person person = new Person("john");

        //대문자가 포함된 문자열을 닉네으로 설정해도 소문자로 저장한다.
        person.setNickname("Apple");

        //대문자가 포함된 문자열이 소문자로 되었는지 확인
        Assert.assertEquals("apple", person.getNickname());
    }

}
