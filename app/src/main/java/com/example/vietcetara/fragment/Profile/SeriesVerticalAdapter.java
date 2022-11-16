package com.example.vietcetara.fragment.Profile;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.vietcetara.R;
import com.example.vietcetara.Utils;
import com.example.vietcetara.model.Post;
import com.example.vietcetara.model.Series;

import java.util.ArrayList;

public class SeriesVerticalAdapter extends RecyclerView.Adapter<SeriesVerticalAdapter.SeriesViewHolder> {
    ArrayList<Series> lstSeries;
    Context context;
    SeriesHorizontalAdapter.SeriesCallback seriesCallback;
    public SeriesVerticalAdapter(ArrayList<Series> lstSeries, SeriesHorizontalAdapter.SeriesCallback seriesCallback) {
        this.lstSeries = lstSeries;
        this.seriesCallback = seriesCallback;
    }
    public SeriesVerticalAdapter(ArrayList<Series> lstSeries) {
        this.lstSeries = lstSeries;
    }
    @NonNull
    @Override
    public SeriesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View seriesView = inflater.inflate(R.layout.item_series_vertical, parent, false);
        SeriesVerticalAdapter.SeriesViewHolder viewHolder = new SeriesVerticalAdapter.SeriesViewHolder(seriesView);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull SeriesViewHolder holder, int position) {
        Series item = lstSeries.get(position);

        holder.iv_vertical.setImageBitmap(Utils.convertToBitMapFromAssets(context,item.getImage()));
        holder.tv_title_vertical.setText(item.getTitle());
        holder.tv_numberOfPost.setText(item.getNumberOfPost());
    }

    @Override
    public int getItemCount() {
        return lstSeries.size();
    }

    class SeriesViewHolder extends RecyclerView.ViewHolder {
        ImageView iv_vertical;
        TextView tv_title_vertical;
        TextView tv_numberOfPost;

        public SeriesViewHolder(@NonNull View itemView) {
            super(itemView);
            iv_vertical = itemView.findViewById(R.id.iv_series_vertical);
            tv_title_vertical = itemView.findViewById(R.id.tv_series_title_vertical);
            tv_numberOfPost = itemView.findViewById(R.id.tv_series_numberOfPost_vertical);
        }
    }

    public interface SeriesCallback{
        void onItemClick(String id);
    }
}
