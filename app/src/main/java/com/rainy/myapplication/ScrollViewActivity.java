package com.rainy.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ScrollView;
import android.widget.TextView;

public class ScrollViewActivity extends AppCompatActivity {
    private ScrollView scrollView;
    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scroll_view);
        scrollView = (ScrollView) findViewById(R.id.scrollView);
        tv = (TextView) findViewById(R.id.text);

    }
}
