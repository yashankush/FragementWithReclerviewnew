package com.example.fragementwithreclerview;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
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
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v=inflater.inflate(R.layout.contacts_fragement,container,false);
        recylerview=(RecyclerView)v.findViewById(R.id.contacts_reclerview);
        RecyclerViewAdapter recyclerViewAdapter=new RecyclerViewAdapter(getContext(),FirstContact);
        recylerview.setLayoutManager(new LinearLayoutManager(getActivity()));
        recylerview.setAdapter(recyclerViewAdapter);


        return  v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FirstContact =new ArrayList<>();
        FirstContact.add(new contact("sanjay","(111)235325235",R.drawable.amazon));
        FirstContact.add(new contact("yash","(64636)346437",R.drawable.flipcart));
        FirstContact.add(new contact("sanjay","(111)235325235",R.drawable.myantra));
        FirstContact.add(new contact("yash","(64636)346437",R.drawable.snapdeal));

        FirstContact.add(new contact("sanjay","(111)235325235",R.drawable.shopcluse));
        FirstContact.add(new contact("yash","(64636)346437",R.drawable.snapdeal));
        FirstContact.add(new contact("sanjay","(111)235325235",R.drawable.myantra));
        FirstContact.add(new contact("yash","(64636)346437",R.drawable.snapdeal));
        FirstContact.add(new contact("sanjay","(111)235325235",R.drawable.jobong));
        FirstContact.add(new contact("yash","(64636)346437",R.drawable.amazon));



    }
}
