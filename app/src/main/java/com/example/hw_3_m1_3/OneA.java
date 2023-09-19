package com.example.hw_3_m1_3;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class OneA extends Fragment {

  private RecyclerView rv_item;
  private ArrayList<String> itemList = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_one_a, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        rv_item = requireActivity().findViewById(R.id.rv_item);
        loadData();
        ItemAdapter adapter = new ItemAdapter(itemList);
        rv_item.setAdapter(adapter);
    }

    private void loadData() {
        itemList.add("Some random item");
        itemList.add("Some another random item");
        itemList.add("Some random item");
        itemList.add("Some random item");
        itemList.add("Some random item");
        itemList.add("Some random item");
        itemList.add("Some random item");
        itemList.add("Some random item");
        itemList.add("Some random item");
        itemList.add("Some random item");
        itemList.add("Some random item");
        itemList.add("Some random item");
        itemList.add("Some random item");
        itemList.add("Some random item");
        itemList.add("Some random item");
        itemList.add("Some random item");
        itemList.add("Some random item");
        itemList.add("Some random item");
        itemList.add("Some random item");
        itemList.add("Some random item");
    }
}