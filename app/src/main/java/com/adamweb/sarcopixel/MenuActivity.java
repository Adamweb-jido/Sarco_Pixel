package com.adamweb.sarcopixel;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MenuActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;
    HomeFragment homeFragment = new HomeFragment();
    DiscoverFragment discoverFragment = new DiscoverFragment();
    ProfileFragment profileFragment = new ProfileFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        bottomNavigationView = findViewById(R.id.myNavBar);
        getSupportFragmentManager().beginTransaction().replace(R.id.myContainer, homeFragment).commit();

        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem item) {
                switch (item.getItemId()){
                    case R.id.homeTab:
                        getSupportFragmentManager().beginTransaction().replace(R.id.myContainer, homeFragment).commit();
                        return true;

                    case R.id.discoverTab:
                        getSupportFragmentManager().beginTransaction().replace(R.id.myContainer, discoverFragment).commit();
                        return true;

                    case R.id.profileTab:
                        getSupportFragmentManager().beginTransaction().replace(R.id.myContainer, profileFragment).commit();
                        return true;
                }
            return false;
            }
        });
    }
}