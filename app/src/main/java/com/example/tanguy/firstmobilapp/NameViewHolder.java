package com.example.tanguy.firstmobilapp;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class NameViewHolder extends RecyclerView.ViewHolder {

    TextView textViewName;
    public NameViewHolder(@NonNull View itemView) {
        super(itemView);
        textViewName = itemView.findViewById(R.id.input_name_textview);
    }

    public void setContent(String name){
        textViewName.setText(name);
    }
}

