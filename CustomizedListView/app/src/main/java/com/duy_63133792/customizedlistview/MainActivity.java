package com.duy_63133792.customizedlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<Countruy>dsQuocGia;
        dsQuocGia=new ArrayList<Countruy>();
        Countruy nationA=new Countruy("Viet Nam","vn",100);
        Countruy nationB=new Countruy("Rusian","ru",400);
        Countruy nationC=new Countruy("American","us",500);
        dsQuocGia.add(nationA);dsQuocGia.add(nationB);dsQuocGia.add(nationC);
        ListView listViewQG=findViewById(R.id.ListViewNation);
        CountryAdapter adapter=new CountryAdapter(dsQuocGia,this);
        listViewQG.setAdapter(adapter);
    }
}