package com.adamweb.sarcopixel;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class SecondHomeActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_home);

        List<AlbumItem> items = new ArrayList<>();
        items.add(new AlbumItem("Adam's Album", "01-01-2023", R.drawable.albumimage1, R.drawable.albumimage2, R.drawable.albumimage3));
        items.add(new AlbumItem("Adam's Album", "01-01-2023", R.drawable.albumimage1, R.drawable.albumimage2, R.drawable.albumimage3));
        items.add(new AlbumItem("Adam's Album", "01-01-2023", R.drawable.albumimage1, R.drawable.albumimage2, R.drawable.albumimage3));
        items.add(new AlbumItem("Adam's Album", "01-01-2023", R.drawable.albumimage1, R.drawable.albumimage2, R.drawable.albumimage3));
        recyclerView = findViewById(R.id.albumRecycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new AlbumAdapter(getApplicationContext(), items));
    }
}