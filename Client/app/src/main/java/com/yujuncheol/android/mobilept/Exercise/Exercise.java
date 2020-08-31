package com.yujuncheol.android.mobilept.Exercise;

import Data.User_H_info;

public class Exercise {

    public Exercise () {

    }

    public double getMETs (double METs, double Time, User_H_info u) {
        double Energy_m ,Energy;
        Energy_m = (METs * 3.5 * u.getUserWeight()) / 200;
        Energy = Energy_m * Time;

        return Energy;
    }
}
