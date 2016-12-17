package com.example.nagaraj.autotext;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         String str[]={"nagaraj","sathya","kevin"};
        AutoCompleteTextView auto=(AutoCompleteTextView) findViewById(R.id.autotext);
        ArrayAdapter<String> adp=new ArrayAdapter<String>(this,android.R.layout.simple_dropdown_item_1line,str);
        auto.setThreshold(1);
        auto.setAdapter(adp);
    }
}
