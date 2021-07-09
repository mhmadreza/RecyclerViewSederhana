package com.mr.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvListData;
    private DataAdapter dataAdapter;
    private RecyclerView.LayoutManager layoutManager;
    private List<String> listIsi = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvListData = findViewById(R.id.rv_list);
        rvListData.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        rvListData.setLayoutManager(layoutManager);
        listIsi.add("Ini isi RecyclerView ke - 1");
        listIsi.add("Ini isi RecyclerView ke - 2");
        listIsi.add("Ini isi RecyclerView ke - 3");
        listIsi.add("Ini isi RecyclerView ke - 4");
        listIsi.add("Ini isi RecyclerView ke - 5");
        listIsi.add("Ini isi RecyclerView ke - 6");
        dataAdapter = new DataAdapter(listIsi, this);
        rvListData.setAdapter(dataAdapter);
        dataAdapter.notifyDataSetChanged();

    }
}