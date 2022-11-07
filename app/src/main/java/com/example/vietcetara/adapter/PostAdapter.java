package com.example.vietcetara.adapter;

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
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class PostAdapter extends RecyclerView.Adapter<PostAdapter.UserViewHolder> {
    ArrayList<Post> lstPost;
    Context context;
    UserCallback userCallback;
    public PostAdapter(ArrayList<Post> lstPost, UserCallback userCallback) {
        this.lstPost = lstPost;
        this.userCallback=userCallback;
    }

    public PostAdapter(ArrayList<Post> lstPost) {
        this.lstPost = lstPost;
    }

    @NonNull
    @NotNull
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View homeView = inflater.inflate(R.layout.layout_home, parent, false);
        UserViewHolder viewHolder = new UserViewHolder(homeView);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull UserViewHolder holder, int position) {
        Post item = lstPost.get(position);

        holder.imgPost.setImageBitmap(Utils.convertToBitMapFromAssets(context,item.getImage()));
        holder.txtContent.setText(item.getContent());
        holder.txtDescription.setText(item.getDescription());
        holder.txtAuthor.setText(item.getAuthor());
        holder.txtTopic.setText(item.getTopic());
    }

    @Override
    public int getItemCount() {
        return lstPost.size();
    }

    class UserViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPost;
        TextView txtContent;
        TextView txtDescription;
        TextView txtAuthor;
        TextView txtTopic;
        public UserViewHolder(@NonNull @NotNull View itemView) {
            super(itemView);
            imgPost = itemView.findViewById(R.id.imgContent);
            txtContent = itemView.findViewById(R.id.txtContent);
            txtDescription = itemView.findViewById(R.id.txtDescription);
            txtAuthor = itemView.findViewById(R.id.txtAuthor);
            txtTopic = itemView.findViewById(R.id.txtTopic);
        }
    }

    public interface UserCallback{
        void onItemClick(String id);
    }
}
