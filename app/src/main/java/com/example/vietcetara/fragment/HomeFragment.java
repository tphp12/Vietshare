package com.example.vietcetara.fragment;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.vietcetara.R;
import info.androidhive.fontawesome.FontTextView;

public class HomeFragment extends Fragment {
    ImageView imgLogo;
    ImageView imgContent;
    ImageView imgContent1;
    TextView txtContent;
    TextView txtDescription;
    TextView txtContent1;
    TextView txtDescription1;

    FontTextView userProfile;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_home, container, false);
        imgLogo = view.findViewById(R.id.mainLogo);
        imgLogo.setImageResource(R.drawable.main_logo);

        imgContent = view.findViewById(R.id.imgContent);
        imgContent.setImageResource(R.drawable.kindle);

        txtContent = view.findViewById(R.id.txtContent);
        txtContent.setText(R.string.content);

        txtDescription = view.findViewById(R.id.txtDescription);
        txtDescription.setText(R.string.description);

        txtContent1 = view.findViewById(R.id.txtContent1);
        txtContent1.setText(R.string.content1);

        txtDescription1 = view.findViewById(R.id.txtDescription1);
        txtDescription1.setText(R.string.description1);

        imgContent1 = view.findViewById(R.id.imgContent1);
        imgContent1.setImageResource(R.drawable.ip14);

        userProfile = view.findViewById(R.id.userProfile);
        // Inflate the layout for this fragment
        return view;
    }
}