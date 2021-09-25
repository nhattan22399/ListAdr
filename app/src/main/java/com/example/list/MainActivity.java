package com.example.list;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText txtName;
    EditText txtPass;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtName = (EditText) findViewById(R.id.editTextName);
        txtPass = (EditText) findViewById(R.id.editTextPass);
        btnLogin = (Button) findViewById(R.id.buttonLogin);

        btnLogin.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case (R.id.buttonLogin):
                if (txtName.getText().toString().equals("admin") && txtPass.getText().toString().equals("12345"))
                {
                    Toast.makeText(getApplicationContext(), "Đăng nhập thành công!",Toast.LENGTH_SHORT).show();
                    Intent ds = new Intent(MainActivity.this, DanhSach.class);
                    ds.putExtra("Username", txtName.getText().toString());
                    startActivity(ds);
                }
                else
                    Toast.makeText(getApplicationContext(), "Đăng nhập không thành công!",Toast.LENGTH_SHORT).show();
                break;


        }


    }
}