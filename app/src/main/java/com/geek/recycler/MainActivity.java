package com.geek.recycler;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Build;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    Adapter adapter;
    ArrayList<Data> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        createList();
        initRecycler();
    }

    private void initRecycler() {
        recyclerView = findViewById(R.id.recycler);
        adapter = new Adapter();
        adapter.addItems(list);
        recyclerView.setAdapter(adapter);
        recyclerView.addItemDecoration(new DividerItemDecoration(this,DividerItemDecoration.VERTICAL));
    }

    private void createList() {
        list.add(new Data("Title", "Description", System.currentTimeMillis()));
        list.add(new Data("Title", "Description", System.currentTimeMillis()));
        list.add(new Data("Title", "Description", System.currentTimeMillis()));
        list.add(new Data("Title", "Description", System.currentTimeMillis()));
        list.add(new Data("Title", "Description", System.currentTimeMillis()));
        list.add(new Data("Title", "Description", System.currentTimeMillis()));
        list.add(new Data("Title", "Description", System.currentTimeMillis()));
        list.add(new Data("Title", "Description", System.currentTimeMillis()));
        list.add(new Data("Title", "Description", System.currentTimeMillis()));
        list.add(new Data("Title", "Description", System.currentTimeMillis()));
        list.add(new Data("Title", "Description", System.currentTimeMillis()));
        list.add(new Data("Title", "Description", System.currentTimeMillis()));
        list.add(new Data("Title", "Description", System.currentTimeMillis()));
        list.add(new Data("Title", "Description", System.currentTimeMillis()));
        list.add(new Data("Title", "Description", System.currentTimeMillis()));
        list.add(new Data("Title", "Description", System.currentTimeMillis()));
        list.add(new Data("Title", "Description", System.currentTimeMillis()));
        list.add(new Data("Title", "Description", System.currentTimeMillis()));
        list.add(new Data("Title", "Description", System.currentTimeMillis()));
        list.add(new Data("Title", "Description", System.currentTimeMillis()));
        list.add(new Data("Title", "Description", System.currentTimeMillis()));
        list.add(new Data("Title", "Description", System.currentTimeMillis()));
        list.add(new Data("End", "End", System.currentTimeMillis()));
    }

}