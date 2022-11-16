package com.example.vietcetara;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.example.vietcetara.fragment.Home.HomeFragment;
import com.example.vietcetara.fragment.Profile.ProfileFragment;
import com.example.vietcetara.fragment.Series.SeriesFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {
    BottomNavigationView mnBottom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mnBottom = findViewById(R.id.navMenu);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Home");
        actionBar.setDisplayHomeAsUpEnabled(true);
        //
        actionBar.hide();
        loadFragment(new HomeFragment());
        mnBottom.setOnItemSelectedListener(getListener());
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
            return true;
        }
        return true;
    }

    void tittle (MenuItem item){

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle(item.toString());
        actionBar.setDisplayHomeAsUpEnabled(true);
    }
    @NonNull
    private NavigationBarView.OnItemSelectedListener getListener() {
        return new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.mnHome:
                        tittle(item);
                        loadFragment(new HomeFragment());
                        return true;
                    case R.id.mnSeries:
                        tittle(item);
                        loadFragment(new SeriesFragment());
                        return true;
                    case R.id.mnAccount:
                        tittle(item);
                        loadFragment(new ProfileFragment());
                        return true;
                }
                return true;
            }
        };
    }

    void loadFragment(Fragment fmnew) {
        FragmentTransaction fmTran = getSupportFragmentManager().beginTransaction();
        fmTran.replace(R.id.mainFrame, fmnew);
        fmTran.addToBackStack(null);
        fmTran.commit();
    }
}