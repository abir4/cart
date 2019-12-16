package com.example.abir;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    List<Model> maain_list;
  RecyclerView.Adapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        maain_list= new ArrayList<>();
         recyclerView = findViewById(R.id.recyCleeeID);
         recyclerView.setHasFixedSize(true);
         recyclerView.setLayoutManager(new LinearLayoutManager(this));



         maain_list.add(new Model(R.drawable.wtach,"Watch","It is a Very Nice Watch"));
         maain_list.add(new Model(R.drawable.wtach,"Watch","It is a Very Nice Watch"));
         maain_list.add(new Model(R.drawable.wtach,"Watch","It is a Very Nice Watch"));






                adapter = new CustomAdapter(maain_list,getApplicationContext());

        recyclerView.setAdapter(adapter);



    }

}
