package com.example.autocomplete;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    AutoCompleteTextView autoTV;
        protected void onCreate(Bundle saveInstanceState){
            super.onCreate(saveInstanceState);
            setContentView(R.layout.activity_main);
        findControls();
            ArrayList<String> dsQuocGia = new ArrayList<String>();
            dsQuocGia.add("VIET NAM");
            dsQuocGia.add("ENGLAND");
            ArrayAdapter<String> adapterQG;
            adapterQG=new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line,dsQuocGia);
            autoTV.setAdapter(adapterQG);
        }
        void findControls(){
       autoTV= (AutoCompleteTextView)findViewById(R.id.autoTV);
        }
}