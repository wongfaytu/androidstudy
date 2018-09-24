package com.example.satoryuji.study;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class NextFragment extends Fragment {
    private static final  String ARGS_NAME = "name";
    private String mName;

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
    }

    public static NextFragment newInstance(String name) {
        NextFragment fragment = new NextFragment();

        Bundle args = new Bundle();
        args.putString(ARGS_NAME, name);
        fragment.setArguments(args);

        return fragment;
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View view = inflater.inflate(R.layout.fragment_next, container, false);
        TextView textView = (TextView) view.findViewById(R.id.textView);

        Bundle args = getArguments();
        mName = args.getString(ARGS_NAME);
        Log.d("",mName);
        textView.setText(mName);

        return view;
    }

}
