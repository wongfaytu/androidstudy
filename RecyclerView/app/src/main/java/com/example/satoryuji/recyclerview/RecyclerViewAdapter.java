package com.example.satoryuji.recyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by satoryuji on 2018/11/18.
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<ViewHolder> {
    private List<RowData> list;

    public RecyclerViewAdapter(List<RowData> list) {
        this.list = list;
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.row, parent,false);
        ViewHolder vh = new ViewHolder(inflate);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.titleView.setText(list.get(position).getTitle());
        holder.detailView.setText(list.get(position).getDetail());
    }


    @Override
    public int getItemCount() {
        return list.size();
    }
}
