package com.forbitbd.rongbuzzui.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.forbitbd.rongbuzzui.R;
import com.forbitbd.rongbuzzui.model.LiveTv;

import java.util.List;

public class TvAdapter extends RecyclerView.Adapter<TvAdapter.MyViewHolder> {

    private Context context;
    private List<LiveTv> liveTvList;


    public TvAdapter(Context context, List<LiveTv> liveTvList) {
        this.context = context;
        this.liveTvList = liveTvList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.tv_item,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        LiveTv liveTv = liveTvList.get(position);
        holder.img.setImageResource(liveTv.getIcon());
        holder.txt.setText(liveTv.getTitle());
    }

    @Override
    public int getItemCount() {
        return liveTvList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView img;
        TextView txt;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            img = itemView.findViewById(R.id.image);
            txt = itemView.findViewById(R.id.title);
        }
    }
}
