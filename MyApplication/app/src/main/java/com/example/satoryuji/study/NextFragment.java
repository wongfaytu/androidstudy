package com.example.satoryuji.study;

import android.os.Bundle;
import android.support.v4.app.Fragment;



public class NextFragment extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        private static final int ARGS_NAME = R.id.text;

    public static NextFragment newInstance(int name) {
        NextFragment fragment = new NextFragment();

        Bundle args = new Bundle();
        args.putInt(String.valueOf(ARGS_NAME), name);
        fragment.setArguments(args);

        return fragment;
    }

    private String mName;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle args = getArguments();
        mName = args.getString(String.valueOf(ARGS_NAME));
    }
}


