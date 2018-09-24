package com.example.satoryuji.study;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class MainFragment extends Fragment implements View.OnClickListener{

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);

        View root = inflater.inflate(R.layout.fragment_main, container, false);
        View button = root.findViewById(R.id.button);
        final TextView textview = (TextView) root.findViewById(R.id.text);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager manager = getFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();

                // 普通は引数は画面で入力されたメッセージをいれるのかな？
                transaction.replace(R.id.container, NextFragment.newInstance(textview.getText().toString()));

                transaction.commit();
            }
        });
        return root;

    }

    @Override
    public void onClick(View v) {

    }
}
