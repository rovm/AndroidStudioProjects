package com.example.hello;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Locale;

public class VariableJavaActivity extends AppCompatActivity {
    int clickCount = 0; //버튼이 클릭된 횟수를 저장할 변수
    long startTime = System.currentTimeMillis(); //Activity 시작 시간을 저장하는 변수

    TextView startTimeLabel; // 시작 시간을 보여주는 TextView
    TextView clickCountLabel; // 클릭된 횟수를 보여주는 TextView
    Button button; // 클릭 버튼

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //UI로 사용할 레이아웃을 XML 파일을 저장한다
        setContentView(R.layout.layout_variable);

        startTimeLabel = findViewById(R.id.startTimeLabel);
        clickCountLabel = findViewById(R.id.clickCountLabel);
        button = findViewById(R.id.button);
        String timeText = new SimpleDateFormat("HH:mm:ss", Locale.KOREA).format(startTime);

        startTimeLabel.setText("Activity 시작시간: " + timeText);
        clickCountLabel.setText("버튼이 클릭된 횟수: " + clickCount);

        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                clickCount = clickCount +1;
                clickCountLabel.setText("버튼이 클릭된 횟수: " + clickCount);
            }
        });
    }
}
