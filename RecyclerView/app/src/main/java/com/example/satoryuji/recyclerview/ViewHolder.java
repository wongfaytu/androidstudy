package com.example.satoryuji.recyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by satoryuji on 2018/11/18.
 */

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView titleView;
        public TextView detailView;

        public ViewHolder(View itemView) {
            super(itemView);
            titleView = (TextView) itemView.findViewById(R.id.title);
            detailView = (TextView) itemView.findViewById(R.id.detail);

        }
    }

