package com.englishit.listviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Button btnThem;
    ListView listView;
    EditText edNumber;
    ArrayList<String> dsKetQua;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnThem = (Button) findViewById(R.id.btnThem);
        listView = (ListView) findViewById(R.id.listView);
        edNumber = (EditText) findViewById(R.id.edNumber);
        dsKetQua = new ArrayList<>();


    }


    public void XuLy(View view) {
        final ArrayAdapter arrayAdapter = new ArrayAdapter(MainActivity.this, android.R.layout.simple_list_item_1, dsKetQua);
        listView.setAdapter(arrayAdapter);
        String text = edNumber.getText().toString();
        dsKetQua.add(text);
        arrayAdapter.notifyDataSetChanged();


    }
}
