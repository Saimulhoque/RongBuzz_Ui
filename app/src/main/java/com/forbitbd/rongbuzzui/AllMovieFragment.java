package com.forbitbd.rongbuzzui;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.forbitbd.rongbuzzui.adapter.RecyclerviewAdapter;
import com.forbitbd.rongbuzzui.model.Movie;

import java.util.ArrayList;


public class AllMovieFragment extends Fragment {

   private RecyclerView recyclerView;
   private RecyclerviewAdapter adapter;
   private ArrayList<Movie> movieList;

    public AllMovieFragment() {
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
        View view = inflater.inflate(R.layout.fragment_all_movie, container, false);

        recyclerView = view.findViewById(R.id.recyclerview);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(),3,RecyclerView.VERTICAL,false);
        recyclerView.setLayoutManager(gridLayoutManager);
        movieList = new ArrayList<>();
        movieList.add(new Movie(R.drawable.chicken_run, "Chicken Run"));
        movieList.add(new Movie(R.drawable.world_tour, "Trolls World Tour"));
        movieList.add(new Movie(R.drawable.the_tale, "The Tale Of Despereaux"));
        movieList.add(new Movie(R.drawable.aladdin, "Aladdin"));
        movieList.add(new Movie(R.drawable.chicken_run, "Chicken Run"));
        movieList.add(new Movie(R.drawable.world_tour, "Trolls World Tour"));
        movieList.add(new Movie(R.drawable.the_tale, "The Tale Of Despereaux"));
        movieList.add(new Movie(R.drawable.aladdin, "Aladdin"));
        movieList.add(new Movie(R.drawable.chicken_run, "Chicken Run"));
        movieList.add(new Movie(R.drawable.world_tour, "Trolls World Tour"));
        movieList.add(new Movie(R.drawable.the_tale, "The Tale Of Despereaux"));
        movieList.add(new Movie(R.drawable.aladdin, "Aladdin"));
        adapter = new RecyclerviewAdapter(getContext(),movieList);
        recyclerView.setAdapter(adapter);

        return view;
    }
}