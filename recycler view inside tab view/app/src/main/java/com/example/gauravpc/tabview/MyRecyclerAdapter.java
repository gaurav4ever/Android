package com.example.gauravpc.tabview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by gaurav pc on 25-Apr-16.
 */
public class MyRecyclerAdapter extends RecyclerView.Adapter<MyViewHolder>{

    Context c;
    ArrayList<ListProvider>arrayList=new ArrayList<>();

    public MyRecyclerAdapter(ArrayList<ListProvider> arrayList) {
        this.arrayList=arrayList;
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view;
        MyViewHolder recyclerViewHolder;

        view= LayoutInflater.from(parent.getContext()).inflate(R.layout.list_layout,parent,false);
        recyclerViewHolder=new MyViewHolder(view);
        return recyclerViewHolder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        ListProvider listProvider;
        listProvider=arrayList.get(position);
        holder.list_week.setText(listProvider.getWeek_name());
        holder.list_option.setText(listProvider.getOption_name());
        holder.list_cost.setText(listProvider.getCost());
        holder.setItemClickListener(new ItemClickListener() {
            @Override
            public void onItemClick(View view, int pos) {
                Toast.makeText(c,ListProvider.class.getName(),Toast.LENGTH_LONG).show();
            }
        });
    }
}
