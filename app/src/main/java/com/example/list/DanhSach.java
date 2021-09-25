package com.example.list;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class DanhSach extends AppCompatActivity {
    TextView txtThongBao;
    ListView lstDs;
    ArrayList<String> MonHoc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_danh_sach);
        txtThongBao = (TextView) findViewById(R.id.textViewThongBao);
        lstDs = (ListView) findViewById(R.id.listviewDs);


        Bundle bd = getIntent().getExtras();
        if(bd != null){
            txtThongBao.setText("Xin chào "+ bd.getString("Username"));
        }
        //Tao mang mon hoc
        MonHoc = new ArrayList<>();
        MonHoc.add("Java");
        MonHoc.add("Android");
        MonHoc.add("Games");
        MonHoc.add("CTGD&GT");
        MonHoc.add("English3");
        //Dung arrayadapter de chua du lieu do vao listview
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, MonHoc);
        lstDs.setAdapter(adapter);

    }
}