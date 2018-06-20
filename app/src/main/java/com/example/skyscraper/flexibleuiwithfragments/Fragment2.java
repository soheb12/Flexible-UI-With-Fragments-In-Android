package com.example.skyscraper.flexibleuiwithfragments;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Fragment2 extends Fragment{

    TextView textView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_2,container,false);
        textView = (TextView) view.findViewById(R.id.textview);
        return view;
    }

    public void changeData(int index)
    {
        String[] desc = getResources().getStringArray(R.array.description);
        textView.setText(desc[index]);
    }
}
