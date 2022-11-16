package com.example.vietcetara.fragment.Series;

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
import com.example.vietcetara.model.Series;

import java.util.ArrayList;

public class SeriesHorizontalAdapter extends RecyclerView.Adapter<SeriesHorizontalAdapter.SeriesViewHolder>{
    ArrayList<Series> lstSeries;
    Context context;
    SeriesCallback seriesCallback;
    public SeriesHorizontalAdapter(ArrayList<Series> lstSeries, SeriesCallback seriesCallback) {
        this.lstSeries = lstSeries;
        this.seriesCallback = seriesCallback;
    }
    public SeriesHorizontalAdapter(ArrayList<Series> lstSeries) {
        this.lstSeries = lstSeries;
    }
    @NonNull
    @Override
    public SeriesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View seriesView = inflater.inflate(R.layout.item_series_horizontal, parent, false);
        SeriesViewHolder viewHolder = new SeriesViewHolder(seriesView);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull SeriesViewHolder holder, int position) {
        Series item = lstSeries.get(position);

        holder.iv_horizon.setImageBitmap(Utils.convertToBitMapFromAssets(context,item.getImage()));
        holder.tv_title_horizon.setText(item.getTitle());
        holder.tv_about_horizon.setText(item.getAbout());
        holder.tv_numberOfPost.setText(item.getNumberOfPost());
    }

    @Override
    public int getItemCount() {
        return lstSeries.size();
    }

    class SeriesViewHolder extends RecyclerView.ViewHolder {
        ImageView iv_horizon;
        TextView tv_title_horizon;
        TextView tv_about_horizon;
        TextView tv_numberOfPost;

        public SeriesViewHolder(@NonNull View itemView) {
            super(itemView);
            iv_horizon = itemView.findViewById(R.id.iv_series_horizontal);
            tv_title_horizon = itemView.findViewById(R.id.tv_series_title_horizontal);
            tv_about_horizon = itemView.findViewById(R.id.tv_series_about_horizontal);
            tv_numberOfPost = itemView.findViewById(R.id.tv_series_numberOfPost);
        }
    }

    public interface SeriesCallback{
        void onItemClick(String id);
    }
}
