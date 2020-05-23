package com.example.hello;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class BmiJavaActivity extends AppCompatActivity {
    //불필요한 findViewById 함수를 피하기 위해 UI 요소를 멤버 변수로 가지고 있는다.
    EditText tallField;
    EditText weightField;
    TextView resultLabel;
    Button bmiButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //  UI로 사용할 레이아웃 XML 파일을 지정
        setContentView(R.layout.layout_view_binding);

        tallField = findViewById(R.id.tallFileld);
        weightField = findViewById(R.id.weightField);
        resultLabel = findViewById(R.id.resultLabel);
        bmiButton = findViewById(R.id.bmiButton);

        // bmiButton 이 클릭된 경우의 이벤트 리스너를 등록한다.
        bmiButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String tall = tallField.getText().toString();

                String weight = weightField.getText().toString();

                double bmi = Double.parseDouble(weight) / Math.pow(Double.parseDouble(tall) / 100.0 ,2);

                // 결과 bmi 를 resultLabel에 보여준다.
                resultLabel.setText("키: " + tall + ", 체중: " + weight + ", BMI: " + bmi);
            }
         });
    }
}
