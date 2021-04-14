package com.forbitbd.rongbuzzui.category;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.forbitbd.rongbuzzui.R;
import com.forbitbd.rongbuzzui.adapter.CatAdapter;
import com.forbitbd.rongbuzzui.model.Category;

import java.util.ArrayList;


public class ButtonFragment extends Fragment {

    private RecyclerView recyclerView;
    private CatAdapter adapter;
    private ArrayList<Category> categoryList;

    public ButtonFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_button, container, false);


        recyclerView = view.findViewById(R.id.recyclerview);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(),RecyclerView.HORIZONTAL,false);
        recyclerView.setLayoutManager(linearLayoutManager);
        categoryList = new ArrayList<>();
        categoryList.add(new Category(R.drawable.hollywood,"Hollywood"));
        categoryList.add(new Category(R.drawable.bollywood,"Bollywood"));
        categoryList.add(new Category(R.drawable.chinese,"Chinese"));
        categoryList.add(new Category(R.drawable.japanese,"Japanese"));
        categoryList.add(new Category(R.drawable.korean,"Korean"));
        categoryList.add(new Category(R.drawable.southindian,"South Indian "));

        adapter = new CatAdapter(getContext(),categoryList);
        recyclerView.setAdapter(adapter);
        return view;
    }
}