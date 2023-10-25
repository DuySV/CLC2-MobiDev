package vn.DuongNhatDuy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn1=findViewById(R.id.btn1);
        Button btn2=findViewById(R.id.btn2);
        Button btn3=findViewById(R.id.btn3);
        Button btn4=findViewById(R.id.btn4);
    btn1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent=new Intent(getApplicationContext(),ActivityBai1.class);
            startActivity(intent);
        }
    });
    btn2.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent=new Intent(getApplicationContext(),ActivityBai2.class);
            startActivity(intent);
        }
    });
    btn3.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent=new Intent(getApplicationContext(),ActivityBai3.class);
            startActivity(intent);
        }
    });
    btn4.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent=new Intent(getApplicationContext(),ActivityBai4.class);
            startActivity(intent);
        }
    });
    }

}