package com.example.administrator.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("mylog", "onCreate()");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("mylog", "onStart()");
    }

    @Override //사용자가 사용할 준비 상태
    protected void onResume() {
        super.onResume();
        Log.i("mylog", "onResume()");
    }

    @Override //사용자가 사용할 단계
    protected void onPause() {
        super.onPause();
        Log.i("mylog", "onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("mylog", "onStop()");
    }

    @Override //화면이 파괴될때
    protected void onDestroy() {
        super.onDestroy();
        Log.i("mylog", "onDestroy()");
    }

    public void onClickBtnSecond(View view) {
        Log.i("mylog", "onClickBtnSecond");
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }

    public void onClickBtnThird(View view) {
        Log.i("mylog", "onClickBtnThird");
        Intent intent = new Intent(this, ThirdActivity.class);
        startActivity(intent);
    }
}
