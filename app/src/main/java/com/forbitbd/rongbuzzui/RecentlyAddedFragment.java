package com.forbitbd.rongbuzzui;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.forbitbd.rongbuzzui.adapter.RecyclerviewAdapter;
import com.forbitbd.rongbuzzui.model.Movie;

import java.util.ArrayList;


public class RecentlyAddedFragment extends Fragment {

    private RecyclerView recyclerView;
    private RecyclerviewAdapter adapter;
    private ArrayList<Movie> movieList;

    public RecentlyAddedFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_recently_added, container, false);

        recyclerView = view.findViewById(R.id.recyclerview);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(),RecyclerView.HORIZONTAL,false);
        recyclerView.setLayoutManager(linearLayoutManager);
        movieList = new ArrayList<>();
        movieList.add(new Movie(R.drawable.chicken_run,"Chicken Run"));
        movieList.add(new Movie(R.drawable.frozen2_img,"Frozen ll"));
        movieList.add(new Movie(R.drawable.chicken_run,"Chicken Run"));
        movieList.add(new Movie(R.color.green,"Chicken Run"));
        movieList.add(new Movie(R.drawable.chicken_run,"Chicken Run"));
        adapter = new RecyclerviewAdapter(getContext(),movieList);
        recyclerView.setAdapter(adapter);
        return view;
    }
}