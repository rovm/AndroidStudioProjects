package com.example.hello;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class BmiJavaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //  UI로 사용할 레이아웃 XML 파일을 지정
        setContentView(R.layout.layout_view_binding);

        // bmiButton 이 클릭된 경우의 이벤트 리스너를 등록한다.
        findViewById(R.id.bmiButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText tallField = findViewById(R.id.tallFileld);
                String tall = tallField.getText().toString();

                EditText weightField = findViewById(R.id.weightField);
                String weight = weightField.getText().toString();

                double bmi = Double.parseDouble(weight) / Math.pow(Double.parseDouble(tall) / 100.0 ,2);

                // 결과 bmi 를 resultLabel에 보여준다.
                TextView resultLabel = findViewById(R.id.resultLabel);
                resultLabel.setText("키: " + tall + ", 체중: " + weight + ", BMI: " + bmi);
            }
        });
    }
}
