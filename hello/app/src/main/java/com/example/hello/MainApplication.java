package com.example.hello;

import android.app.Application;
import android.content.Context;

//application 클래스를 상속 받는다.
//application 클래스는 앱이 실행될때 가장 먼저 실행되며 인스턴스만 존재한다.
//앱의 전역적으로 사용하는 상태 정보를 관리하는 기본 클래스
public class MainApplication extends Application {
    //applicationContext를 바인딩한다.
    private static Context applicationContext;

    //applicationCotext를 전역적으로 제공할 메소드
    public static Context getAppContext(){
        return applicationContext;
    }

    //앱이 최초 실행될때 호출한다.
    @Override
    public void onCreate(){
        super.onCreate();

        //static으로 선언된 applicatuionContext에 현재 실행중인
        //applicationCotext로 바인딩한다.
        applicationContext = getApplicationContext();
    }
}
