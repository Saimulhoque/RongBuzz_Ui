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
import com.forbitbd.rongbuzzui.model.Upcoming;

import java.util.List;

public class UpcomingAdapter extends RecyclerView.Adapter<UpcomingAdapter.ViewHolder> {

    private Context context;
    private List<Upcoming> upcomingList;

    public UpcomingAdapter(Context context, List<Upcoming> upcomingList) {
        this.context = context;
        this.upcomingList = upcomingList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.upcoming_item,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Upcoming upcoming = upcomingList.get(position);
        holder.imageView1.setImageResource(upcoming.getCoverimage());
        holder.imageView2.setImageResource(upcoming.getMovieimage());
        holder.textView1.setText(upcoming.getMoviename());
        holder.textView2.setText(upcoming.getGenre());
        holder.textView3.setText(upcoming.getActors());
        holder.textView4.setText(upcoming.getDescription());

    }

    @Override
    public int getItemCount() {
        return upcomingList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView1,imageView2;
        TextView textView1, textView2, textView3, textView4;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView1 = itemView.findViewById(R.id.cover_image);
            imageView2 = itemView.findViewById(R.id.movie_image);
            textView1 = itemView.findViewById(R.id.movie_name);
            textView2 = itemView.findViewById(R.id.movie_genre);
            textView3 = itemView.findViewById(R.id.movie_actors);
            textView4 = itemView.findViewById(R.id.movie_description);

        }
    }
}
