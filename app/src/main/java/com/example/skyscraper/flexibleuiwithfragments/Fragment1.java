package com.example.skyscraper.flexibleuiwithfragments;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Fragment1 extends Fragment implements AdapterView.OnItemClickListener {

    ListView list;
    Communicator communicator;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_1,container,false);
        list = (ListView) view.findViewById(R.id.listview);
        ArrayAdapter adapter = ArrayAdapter.createFromResource(getActivity() , R.array.chapter , android.R.layout.simple_list_item_1);
        list.setAdapter(adapter);
        list.setOnItemClickListener(this);
        return view;
    }

    public void setCommmunicator(Communicator comm) {
        this.communicator = comm;
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        communicator.respond(position);
    }

    public interface Communicator
    {
        public void respond(int index);
    }
}
