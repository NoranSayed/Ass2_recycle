package com.route.post;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class PostAdapter extends RecyclerView.Adapter<PostAdapter.PostViewHolder> {

    private List<Post> postList;

    public PostAdapter(List<Post> postList) {
        this.postList = postList;
    }

    @NonNull
    @Override
    public PostViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_post, parent, false);
        return new PostViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PostViewHolder holder, int position) {
        Post post = postList.get(position);
        holder.profileName.setText(post.getProfileName());
        holder.postTime.setText(post.getPostTime());
        holder.postText.setText(post.getPostText());
        holder.postLink.setText(post.getPostLink());
        holder.postImage.setBackgroundColor(post.getImageColor());
        holder.likeCount.setText(String.valueOf(post.getLikeCount()));
        holder.shareCount.setText(post.getShareCountText());
    }

    @Override
    public int getItemCount() {
        return postList != null ? postList.size() : 0;
    }

    static class PostViewHolder extends RecyclerView.ViewHolder {
        ImageView profileImage;
        TextView profileName;
        TextView postTime;
        TextView postText;
        TextView postLink;
        View postImage;
        TextView likeCount;
        TextView shareCount;

        public PostViewHolder(@NonNull View itemView) {
            super(itemView);
            profileImage = itemView.findViewById(R.id.profileImage);
            profileName = itemView.findViewById(R.id.profileName);
            postTime = itemView.findViewById(R.id.postTime);
            postText = itemView.findViewById(R.id.postText);
            postLink = itemView.findViewById(R.id.postLink);
            postImage = itemView.findViewById(R.id.postImage);
            likeCount = itemView.findViewById(R.id.likeCount);
            shareCount = itemView.findViewById(R.id.shareCount);
        }
    }
}
