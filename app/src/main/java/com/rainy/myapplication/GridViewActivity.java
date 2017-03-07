package com.rainy.myapplication;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;

import com.rainy.myapplication.adapters.GridViewAdapter;

import java.util.ArrayList;
import java.util.List;

public class GridViewActivity extends AppCompatActivity {
    private TextView textTitle;
    private GridView gridView;
    private GridViewAdapter adapter;
    private List<Drawable> list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_view);

        textTitle = (TextView) findViewById(R.id.textTile);
        gridView = (GridView) findViewById(R.id.gridView);
        list = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            list.add(getResources().getDrawable(R.drawable.ic_launcher));
        }
        adapter = new GridViewAdapter(this,list);
        gridView.setAdapter(adapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(GridViewActivity.this,"点击了==="+position,Toast.LENGTH_SHORT).show();
            }
        });
    }




}
