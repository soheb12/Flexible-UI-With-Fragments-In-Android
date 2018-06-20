package com.example.skyscraper.flexibleuiwithfragments;

import android.app.FragmentManager;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements Fragment1.Communicator{


    Fragment1 fragment1;
    Fragment2 fragment2;
    FragmentManager manager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        manager = getFragmentManager();
        fragment1 = (Fragment1) manager.findFragmentById(R.id.fragment1);


        fragment1.setCommmunicator(this);

    }

    @Override
    public void respond(int index) {
        fragment2 = (Fragment2) manager.findFragmentById(R.id.fragment2);
        if (fragment2 != null && fragment2.isVisible() )//landscape
        {
            fragment2.changeData(index);
        }else //portrait
        {
            Intent intent = new Intent(this,AnotherActivity.class);
            intent.putExtra("index",index);
            startActivity(intent);
        }
    }
}
