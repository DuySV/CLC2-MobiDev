package com.example.bmi_3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    private static final DecimalFormat df = new DecimalFormat("0.00");
    EditText edtHeight;
    EditText edtWeight;
    TextView tvResult;
    Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findView();
        btnSubmit.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                float height= Float.parseFloat(String.valueOf(edtHeight.getText()))/100f;
                float weight=Float.parseFloat(String.valueOf(edtWeight.getText()));
                float bmi= weight/(height*height);
                tvResult.setText(String.valueOf(bmi));
            }
        });
    }
    public void findView(){
        edtHeight=findViewById(R.id.edtHeight);
        edtWeight=findViewById(R.id.edtWeight);
        tvResult=findViewById(R.id.tvResult);
        btnSubmit=findViewById(R.id.btnSubmit);
    }

//    protected void Calc(){
//        float height= Float.parseFloat(String.valueOf(edtHeight.getText()));
//        float weight=Float.parseFloat(String.valueOf(edtWeight.getText()));
//        float bmi= weight/(height*height);
//        tvResult.setText(String.valueOf(bmi));
//    }
}