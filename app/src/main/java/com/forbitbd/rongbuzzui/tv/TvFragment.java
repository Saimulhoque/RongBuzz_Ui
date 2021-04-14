package com.forbitbd.rongbuzzui.tv;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.forbitbd.rongbuzzui.R;
import com.forbitbd.rongbuzzui.adapter.TvAdapter;
import com.forbitbd.rongbuzzui.model.LiveTv;

import java.util.ArrayList;

public class TvFragment extends Fragment {

    private RecyclerView recyclerView;
    private ArrayList<LiveTv> liveTvList;
    private TvAdapter adapter;

    public TvFragment() {
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
        View view = inflater.inflate(R.layout.fragment_tv, container, false);

        recyclerView = view.findViewById(R.id.recyclerview);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(),3,RecyclerView.VERTICAL,false);
        recyclerView.setLayoutManager(gridLayoutManager);
        liveTvList = new ArrayList<>();
        liveTvList.add(new LiveTv(R.drawable.somoy,"Somoy Tv"));
        liveTvList.add(new LiveTv(R.drawable.gtv,"Gazi Tv"));
        liveTvList.add(new LiveTv(R.drawable.atn,"ATN Bangla"));
        adapter = new TvAdapter(getContext(),liveTvList);
        recyclerView.setAdapter(adapter);
        return view;
    }
}