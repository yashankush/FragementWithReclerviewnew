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

public class Fragement_Recharge extends Fragment {
    private RecyclerView recylerview;
    private List<contact> FirstContact;

    View v;

    public Fragement_Recharge() {
    }

    @Override
    public View onCreateView( LayoutInflater inflater,  ViewGroup container, Bundle savedInstanceState) {
        v=inflater.inflate(R.layout.fav_fragement,container,false);
        recylerview = (RecyclerView)v.findViewById(R.id.fav_reclerview);
        recylerview.setLayoutManager(new LinearLayoutManager(getActivity()));
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(getActivity(),2);
        recylerview.setLayoutManager(layoutManager);


        FirstContact = new ArrayList<>();
        ///
        FirstContact.add(new contact("sanjay", "(111)235325235", R.drawable.paytm));
        FirstContact.add(new contact("yash", "(64636)346437", R.drawable.mobikwik));
        FirstContact.add(new contact("sanjay", "(111)235325235", R.drawable.freecharge));
        FirstContact.add(new contact("yash", "(64636)346437", R.drawable.airtal));
        FirstContact.add(new contact("sanjay", "(111)235325235", R.drawable.amazonpay));
        FirstContact.add(new contact("yash", "(64636)346437", R.drawable.jio));
        FirstContact.add(new contact("sanjay", "(111)235325235", R.drawable.oxignen));
        FirstContact.add(new contact("yash", "(64636)346437", R.drawable.bses));
        FirstContact.add(new contact("sanjay", "(111)235325235", R.drawable.tataskay));
        FirstContact.add(new contact("yash", "(64636)346437", R.drawable.jio));

        RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(getContext(), FirstContact);
        recylerview.setAdapter(recyclerViewAdapter);

        return v;
    }
}



