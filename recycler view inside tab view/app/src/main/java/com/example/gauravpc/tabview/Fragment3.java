package com.example.gauravpc.tabview;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * Created by gaurav pc on 23-Apr-16.
 */
public class Fragment3 extends Fragment {
    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    RecyclerView.LayoutManager layoutManager;
    ArrayList<ListProvider> arrayList=new ArrayList<>();
    String[] Name,Option,Cost;
    int[] img_id={
            R.drawable.sj1,R.drawable.sj2,R.drawable.sj3,R.drawable.sj4
    };

    public View onCreateView(LayoutInflater inflater,ViewGroup container,
                             Bundle savedInstanceState){
        View v=inflater.inflate(R.layout.fragment3,null);

        //Recycler View for fragment 1
        recyclerView=(RecyclerView)v.findViewById(R.id.fragment3);
        layoutManager=new LinearLayoutManager(this.getActivity());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);

        Name=getResources().getStringArray(R.array.week_name);
        Option=getResources().getStringArray(R.array.option_list);
        Cost=getResources().getStringArray(R.array.cost_list);


        ListProvider listProvider=new ListProvider(Option[0],Cost[0],Name[0]);
        arrayList.add(listProvider);
        listProvider=new ListProvider(Option[1],Cost[1],Name[1]);
        arrayList.add(listProvider);
        listProvider=new ListProvider(Option[2],Cost[2],Name[2]);
        arrayList.add(listProvider);
        listProvider=new ListProvider(Option[2],Cost[3],Name[3]);
        arrayList.add(listProvider);
        listProvider=new ListProvider(Option[2],Cost[4],Name[4]);
        arrayList.add(listProvider);
        listProvider=new ListProvider(Option[2],Cost[5],Name[5]);
        arrayList.add(listProvider);
        listProvider=new ListProvider(Option[2],Cost[6],Name[6]);
        arrayList.add(listProvider);


        adapter=new MyRecyclerAdapter(arrayList);
        recyclerView.setAdapter(adapter);


        return v;
    }
    public String toString(){
        return "Fragment3";
    }
}
