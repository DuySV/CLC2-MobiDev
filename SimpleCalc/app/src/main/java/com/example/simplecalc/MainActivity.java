package com.example.simplecalc;

import static com.example.simplecalc.R.id.btnPlus;

import com.example.simplecalc.R;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText edtX, edtY;
    TextView tvZ;
    Button btnPlus, btnMinus, btnMultiply, btnDivide;
    int num1,num2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findView();
        btnPlus.setOnClickListener(this);
        btnMinus.setOnClickListener(this);
        btnMultiply.setOnClickListener(this);
        btnDivide.setOnClickListener(this);


    }
    public void findView() {
        edtX = findViewById(R.id.edtX);
        edtY = findViewById(R.id.edtY);
        tvZ = findViewById(R.id.tvZ);
        btnPlus = findViewById(R.id.btnPlus);
        btnMinus = findViewById(R.id.btnMinus);
        btnMultiply = findViewById(R.id.btnMultiply);
        btnDivide = findViewById(R.id.btnDivide);
    }
    @Override
    public void onClick(View v) {
        num1 = getInt(edtX);
        num2 = getInt(edtY);
        if (v.getId() == R.id.btnPlus){
            tvZ.setText("Answer x + y =" + (num1 + num2));
        }
        else if (v.getId() == R.id.btnMinus){
            tvZ.setText("Answer x - y =" + (num1 - num2));
        }
        else if (v.getId() == R.id.btnMultiply){
            tvZ.setText("Answer x * y =" + (num1 * num2));
        }
        else if (v.getId() == R.id.btnDivide){
            if (num2 == 0) {
                   tvZ.setText("Answer=ERROR");
              }
               tvZ.setText("Answer x / y =" + (float)num1 / (float)num2);
        }
    }
    public int getInt(EditText editText) {
        if (editText.getText().toString().equals("")) {
            Toast.makeText(this, "Enter number", Toast.LENGTH_SHORT).show();
            return 0;
        } else
            return Integer.parseInt(editText.getText().toString());
    }




}