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
import com.example.vietcetara.model.Post;
import com.example.vietcetara.model.Series;

import java.util.ArrayList;


public class SeriesFragment extends Fragment {
    RecyclerView rvSeries_horizon;
    ArrayList<Series> series_horizon;
    SeriesHorizontalAdapter seriesAdapter_horizon;
    //
    RecyclerView rvSeries_vertical;
    ArrayList<Series> series_vertical;
    SeriesVerticalAdapter seriesAdapter_vertical;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_series, container, false);

        loadDataHorizontal();
        loadDataVertical();
        rvSeries_horizon = view.findViewById(R.id.rcv_series_horizontal);
        seriesAdapter_horizon = new SeriesHorizontalAdapter(series_horizon);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(requireContext(),LinearLayoutManager.HORIZONTAL,false);
        rvSeries_horizon.setAdapter(seriesAdapter_horizon);
        rvSeries_horizon.setLayoutManager(linearLayoutManager);
        //
        rvSeries_vertical = view.findViewById(R.id.rcv_series_vertical);
        seriesAdapter_vertical = new SeriesVerticalAdapter(series_vertical);
        rvSeries_vertical.setNestedScrollingEnabled(false);
        rvSeries_vertical.setHasFixedSize(false);
        LinearLayoutManager linearLayoutManager2 = new LinearLayoutManager(requireContext(),LinearLayoutManager.VERTICAL, false);
        rvSeries_vertical.setAdapter(seriesAdapter_vertical);
        rvSeries_vertical.setLayoutManager(linearLayoutManager2);

        return view;
    }
    private void loadDataHorizontal() {
        series_horizon = new ArrayList<>();

        series_horizon.add(new Series("series1.jpg","Tóm lại là","Trả lời ngắn gọn các câu hỏi quan trọng nhất xung quanh một sự kiện: Ai? Làm gì? Khi nào? Ở đâu? Bao nhiêu? Như thế nào? Tại sao?","12"));
        series_horizon.add(new Series("post1.jpeg","Gia tuan cui bap ","ha phuong xinh dep","12"));
        series_horizon.add(new Series("post2.jpeg","Gia tuan tao lao ","ha phuong xinh dep","12"));
    }
    private void loadDataVertical() {
        series_vertical = new ArrayList<>();
//
//        series_vertical.add(new Series("post0.jpeg","Hello","12"));
//        series_vertical.add(new Series("post1.jpeg","Gia tuan cui bap ","12"));
//        series_vertical.add(new Series("post2.jpeg","Gia tuan tao lao ","12"));

    }
}