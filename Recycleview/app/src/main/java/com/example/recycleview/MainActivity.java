package com.example.recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    ArrayList<Mymodel>data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myinit();

        MyAdapter adapter = new MyAdapter(MainActivity.this,data);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
    private void myinit(){
        recyclerView = findViewById(R.id.myrecycler);
        data = new ArrayList<>();
        data.add(new Mymodel("Brishti",R.drawable.deadpool));
        data.add(new Mymodel("Rakesh",R.drawable.deadpool));
        data.add(new Mymodel("Akshat",R.drawable.deadpool));
        data.add(new Mymodel("Dhruv",R.drawable.deadpool));
        data.add(new Mymodel("Nakul",R.drawable.deadpool));
        data.add(new Mymodel("Surya",R.drawable.deadpool));
        data.add(new Mymodel("Dev",R.drawable.deadpool));
        data.add(new Mymodel("Abhishek",R.drawable.spidermen));
    }
}