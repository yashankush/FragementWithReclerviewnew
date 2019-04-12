package com.example.fragementwithreclerview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {
    Context mContext;
    List<contact> mData;

    public RecyclerViewAdapter(Context mContext, List<contact> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @Override
    public MyViewHolder onCreateViewHolder( ViewGroup viewGroup, int i) {
        View v;
        v= LayoutInflater.from(mContext).inflate(R.layout.item_contact,viewGroup,false);
        MyViewHolder viewHolder=new MyViewHolder(v);
        return viewHolder;

    }

    @Override
    public void onBindViewHolder( MyViewHolder myViewHolder, int position) {
       myViewHolder.tv_name.setText(mData.get(position).getName());
//       myViewHolder.tv_phone.setText(mData.get(position).getPhone());
        //if you want to show phone number
        myViewHolder.img.setImageResource(mData.get(position).getPhoto());

    }

    @Override
    public int getItemCount() {
        return mData.size();  }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

       private TextView tv_name;
    ///    private TextView tv_phone;
        private ImageView img;


        public MyViewHolder( View itemView) {
            super(itemView);
            tv_name=(TextView)itemView.findViewById(R.id.textView);
        //    tv_phone=(TextView)itemView.findViewById(R.id.phone_contact);
            img=(ImageView)itemView.findViewById(R.id.imageView);


        }
    }
}
