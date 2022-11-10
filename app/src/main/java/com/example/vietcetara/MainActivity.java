package com.example.vietcetara;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import com.example.vietcetara.fragment.Home.HomeFragment;
import com.example.vietcetara.fragment.Profile.ProfileFragment;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // load fragment
        loadFragment(new ProfileFragment());
        hideBar();
    }

    private void hideBar() {
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
    }

    private void loadFragment(Fragment fmNew) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.mainFrame, fmNew);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }
}