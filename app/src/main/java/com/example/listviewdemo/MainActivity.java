package com.example.listviewdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView mylistView =findViewById(R.id.class_schedule);


        String[] myClasses = {"Data structures", "Game Programming", "Server Side Wb Programming","Website Programming", "Mobile Application Development" };

        ArrayAdapter<String> myAdapter = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1, myClasses);

        mylistView.setAdapter(myAdapter);
    }
}