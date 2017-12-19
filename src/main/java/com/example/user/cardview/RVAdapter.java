package com.example.user.cardview;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by user on 18-12-2017.
 */
//Recylcler View Class
public class RVAdapter extends RecyclerView.Adapter<RVAdapter.VersionViewHolder> {

    ArrayList<String> versionList;   //referencee of ArrayList.

    //Constructor of RVAdapter
    public RVAdapter(ArrayList<String> list)
    {
        versionList=list;
    }

    //overrriden methods
    @Override
    public VersionViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        //inflating item_raw Layout
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_raw,parent,false);

        //making object of  VersionViewHolder class
        VersionViewHolder tempObj=new VersionViewHolder(view);

        return tempObj;
    }

    //overriden method
    @Override
    public void onBindViewHolder(VersionViewHolder holder, int position) {
        //Setting text to textView.
        holder.versionName.setText(versionList.get(position));
    }

    @Override
    public int getItemCount() {
        return versionList.size();
    }

    //Creating nested class by extending RecyclerView.ViewHolder.
    public static class VersionViewHolder extends RecyclerView.ViewHolder
    {
        //creating references of CardView and textView.
        CardView cardView;
        TextView versionName;

        //constructor.
        VersionViewHolder(View itemView)
        {
            super(itemView);

            //Setting references with their IDs.
            cardView=(CardView)itemView.findViewById(R.id.card_view);
            versionName=(TextView)itemView.findViewById(R.id.name_tv);

        }
    }
}
