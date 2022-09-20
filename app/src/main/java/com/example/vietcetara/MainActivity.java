package com.example.vietcetara;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import info.androidhive.fontawesome.FontTextView;

public class MainActivity extends AppCompatActivity {
    ImageView imgLogo;
    ImageView imgContent;
    ImageView imgContent1;
    TextView txtContent;
    TextView txtDescription;
    TextView txtContent1;
    TextView txtDescription1;

    FontTextView userProfile;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        imgLogo = findViewById(R.id.mainLogo);
        imgLogo.setImageResource(R.drawable.main_logo);

        imgContent = findViewById(R.id.imgContent);
        imgContent.setImageResource(R.drawable.kindle);

        txtContent = findViewById(R.id.txtContent);
        txtContent.setText(R.string.content);

        txtDescription = findViewById(R.id.txtDescription);
        txtDescription.setText(R.string.description);

        txtContent1 = findViewById(R.id.txtContent1);
        txtContent1.setText(R.string.content1);

        txtDescription1 = findViewById(R.id.txtDescription1);
        txtDescription1.setText(R.string.description1);

        imgContent1 = findViewById(R.id.imgContent1);
        imgContent1.setImageResource(R.drawable.ip14);

        userProfile = findViewById(R.id.userProfile);
        userProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"User Profile",Toast.LENGTH_SHORT).show();
            }
        });
    }
}