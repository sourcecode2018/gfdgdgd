package com.example.ahmed.eventat.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ahmed.eventat.Adapter.MyBidsAdapter;
import com.example.ahmed.eventat.Model.MyBidModel;
import com.example.ahmed.eventat.R;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class MyBids extends Fragment {
    RecyclerView recyclerView;
    public MyBidsAdapter adapter;
    java.util.List<MyBidModel> List;


    public MyBids() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_my_bids, container, false);
        List = new ArrayList<>();
        recyclerView = (RecyclerView)view. findViewById(R.id.recycler_view);
        adapter = new MyBidsAdapter(getContext(), List);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setAdapter(adapter);
        getBids();

        return view;
    }

    public void getBids(){
        List.add(new MyBidModel("بوكيه العروسة 1","100.000","450","1",R.drawable.logo,"تفاصيل البوكيه"));
        adapter.notifyDataSetChanged();

    }

}
