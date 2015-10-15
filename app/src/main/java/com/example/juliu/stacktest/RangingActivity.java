package com.example.juliu.stacktest;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class RangingActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ranging);

        Intent returnIntent = new Intent();
        returnIntent.putExtra("result", "somethin");
        setResult(RESULT_OK, returnIntent);
        finish();
    }
}