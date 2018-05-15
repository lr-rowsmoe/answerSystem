package com.answersystem.lr.answersystem.com.answersystem.lr.bbs;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.answersystem.lr.answersystem.R;

import java.util.List;

public class PicAdapter extends RecyclerView.Adapter<PicAdapter.ViewHolder> {
    private List<Pic> mPicList;

    static class ViewHolder extends RecyclerView.ViewHolder{
        ImageView picImage;
        TextView picName;

        public ViewHolder(View view){
            super(view);
            picImage = (ImageView)view.findViewById(R.id.pic_image);
            picName = (TextView)view.findViewById(R.id.pic_name);
        }
    }

    public PicAdapter(List<Pic> picList){
        mPicList = picList;
    }

    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.bbs_item, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Pic pic = mPicList.get(position);
        holder.picImage.setImageResource(pic.getImageId());
        holder.picName.setText(pic.getName());
    }

    @Override
    public int getItemCount() {
        return mPicList.size();
    }
}
