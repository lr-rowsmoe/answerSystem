package com.answersystem.lr.answersystem.com.answersystem.lr.bbs;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.answersystem.lr.answersystem.R;

import java.util.ArrayList;
import java.util.List;

public class bbs extends AppCompatActivity {

    private List<Pic> picList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bbs);
        initPic(); //初始化图片数据
        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.recycler_view);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        PicAdapter adapter = new PicAdapter(picList);
        recyclerView.setAdapter(adapter);
    }

    private void initPic() {
        for(int i = 0; i < 2; i++) {
            Pic pic1 = new Pic("pic1", R.mipmap.ic_launcher);
            picList.add(pic1);
            Pic pic2 = new Pic("pic2", R.mipmap.ic_launcher);
            picList.add(pic2);
            Pic pic3 = new Pic("pic3", R.mipmap.ic_launcher);
            picList.add(pic3);
            Pic pic4 = new Pic("pic4", R.mipmap.ic_launcher);
            picList.add(pic4);
            Pic pic5 = new Pic("pic5", R.mipmap.ic_launcher);
            picList.add(pic5);
        }
    }
}
