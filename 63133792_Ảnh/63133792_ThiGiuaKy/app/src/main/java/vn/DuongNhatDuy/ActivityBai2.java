package vn.DuongNhatDuy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class ActivityBai2 extends AppCompatActivity {

    ArrayList<String> dsGame;
    ListView LVGame;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai2);
        findControl();
        dsGame=new ArrayList<>();
        dsGame.add("mario");
        dsGame.add("contra");
        dsGame.add("megaman");
        dsGame.add("rambo lùn");
        dsGame.add("đế chế");

        ArrayAdapter<String> adapterQG;
        adapterQG=new ArrayAdapter<String>(
                this, android.R.layout.simple_list_item_1,dsGame
        );
        LVGame.setAdapter(adapterQG);
        LVGame.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String itemChon=dsGame.get(i);
                String thongBao="ban đã chọn game:"+itemChon;
                Toast.makeText(ActivityBai2.this,thongBao,Toast.LENGTH_SHORT).show();
            }
        });
    }
    public void findControl(){
        LVGame=(ListView)findViewById(R.id.LVGame);
    }
}