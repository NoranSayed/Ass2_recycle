package com.route.post;

import android.graphics.Color;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class PostActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private PostAdapter adapter;
    private List<Post> postList;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post);

        initData();
        setupRecyclerView();
    }

    private void initData() {
        postList = new ArrayList<>();
        // Add dummy posts
        for (int i = 1; i <= 20; i++) {
            postList.add(new Post(
                    "User " + i,
                    i + " hrs",
                    "This is the content of post number " + i + ". Buckle up, because change is coming to WordPress!",
                    "http://unbiast.com/post-" + i,
                    i % 2 == 0 ? Color.parseColor("#FFD700") : Color.parseColor("#87CEEB"),
                    i * 5,
                    i + " Shares"
            ));
        }
    }

    private void setupRecyclerView() {
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new PostAdapter(postList);
        recyclerView.setAdapter(adapter);
    }
}

