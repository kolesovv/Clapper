package com.github.kolesovv.clapper;

import com.google.gson.annotations.SerializedName;

public class TrailerResponse {

    @SerializedName("videos")
    private Videos videos;

    public Videos getVideos() {
        return videos;
    }
}
