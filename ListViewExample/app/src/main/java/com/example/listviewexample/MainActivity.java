package com.example.listviewexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<String> dsbaihat;
    ListView LVbaihat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findControl();
        dsbaihat=new ArrayList<>();
        dsbaihat.add("tien quan ca");
        dsbaihat.add("dong mau lac hong");
        ArrayAdapter<String>adapterQG;
        adapterQG=new ArrayAdapter<String>(
                this, android.R.layout.simple_list_item_1,dsbaihat
        );
        LVbaihat.setAdapter(adapterQG);
        LVbaihat.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String itemChon=dsbaihat.get(i);
                String thongBao="ban chon bai:"+itemChon;
                Toast.makeText(MainActivity.this,thongBao,Toast.LENGTH_SHORT).show();
            }
        });
    }
    public void findControl(){
        LVbaihat=(ListView)findViewById(R.id.LVbaihat);
    }
}