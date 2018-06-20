package com.example.skyscraper.flexibleuiwithfragments;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class AnotherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_another);

        Intent intent =  getIntent();
        int index = intent.getIntExtra("index",0);
        Fragment2 fragment2 = (Fragment2) getFragmentManager().findFragmentById(R.id.fragment2);
        if(fragment2 != null)
        {
            fragment2.changeData(index);
        }

    }
}
