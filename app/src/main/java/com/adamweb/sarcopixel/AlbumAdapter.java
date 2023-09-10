package com.adamweb.sarcopixel;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AlbumAdapter extends RecyclerView.Adapter<AlbumViewHolder> {

    Context context;
    List<AlbumItem> items;
    public AlbumAdapter(Context context, List<AlbumItem> items) {
        this.context = context;
        this.items = items;
    }


    @NonNull
    @Override
    public AlbumViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new AlbumViewHolder(LayoutInflater.from(context).inflate(R.layout.album_layout, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull AlbumViewHolder holder, int position) {
        holder.textView1.setText(items.get(position).getAlbumName());
        holder.textView2.setText(items.get(position).getDate());
        holder.imageView1.setImageResource(items.get(position).getImage1());
        holder.imageView2.setImageResource(items.get(position).getImage2());
        holder.imageView3.setImageResource(items.get(position).getImage3());
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}
