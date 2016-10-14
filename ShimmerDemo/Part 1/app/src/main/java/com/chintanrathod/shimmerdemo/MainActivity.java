package com.chintanrathod.shimmerdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.facebook.shimmer.ShimmerFrameLayout;

public class MainActivity extends AppCompatActivity {

    ShimmerFrameLayout shimmer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        shimmer = (ShimmerFrameLayout) findViewById(R.id.shimmer);
        shimmer.setAutoStart(true);
    }
}
