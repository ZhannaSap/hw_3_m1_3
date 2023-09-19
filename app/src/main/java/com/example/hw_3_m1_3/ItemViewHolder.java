package com.example.hw_3_m1_3;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ItemViewHolder extends RecyclerView.ViewHolder {
    private TextView tv_item;

    public ItemViewHolder(@NonNull View itemView) {
        super(itemView);
        tv_item = itemView.findViewById(R.id.rv_item);
    }
    public void bind(String itemName){
        tv_item.setText(itemName);
    }
}
