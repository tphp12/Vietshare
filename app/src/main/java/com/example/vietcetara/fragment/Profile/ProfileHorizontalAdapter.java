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

public class ProfileHorizontalAdapter extends RecyclerView.Adapter<ProfileHorizontalAdapter.ProfileViewHolder>{
    ArrayList<Profile> lstProfile;
    Context context;
    ProfileCallback profileCallback;
    public ProfileHorizontalAdapter(ArrayList<Profile> lstProfile, ProfileCallback profileCallback) {
        this.lstProfile = lstProfile;
        this.profileCallback = profileCallback;
    }
    public ProfileHorizontalAdapter(ArrayList<Profile> lstProfile) {
        this.lstProfile = lstProfile;
    }
    @NonNull
    @Override
    public ProfileViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View profileView = inflater.inflate(R.layout.item_profile_horizontal, parent, false);
        ProfileViewHolder viewHolder = new ProfileViewHolder(profileView);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ProfileViewHolder holder, int position) {
        Profile item = lstProfile.get(position);

        holder.iv_horizon.setImageBitmap(Utils.convertToBitMapFromAssets(context,item.getImage()));
        holder.tv_title_horizon.setText(item.getTitle());
        holder.tv_descrip_horizon.setText(item.getDescription());
        holder.tv_numberOfPost.setText(item.getNumberOfPost());
    }

    @Override
    public int getItemCount() {
        return lstProfile.size();
    }

    class ProfileViewHolder extends RecyclerView.ViewHolder {
        ImageView iv_horizon;
        TextView tv_title_horizon;
        TextView tv_descrip_horizon;
        TextView tv_numberOfPost;

        public ProfileViewHolder(@NonNull View itemView) {
            super(itemView);
            iv_horizon = itemView.findViewById(R.id.iv_Profile_Horizontal);
            tv_title_horizon = itemView.findViewById(R.id.tv_profile_title_horizontal);
            tv_descrip_horizon = itemView.findViewById(R.id.tv_profile_descrip_horizontal);
            tv_numberOfPost = itemView.findViewById(R.id.tv_profile_numberOfPost);
        }
    }

    public interface ProfileCallback{
        void onItemClick(String id);
    }
}
