package com.answersystem.lr.answersystem.com.answersystem.lr.bbs;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.widget.ListView;

import com.answersystem.lr.answersystem.R;

public class bbs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bbs);
        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.recycler_view);
    }
}
