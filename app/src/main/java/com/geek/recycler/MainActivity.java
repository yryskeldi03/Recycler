package com.geek.recycler;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

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