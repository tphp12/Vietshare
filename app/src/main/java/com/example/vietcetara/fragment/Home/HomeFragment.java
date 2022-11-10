package com.example.vietcetara.fragment.Home;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.example.vietcetara.R;
import com.example.vietcetara.model.Home;

import java.util.ArrayList;

public class HomeFragment extends Fragment {
    RecyclerView rvListC;
    ArrayList<Home> posts;
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

        posts.add(new Home("post1.jpeg","Đáng Tiền: 3 Triệu mua Kindle để trải nghiệm sự gọn gàng của những con chữ","Năm 18 tuổi, tôi có cho mình gia tài đầu tiên là một tủ sách to kê ở góc phòng. Đấy là" +
                    " toàn bộ những gì tôi gom nhặt suốt từ khi bắt đầu yêu thích con chữ và sự đọc. Ở đó có từ những cuốn văn học Nga" +
                    " đã cũ ông ngoại để cho đến truyện tranh, sách nghiên cứu.","Thư Vũ","SÁCH BÁO"));
        posts.add(new Home("post0.jpeg","Đánh giá iPhone 14 Pro Max: Sự nâng cấp mạnh mẽ từ thiết kế đến tính năng","Các dòng iPhone 14 Apple ra mắt vào tháng 9.","Duy Luân","CÔNG NGHỆ"));
        posts.add(new Home("post2.jpeg","Hà Giang Việt Nam lọt top 100 điểm du lịch được đánh giá cao thế giới","Vùng cao núi đá phía bắc nằm sát chí tuyến bắc, có độ dốc khá lớn, thung lũng và sông suối bị chia cắt nhiều. Nằm trong vùng khí hậu cận nhiệt đới ẩm nhưng do địa hình cao nên khí hậu nơi này mang nhiều sắc thái ôn đới.","Nam Hà","THIÊN NHIÊN"));
    }
}