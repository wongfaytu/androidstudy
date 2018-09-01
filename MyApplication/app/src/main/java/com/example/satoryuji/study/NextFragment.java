package com.example.satoryuji.study;

import android.os.Bundle;
import android.support.v4.app.Fragment;



public class NextFragment extends Fragment {

    private static final String ARGS_NAME = "name";

    public static NextFragment newInstance(String name) {
        NextFragment fragment = new NextFragment();

        Bundle args = new Bundle();
        args.putString(ARGS_NAME, name);
        fragment.setArguments(args);

        return fragment;
    }

    private String mName;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle args = getArguments();
        mName = args.getString(ARGS_NAME);
    }
}

