package com.example.listviewwithxml;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        Intent intent = getIntent();
        final String txt_get_id = intent.getStringExtra("id");
        final String txt_get_title = intent.getStringExtra("title");

        final TextView txtTitle_show = (TextView) findViewById(R.id.txtResult);
        txtTitle_show.setText(txt_get_title);

    }
}
