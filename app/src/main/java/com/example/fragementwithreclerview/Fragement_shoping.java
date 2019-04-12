package com.example.fragementwithreclerview;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class Fragement_shoping extends Fragment {
    View view;
    private RecyclerView recylerview;
    private List<contact> FirstContact;


    public Fragement_shoping() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,  Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.contacts_fragement, container, false);
        recylerview = (RecyclerView)view.findViewById(R.id.contacts_reclerview);
        recylerview.setLayoutManager(new LinearLayoutManager(getActivity()));
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(getActivity(),2);
        recylerview.setLayoutManager(layoutManager);


        FirstContact = new ArrayList<>();
        ///
        FirstContact.add(new contact("sanjay", "(111)235325235", R.drawable.love));
        FirstContact.add(new contact("yash", "(64636)346437", R.drawable.flipcart));
        FirstContact.add(new contact("sanjay", "(111)235325235", R.drawable.love));
        FirstContact.add(new contact("yash", "(64636)346437", R.drawable.love));
        FirstContact.add(new contact("sanjay", "(111)235325235", R.drawable.shopcluse));
        FirstContact.add(new contact("yash", "(64636)346437", R.drawable.snapdeal));
        FirstContact.add(new contact("sanjay", "(111)235325235", R.drawable.myantra));
        FirstContact.add(new contact("yash", "(64636)346437", R.drawable.love));
        FirstContact.add(new contact("sanjay", "(111)235325235", R.drawable.jobong));
        FirstContact.add(new contact("yash", "(64636)346437", R.drawable.amazon));

        RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(getContext(), FirstContact);
        recylerview.setAdapter(recyclerViewAdapter);

        return view;
    }
}




