package com.example.listviewwithxml;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.content.Intent;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    static {
        AppCompatDelegate.setCompatVectorFromResourcesEnabled(true);
    }

    String[] food_menu;
    int[] arrImg;
    private TypedArray img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        food_menu = getResources().getStringArray(R.array.foods);

        final ListView listViewMenu = (ListView) findViewById(R.id.listView);

        img = getResources().obtainTypedArray(R.array.images);

        DesignList adapter = new DesignList(MainActivity.this, food_menu, img);

        listViewMenu.setAdapter(adapter);

        //when click list
        listViewMenu.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String itemValue = (String) listViewMenu.getItemAtPosition(i);
                Intent showPage = new Intent(MainActivity.this, Main2Activity.class);
                showPage.putExtra("id", "" + i + "");
                showPage.putExtra("title", "" + itemValue + "");
                startActivity(showPage);
            }
        });
    }
}
