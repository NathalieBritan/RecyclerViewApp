package com.nathaliebritan.recycleviewapp.Activity;

import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.nathaliebritan.recycleviewapp.Item.BaseItem;
import com.nathaliebritan.recycleviewapp.Item.ImageItem;
import com.nathaliebritan.recycleviewapp.Item.TextItem;
import com.nathaliebritan.recycleviewapp.Adapter.MyAdapter;
import com.nathaliebritan.recycleviewapp.R;

import java.util.ArrayList;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private ArrayList<BaseItem> items;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        items = new ArrayList<>();
        Calendar now = Calendar.getInstance();

        items.add(new TextItem(now.getTime().toString(), R.string.txt1));
        items.add(new ImageItem(now.getTime().toString(), R.drawable.img1));
        items.add(new ImageItem(now.getTime().toString(), R.drawable.img2));
        items.add(new TextItem(now.getTime().toString(), R.string.txt2));
        items.add(new TextItem(now.getTime().toString(), R.string.txt3));
        items.add(new ImageItem(now.getTime().toString(), R.drawable.img3));
        items.add(new TextItem(now.getTime().toString(), R.string.txt4));
        items.add(new ImageItem(now.getTime().toString(), R.drawable.img4));
        items.add(new TextItem(now.getTime().toString(), R.string.txt5));
        items.add(new ImageItem(now.getTime().toString(), R.drawable.img5));

        mRecyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);

        mRecyclerView.setHasFixedSize(true);

        mLayoutManager = new LinearLayoutManager(this);
        if(getResources().getConfiguration().orientation== Configuration.ORIENTATION_PORTRAIT){
            mRecyclerView.setLayoutManager(new GridLayoutManager(this,1));
        }
        else
        {
            mRecyclerView.setLayoutManager(new GridLayoutManager(this,2));
        }

        mAdapter = new MyAdapter(items);
        mRecyclerView.setAdapter(mAdapter);
    }
}
