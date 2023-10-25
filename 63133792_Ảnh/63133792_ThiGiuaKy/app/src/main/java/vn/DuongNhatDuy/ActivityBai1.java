package vn.DuongNhatDuy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ActivityBai1 extends AppCompatActivity {

    EditText edtHeight;
    EditText edtWeight;
    EditText edtResult;
    Button btnSubmit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai1);
        findView();
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float height= Float.parseFloat(String.valueOf(edtHeight.getText()))/100f;
                float weight=Float.parseFloat(String.valueOf(edtWeight.getText()));
                float bmi= weight/(height*height);
                edtResult.setText(String.valueOf(bmi));
            }
        });
    }
        public void findView(){
            edtHeight=findViewById(R.id.edtHeight);
            edtWeight=findViewById(R.id.edtWeight);
            edtResult=findViewById(R.id.edtResult);
            btnSubmit=findViewById(R.id.btnSubmit);
        }
    }