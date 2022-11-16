package com.example.vietcetara.fragment.Home;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.example.vietcetara.R;
import com.example.vietcetara.model.Post;

import java.util.ArrayList;

public class HomeFragment extends Fragment {
    RecyclerView rvListC;
    ArrayList<Post> posts;
    HomeAdapter postAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_home, container, false);

        loadData();
        rvListC = view.findViewById(R.id.rvC);
        postAdapter = new HomeAdapter(posts);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(container.getContext());
        rvListC.setAdapter(postAdapter);
        rvListC.setLayoutManager(linearLayoutManager);
        return view;
    }

    private void loadData() {
        posts = new ArrayList<>();

        posts.add(new Post("post1.jpeg","Đáng Tiền: 3 Triệu mua Kindle để trải nghiệm sự gọn gàng của những con chữ","Năm 18 tuổi, tôi có cho mình gia tài đầu tiên là một tủ sách to kê ở góc phòng. Đấy là toàn bộ những gì tôi gom nhặt suốt từ khi bắt đầu yêu thích con chữ và sự đọc. Ở đó có từ những cuốn văn học Nga đã cũ ông ngoại để cho đến truyện tranh, sách nghiên cứu.",
                "Thư Vũ","SÁCH BÁO"));
    }
}