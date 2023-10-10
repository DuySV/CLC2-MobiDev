package com.example.helloworld_v2;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         Button button2 = findViewById(R.id.button2);
         TextView HelloWorld=findViewById(R.id.HelloWorld);
         Button button=findViewById(R.id.button);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                HelloWorld.setTextColor(getResources().getColor(R.color.black));
            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                HelloWorld.setTextSize(HelloWorld.getTextSize());
            }
        });

    }
}