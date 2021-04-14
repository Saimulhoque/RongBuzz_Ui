package com.forbitbd.rongbuzzui.upcoming;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.forbitbd.rongbuzzui.R;
import com.forbitbd.rongbuzzui.adapter.UpcomingAdapter;
import com.forbitbd.rongbuzzui.model.Upcoming;

import java.util.ArrayList;


public class UpcomingFragment extends Fragment {

    private RecyclerView recyclerView;
    private UpcomingAdapter adapter;
    private ArrayList<Upcoming> upcomingList;

    public UpcomingFragment() {
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
        View view = inflater.inflate(R.layout.fragment_upcoming, container, false);

        recyclerView = view.findViewById(R.id.recyclerview);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(linearLayoutManager);
        upcomingList = new ArrayList<>();
        upcomingList.add(new Upcoming(R.drawable.frozen,R.drawable.frozen2_img,"Frozen 2","Animation","Frozen","Frozen II is a 2019 American computer-animated musical fantasy film produced by Walt Disney Animation Studios and distributed by Walt Disney Studios Motion Pictures. The 58th animated film produced by the studio, it is the sequel to the 2013 film Frozen."));
        upcomingList.add(new Upcoming(R.drawable.chicken_run_cover,R.drawable.chicken_run,"Chicken Run","Animation","Frozen","Chicken Run is a 2000 stop-motion animated comedy film produced by the British studio Aardman Animations in partnership with American studio DreamWorks Animation, and French studio Pathé."));
        adapter = new UpcomingAdapter(getContext(),upcomingList);
        recyclerView.setAdapter(adapter);
        return view;
    }
}