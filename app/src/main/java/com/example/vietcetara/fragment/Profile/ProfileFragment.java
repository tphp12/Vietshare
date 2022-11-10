package com.example.vietcetara.fragment.Profile;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.vietcetara.R;
import com.example.vietcetara.model.Profile;

import java.util.ArrayList;


public class ProfileFragment extends Fragment {
    RecyclerView rvProfile_horizon;
    ArrayList<Profile> profiles_horizon;
    ProfileHorizontalAdapter profileAdapter_horizon;
    //
    RecyclerView rvProfile_vertical;
    ArrayList<Profile> profiles_vertical;
    ProfileVerticalAdapter profileAdapter_vertical;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_profile, container, false);

        loadDataHorizontal();
        loadDataVertical();
        rvProfile_horizon = view.findViewById(R.id.rcv_profile_horizontal);
        profileAdapter_horizon = new ProfileHorizontalAdapter(profiles_horizon);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(requireContext(),LinearLayoutManager.HORIZONTAL,false);
        rvProfile_horizon.setAdapter(profileAdapter_horizon);
        rvProfile_horizon.setLayoutManager(linearLayoutManager);
        //
        rvProfile_vertical = view.findViewById(R.id.rcv_profile_vertical);
        profileAdapter_vertical = new ProfileVerticalAdapter(profiles_vertical);

        LinearLayoutManager linearLayoutManager2 = new LinearLayoutManager(getContext());
        rvProfile_vertical.setAdapter(profileAdapter_vertical);
        rvProfile_vertical.setLayoutManager(linearLayoutManager2);

        return view;
    }
    private void loadDataHorizontal() {
        profiles_horizon = new ArrayList<>();

        profiles_horizon.add(new Profile("series1.jpg","Tóm lại là","Trả lời ngắn gọn các câu hỏi quan trọng nhất xung quanh một sự kiện: Ai? Làm gì? Khi nào? Ở đâu? Bao nhiêu? Như thế nào? Tại sao?","12"));
        profiles_horizon.add(new Profile("post1.jpeg","Gia tuan cui bap ","ha phuong xinh dep","12"));
        profiles_horizon.add(new Profile("post2.jpeg","Gia tuan tao lao ","ha phuong xinh dep","12"));
    }
    private void loadDataVertical() {
        profiles_vertical = new ArrayList<>();

        profiles_vertical.add(new Profile("post0.jpeg","Hello","12"));
        profiles_vertical.add(new Profile("post1.jpeg","Gia tuan cui bap ","12"));
        profiles_vertical.add(new Profile("post2.jpeg","Gia tuan tao lao ","12"));
    }
}