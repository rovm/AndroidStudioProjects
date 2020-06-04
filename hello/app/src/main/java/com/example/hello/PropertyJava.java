package com.example.hello;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class PropertyJava{
    //field가 선언되어 있고 setter, getter가 있는경우 property
    private int property1 =0;

    public int getProperty1(){
        return property1;
    }

    public void setProperty1(int property1){
        this.property1 = property1;
    }

    //변수 값을 읽을수만 있는경우에도 property
    private String property2 = "";

    public String getProperty2(){
        return property2;
    }

    //단순 field는 property 가 아니다
    private int notProperty = 0;

    //클래스 변수 역시 property가 아님
    private static int notProperty2;
}
