package com.github.kolesovv.clapper;

import com.google.gson.annotations.SerializedName;

public class Rating {

    @SerializedName("kp")
    private String kp;

    public Rating(String kp) {
        this.kp = kp;
    }

    public String getKp() {
        return kp;
    }
}
