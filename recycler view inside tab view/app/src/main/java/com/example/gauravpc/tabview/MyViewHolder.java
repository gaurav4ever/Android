package com.example.gauravpc.tabview;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by gaurav pc on 25-Apr-16.
 */
public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

    TextView list_week,list_option,list_cost;
    ItemClickListener itemClickListener;
    TextView title_flag,title_name,title_capital;

   // itemView.setOnClickListener(this);

    public MyViewHolder(View itemView) {
        super(itemView);
        list_week=(TextView)itemView.findViewById(R.id.week_id);
        list_option=(TextView)itemView.findViewById(R.id.option_id);
        list_cost=(TextView)itemView.findViewById(R.id.cost_id);

        itemView.setOnClickListener(this);
    }
    public void setItemClickListener(ItemClickListener ic){
        this.itemClickListener=ic;
    }

    @Override
    public void onClick(View v) {
        this.itemClickListener.onItemClick(v,getLayoutPosition());
    }
}
