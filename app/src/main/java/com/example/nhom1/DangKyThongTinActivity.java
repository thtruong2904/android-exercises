package com.example.nhom1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View.OnClickListener;

import androidx.appcompat.app.AppCompatActivity;
public class DangKyThongTinActivity extends AppCompatActivity {
    private EditText email, tendangnhap, password, ngaysinh;
    private Button btn;
    private TextView txtshow;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dang_ky_thong_tin);

        email = (EditText) findViewById(R.id.email);
        tendangnhap = (EditText) findViewById(R.id.tendangnhap);
        password = (EditText) findViewById(R.id.password);
        ngaysinh = (EditText) findViewById(R.id.ngaysinh);
        btn = (Button) findViewById(R.id.luu);
        txtshow = (TextView) findViewById(R.id.txtshow);

        btn.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = "Thông tin vừa nhập \n";
                str+="Tài khoản:"+tendangnhap.getText().toString()+"\n Mật khẩu:"+password.getText().toString();
                str+="\nNgày sinh: "+ngaysinh.getText().toString()+"\nEmail:"+email.getText().toString();
                txtshow.setText(str);
            }
        });

    }

}
