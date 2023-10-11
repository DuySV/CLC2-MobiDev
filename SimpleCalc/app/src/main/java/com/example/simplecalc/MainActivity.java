package com.example.simplecalc;

import static com.example.simplecalc.R.id.btnPlus;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edtX, edtY;
    TextView tvZ;
    Button btnPlus, btnMinus, btnMultiply, btnDivide;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int num1, num2;
        num1 = getInt(edtX);
        num2 = getInt(edtY);
        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                tvZ.setText("Answer x + y =" + (num1 + num2));
            }
        });
        btnMinus.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                tvZ.setText("Answer x - y =" + (num1 - num2));
            }
        });
        btnMultiply.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                tvZ.setText("Answer x * y =" + (num1 * num2));
            }
        });
        btnDivide.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (num2 == 0) {
                    tvZ.setText("Answer=ERROR");
                }
                tvZ.setText("Answer x / y =" + (num1 / num2));
            }
        });
    }

    public int getInt(EditText editText) {
        if (editText.getText().toString().equals("")) {
            Toast.makeText(this, "Enter number", Toast.LENGTH_SHORT).show();
            return 0;
        } else
            return Integer.parseInt(editText.getText().toString());
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
}