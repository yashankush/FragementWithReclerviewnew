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

public class Fragement_Women extends Fragment {
    View v;
    private RecyclerView recylerview;
    private List<contact> FirstContact;



    public Fragement_Women() {

    }

    @Override
    public View onCreateView( LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        v=inflater.inflate(R.layout.contacts_fragement,container,false);
        recylerview=(RecyclerView)v.findViewById(R.id.contacts_reclerview);
        recylerview.setLayoutManager(new LinearLayoutManager(getActivity()));
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(getActivity(),2);
        recylerview.setLayoutManager(layoutManager);





        FirstContact =new ArrayList<>();
        FirstContact.add(new contact("sanjay","(111)235325235",R.drawable.voonik));
        FirstContact.add(new contact("yash","(64636)346437",R.drawable.zivame));
        FirstContact.add(new contact("sanjay","(111)235325235",R.drawable.limeroad));
        FirstContact.add(new contact("yash","(64636)346437",R.drawable.nykaa));

        FirstContact.add(new contact("sanjay","(111)235325235",R.drawable.biba));
        FirstContact.add(new contact("yash","(64636)346437",R.drawable.craftsvilla));
        FirstContact.add(new contact("sanjay","(111)235325235",R.drawable.stalkbuylove));
        FirstContact.add(new contact("yash","(64636)346437",R.drawable.faballey));
        FirstContact.add(new contact("sanjay","(111)235325235",R.drawable.clovia));
        FirstContact.add(new contact("yash","(64636)346437",R.drawable.chumbak));
        FirstContact.add(new contact("sanjay","(111)235325235",R.drawable.preetyscrets));
        FirstContact.add(new contact("yash","(64636)346437",R.drawable.wforwomen));
        FirstContact.add(new contact("sanjay","(111)235325235",R.drawable.bluestone));
        FirstContact.add(new contact("yash","(64636)346437",R.drawable.voylla));
        FirstContact.add(new contact("sanjay","(111)235325235",R.drawable.flipcart));

        RecyclerViewAdapter recyclerViewAdapter=new RecyclerViewAdapter(getContext(),FirstContact);
        recylerview.setAdapter(recyclerViewAdapter);


        return v;


    }
}
