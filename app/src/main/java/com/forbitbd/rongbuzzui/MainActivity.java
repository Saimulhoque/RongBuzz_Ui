package com.forbitbd.rongbuzzui;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;

import com.forbitbd.rongbuzzui.home.HomeFragment;
import com.forbitbd.rongbuzzui.kids.KidsFragment;
import com.forbitbd.rongbuzzui.sports.SportsFragment;
import com.forbitbd.rongbuzzui.tv.TvFragment;
import com.forbitbd.rongbuzzui.upcoming.UpcomingFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        loadFragment(new HomeFragment());
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id = item.getItemId();
                if (id == R.id.home){
                    loadFragment(new HomeFragment());
                    return true;
                }else if (id == R.id.upcoming){
                    loadFragment(new UpcomingFragment());
                    return true;
                }else if (id == R.id.livetv) {
                    loadFragment(new TvFragment());
                    return true;
                }else if (id == R.id.sports){
                    loadFragment(new SportsFragment());
                    return true;
                }else if (id == R.id.kids) {
                    loadFragment(new KidsFragment());
                    return true;
                }
                return false;
            }
        });

    }
    public void loadFragment(Fragment fragment) {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.container, fragment);
        transaction.commit();
    }

}