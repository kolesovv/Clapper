package com.github.kolesovv.clapper;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ReviewResponse {

    @SerializedName("docs")
    private List<Review> review;

    public ReviewResponse(List<Review> review) {
        this.review = review;
    }

    public List<Review> getReview() {
        return review;
    }
}
