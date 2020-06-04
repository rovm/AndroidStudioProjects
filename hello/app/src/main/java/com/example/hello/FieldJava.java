package com.example.hello;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class FieldJava{

    public int field1;
    private double field2;
    protected String filed3;

    private int field4;

    public int getField4(){
        return field4;
    }

    public void setField4(int field4){
        this.field4 = field4;
    }

    static int notField1;

    void func1(){
        int notField2 = 0;
    }
}
