package com.example.tablayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.tablayout.Adapter.MyAdapter;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    TabLayout tabLayout;

    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout = findViewById(R.id.tabLayout);
        viewPager = findViewById(R.id.viewPager);

        MyAdapter myAdapter = new MyAdapter(getSupportFragmentManager());   //TabLayout In Fragment:-getSupportFragmentManager() //Alt+Enter
        viewPager.setAdapter(myAdapter);
        tabLayout.setupWithViewPager(viewPager);   //ViewPager With Set:-setupWithViewPager(viewPager)
    }
}