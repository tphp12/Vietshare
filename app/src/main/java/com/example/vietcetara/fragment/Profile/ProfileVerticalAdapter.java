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
import com.example.vietcetara.model.Profile;

import java.util.ArrayList;

public class ProfileVerticalAdapter extends RecyclerView.Adapter<ProfileVerticalAdapter.ProfileViewHolder> {
    ArrayList<Profile> lstProfile;
    Context context;
    ProfileHorizontalAdapter.ProfileCallback profileCallback;
    public ProfileVerticalAdapter(ArrayList<Profile> lstProfile, ProfileHorizontalAdapter.ProfileCallback profileCallback) {
        this.lstProfile = lstProfile;
        this.profileCallback = profileCallback;
    }
    public ProfileVerticalAdapter(ArrayList<Profile> lstProfile) {
        this.lstProfile = lstProfile;
    }
    @NonNull
    @Override
    public ProfileViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View profileView = inflater.inflate(R.layout.item_profile_vertical, parent, false);
        ProfileVerticalAdapter.ProfileViewHolder viewHolder = new ProfileVerticalAdapter.ProfileViewHolder(profileView);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ProfileViewHolder holder, int position) {
        Profile item = lstProfile.get(position);

        holder.iv_vertical.setImageBitmap(Utils.convertToBitMapFromAssets(context,item.getImage()));
        holder.tv_title_vertical.setText(item.getTitle());
        holder.tv_numberOfPost.setText(item.getNumberOfPost());
    }

    @Override
    public int getItemCount() {
        return lstProfile.size();
    }

    class ProfileViewHolder extends RecyclerView.ViewHolder {
        ImageView iv_vertical;
        TextView tv_title_vertical;
        TextView tv_numberOfPost;

        public ProfileViewHolder(@NonNull View itemView) {
            super(itemView);
            iv_vertical = itemView.findViewById(R.id.iv_profile_vertical);
            tv_title_vertical = itemView.findViewById(R.id.tv_profile_title_vertical);
            tv_numberOfPost = itemView.findViewById(R.id.tv_profile_numberOfPost_vertical);
        }
    }

    public interface ProfileCallback{
        void onItemClick(String id);
    }
}
