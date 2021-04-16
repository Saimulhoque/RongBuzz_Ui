package com.forbitbd.rongbuzzui.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.forbitbd.rongbuzzui.CatClickListener;
import com.forbitbd.rongbuzzui.model.Category;
import com.forbitbd.rongbuzzui.R;

import java.util.List;

public class CatAdapter extends RecyclerView.Adapter<CatAdapter.CatHolder> {

    private Context context;
    private List<Category> categoryList;
    private CatClickListener listener;

    public CatAdapter(Context context, List<Category> categoryList, CatClickListener listener) {
        this.context = context;
        this.categoryList = categoryList;
        this.listener = listener;
    }

    @NonNull
    @Override
    public CatHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_cat,parent,false);
        return new CatHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CatHolder holder, int position) {
        Category category = categoryList.get(position);
        holder.img.setImageResource(category.getIcon());
        holder.txt.setText(category.getTitle());
    }

    @Override
    public int getItemCount() {
        return categoryList.size();
    }

    public class CatHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        ImageView img;
        TextView txt;
        public CatHolder(@NonNull View itemView) {
            super(itemView);

            img = itemView.findViewById(R.id.icon);
            txt = itemView.findViewById(R.id.title);
            itemView.setOnClickListener(this);

        }

        @Override
        public void onClick(View v) {
            listener.OnCatItemClick(categoryList.get(getAdapterPosition()));
        }
    }
}
