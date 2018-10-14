package com.example.satoryuji.study;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        final List list = new ArrayList();
        for (int i = 0; i < 30; i++) {
            list.add(i);
        }
        recyclerView.setAdapter(new RecyclerAdapter(getApplicationContext(), list));
    }

    private static final class RecyclerAdapter extends RecyclerView.Adapter {
        private final Context mContext;
        private List mItemList = new ArrayList();

        private RecyclerAdapter(final Context context, final List itemList) {
            mContext = context;
            mItemList = itemList;
        }
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        final View view = LayoutInflater.from(mContext).inflate(R.layout.item, parent, false);
        return new ViewHolder(view);
    }
    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        final TextView textItem = (TextView) holder.itemView.findViewById(R.id.item_name);
        textItem.setText(mItemList.get(position));
    }
    @Override
    public int getItemCount() {
        return mItemList.size();
    }

    private static class ViewHolder extends RecyclerView.ViewHolder {
        private final TextView mTextView;
        private ViewHolder(View v) {
            super(v);
            mTextView = (TextView) v.findViewById(R.id.item_name);
        }
    }
}