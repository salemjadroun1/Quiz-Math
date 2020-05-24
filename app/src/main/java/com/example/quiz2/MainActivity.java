package com.example.quiz2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    CheckBox Q1A1,Q1A2,Q1A3,Q1A4,Q2A1,Q2A2,Q2A3,Q2A4,Q3A1,Q3A2,Q3A3,Q3A4,Q4A1,Q4A2,Q4A3,Q4A4;
    Button but ;
    TextView result_view;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Q1A1=findViewById(R.id.Q1A1);
        Q1A2=findViewById(R.id.Q1A2);
        Q1A3=findViewById(R.id.Q1A3);
        Q1A4=findViewById(R.id.Q1A4);
        Q2A1=findViewById(R.id.Q2A1);
        Q2A2=findViewById(R.id.Q2A2);
        Q2A3=findViewById(R.id.Q2A3);
        Q2A4=findViewById(R.id.Q2A4);
        Q3A1=findViewById(R.id.Q3A1);
        Q3A2=findViewById(R.id.Q3A2);
        Q3A3=findViewById(R.id.Q3A3);
        Q3A4=findViewById(R.id.Q3A4);
        Q4A1=findViewById(R.id.Q4A1);
        Q4A2=findViewById(R.id.Q4A2);
        Q4A3=findViewById(R.id.Q4A3);
        Q4A4=findViewById(R.id.Q4A4);
        but=findViewById(R.id.but);
        result_view=findViewById(R.id.result_view);

        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int result = 0;
                if (!Q1A1.isChecked()&&Q1A2.isChecked()&&!Q1A3.isChecked()&&!Q1A4.isChecked()){
                    result=result+5;
                }
                if (Q2A1.isChecked()&&!Q2A2.isChecked()&&!Q2A3.isChecked()&&!Q2A4.isChecked()){
                    result=result+5;
                }
                if (Q3A1.isChecked()&&!Q3A2.isChecked()&&!Q3A3.isChecked()&&!Q3A4.isChecked()){
                    result=result+5;
                }
                if (!Q4A1.isChecked()&&!Q4A2.isChecked()&&Q4A3.isChecked()&&!Q4A4.isChecked()){
                    result=result+5;
                }
                result_view.setText(""+result+"/20");
            }
        });

    }
}
