package com.example.administrator.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.LinearLayout;

public class Main2Activity extends AppCompatActivity {
    private LinearLayout itemContainer2;
    private LayoutInflater layoutInflater;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        itemContainer2 = (LinearLayout) findViewById(R.id.itemContainer2);
        layoutInflater = getLayoutInflater();

        ;
    }


}
