package com.example.satoryuji.study;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by satoryuji on 2018/11/17.
 */

public class ViewHolder extends RecyclerView.ViewHolder{

    public TextView titleView;

    public ViewHolder(View itemView) {
        super(itemView);
        titleView = (TextView)itemView.findViewById(R.id.title);
    }
}
