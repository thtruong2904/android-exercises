package com.example.nhom1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;


import com.google.android.material.snackbar.Snackbar;

public class ThongTinCaNhanActivity extends AppCompatActivity {
    private EditText hoten;
    private EditText cccd;
    private RadioGroup radioGroup;
    private CheckBox choigame, docsach, docbao;
    private EditText ttk;
    private Button luu;

    private TextView tt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thong_tin_ca_nhan);

        hoten = (EditText) findViewById(R.id.hoten);
        cccd = (EditText) findViewById(R.id.cccd);
        radioGroup = (RadioGroup) findViewById(R.id.bangcap);
        choigame = (CheckBox) findViewById(R.id.choigame);
        docsach = (CheckBox) findViewById(R.id.docsach);
        docbao = (CheckBox) findViewById(R.id.docbao);
        ttk = (EditText) findViewById(R.id.ttk);
        luu = (Button) findViewById(R.id.guithongtin);
        tt = (TextView) findViewById(R.id.thongtin);

        luu.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                String hoTen = hoten.getText().toString();
                String cccD = cccd.getText().toString();
                if(cccD.length() > 12){
                    cccd.setError("Số CCCD không vượt quá 12 số");
                }
                String TTK = ttk.getText().toString();
                int radioButtonId = radioGroup.getCheckedRadioButtonId();
                String radioButtonSelected = "";

                if(radioButtonId != -1)
                {
                    RadioButton radioButton = findViewById(radioButtonId);
                    radioButtonSelected = radioButton.getText().toString();
                }

                String checkBoxSelected = "";
                if(choigame.isChecked())
                {
                    checkBoxSelected += choigame.getText().toString() + " ";
                }
                if(docsach.isChecked())
                {
                    checkBoxSelected += docsach.getText().toString() + " ";
                }
                if(docbao.isChecked())
                {
                    checkBoxSelected += docbao.getText().toString() + " ";
                }
                String thongtin = "Họ tên : " + hoTen + "\n" + "CCCD : " + cccD + "\n" + "Bằng cấp : " + radioButtonSelected + "\n" + "Sở thích : " + checkBoxSelected + "\n" + "Thông tin khác : " + TTK;
                tt.setText(thongtin);
            }
        });
    }
}