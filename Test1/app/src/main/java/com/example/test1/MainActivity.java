package com.example.test1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void XuLyNoiHello(View v) {
        EditText edtName=findViewById(R.id.edtName);
        String strThongBao="Hello"+edtName.getText()+"!";
        Toast.makeText(this,strThongBao,Toast.LENGTH_LONG).show();
    }
}