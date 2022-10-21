package com.example.vietcetara;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import com.example.vietcetara.fragment.HomeFragment;
import info.androidhive.fontawesome.FontTextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // load fragment
        loadFragment(new HomeFragment());
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