package com.adamweb.sarcopixel;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class AlbumViewHolder extends RecyclerView.ViewHolder {

    ImageView imageView1, imageView2, imageView3;
    TextView textView1, textView2;
    public AlbumViewHolder(@NonNull View itemView) {
        super(itemView);
        imageView1 = itemView.findViewById(R.id.image1);
        imageView2 = itemView.findViewById(R.id.image2);
        imageView3 = itemView.findViewById(R.id.image3);
        textView1 = itemView.findViewById(R.id.text1);
        textView2 = itemView.findViewById(R.id.text2);
    }
}
