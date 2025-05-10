package com.github.kolesovv.clapper;

import com.google.gson.annotations.SerializedName;

import java.text.DecimalFormat;

public class Rating {

    @SerializedName("kp")
    private double kp;

    public Rating(double kp) {
        this.kp = kp;
    }

    public double getKp() {

        DecimalFormat df = new DecimalFormat("#.0");
        String formatted = df.format(kp);
        return Double.parseDouble(formatted);
    }
}
