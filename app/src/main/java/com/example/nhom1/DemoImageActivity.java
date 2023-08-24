package com.example.nhom1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.Toast;
import android.widget.ToggleButton;

public class DemoImageActivity extends AppCompatActivity {

    ToggleButton tgDen;
    ImageView ivDen, ivQuat;
    Switch swQuat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo_image);

        tgDen = findViewById(R.id.tgBongDen);
        ivDen = findViewById(R.id.ivDen);
        swQuat = findViewById(R.id.swQuat);
        ivQuat = findViewById(R.id.ivQuat);

        tgDen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SetEvent();
            }
        });

        swQuat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SetEvent1();
            }
        });
    }


    private void SetEvent() {
        if(tgDen.isChecked())
        {
            ivDen.setImageResource(R.drawable.bong_den1);
        }
        else{
            ivDen.setImageResource(R.drawable.bong_den);
        }
    }

    private void SetEvent1() {
        if(swQuat.isChecked())
        {
            ivQuat.setImageResource(R.drawable.quat);
        }
        else{
            ivQuat.setImageResource(R.drawable.quat1);
        }
    }
}