package com.route.post;

public class Post {
    private String profileName;
    private String postTime;
    private String postText;
    private String postLink;
    private int imageColor; // Using color for now as per activity_post.xml
    private int likeCount;
    private String shareCountText;

    public Post(String profileName, String postTime, String postText, String postLink, int imageColor, int likeCount, String shareCountText) {
        this.profileName = profileName;
        this.postTime = postTime;
        this.postText = postText;
        this.postLink = postLink;
        this.imageColor = imageColor;
        this.likeCount = likeCount;
        this.shareCountText = shareCountText;
    }

    public String getProfileName() {
        return profileName;
    }

    public String getPostTime() {
        return postTime;
    }

    public String getPostText() {
        return postText;
    }

    public String getPostLink() {
        return postLink;
    }

    public int getImageColor() {
        return imageColor;
    }

    public int getLikeCount() {
        return likeCount;
    }

    public String getShareCountText() {
        return shareCountText;
    }
}
