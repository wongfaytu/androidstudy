package com.example.satoryuji.study;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by satoryuji on 2018/11/17.
 */

public class ViewHolder extends RecyclerView.ViewHolder{

    public TextView titleView;
    public ImageView imageView;

    public ViewHolder(View itemView) {
        super(itemView);
        titleView = (TextView)itemView.findViewById(R.id.title);
        imageView = (ImageView)itemView.findViewById(R.id.imageView);
    }



}
