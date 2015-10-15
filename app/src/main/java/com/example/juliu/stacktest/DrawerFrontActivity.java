package com.example.juliu.stacktest;

import android.graphics.drawable.Drawable;
import android.support.v4.app.FragmentTransaction;
import android.os.Bundle;

import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.app.SherlockFragment;
import com.actionbarsherlock.app.SherlockFragmentActivity;

public class DrawerFrontActivity extends SherlockFragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drawer_fron);

        ActionBar bar = getSupportActionBar();
        Drawable myIcon = getResources().getDrawable(R.mipmap.ic_launcher);
        bar.setBackgroundDrawable(myIcon);

        SherlockFragment fragment;
        fragment = new PeopleActivity();

        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.rlDrawerHome, fragment);
        transaction.commit();

        setTitle("Home");
        bar.setTitle("Home");
    }
}

