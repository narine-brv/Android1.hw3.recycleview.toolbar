package com.narine.android1hw3;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    MainAdapter adapter;
    ArrayList <ItemModel> student_list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("Моя группа");

        recyclerView = findViewById(R.id.rv_group);
        adapter = new MainAdapter();

        recyclerView.setAdapter(adapter);

        RecyclerView.LayoutManager manager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(manager);

        student_list = new ArrayList<>();

        student_list.add(0, new ItemModel("Айпери"));
        student_list.add(0, new ItemModel("Каныкей"));
        student_list.add(0, new ItemModel("Бекназар"));
        student_list.add(0, new ItemModel("Омар"));
        student_list.add(0, new ItemModel("Нурайым"));
        student_list.add(0, new ItemModel("Асель"));
        student_list.add(0, new ItemModel("Бекжан"));
        student_list.add(0, new ItemModel("Нурсултан"));
        student_list.add(0, new ItemModel("Акназар"));
        student_list.add(0, new ItemModel("Наринэ"));

        adapter.addText(student_list);


    }

    private void setBackgroundDrawable(ColorDrawable colorDrawable) {

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (R.id.menu_settings == item.getItemId()){
            Intent intent = new Intent(MainActivity.this, MainActivity2.class);
            startActivity(intent);

        }

        return super.onOptionsItemSelected(item);
    }
}