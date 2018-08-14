package com.example.satoryuji.study;

import android.app.FragmentManager;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

 

public class MainActivity extends Fragment{
      
    private static final String ARGS_NAME = "name";

    public static MainActivity newInstance(String name) {
        MainActivity fragment = new MainActivity();

        Bundle args = new Bundle();
        args.putString(ARGS_NAME, name);
        fragment.setArguments(args);

        return fragment;
    }
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.activity_main, container, false);
        View button = root.findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
    public void onClick(View view) {
        android.support.v4.app.FragmentManager manager = getFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();

        // 普通は引数は画面で入力されたメッセージをいれるのかな？
        transaction.replace(R.id.container, MainActivity.newInstance("myName"));

        transaction.commit();
    }
});
        return root;
    }

    private String mName;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle args = getArguments();
        mName = args.getString(ARGS_NAME);
    }
}
