package com.yujuncheol.android.mobilept.Management;

import Data.User_H_info;

public class Management {

    public Management () {

    }

    //여, 남의 기초 대사량.
    public double getBMR (User_H_info u) {
        double metabolism = 0;

        if(u.isUserSex()) {
            metabolism = 66.47 + (13.75 * u.getUserWeight()) + (5 * u.getUserHeight()) - (6.76 * u.getUserAge());
        }else {
            metabolism = 655.1 + (9.56 * u.getUserWeight()) + (1.85 * u.getUserHeight()) - (4.68 * u.getUserAge());
        }
        return metabolism;
    }
    // BMI
    public double getBMI (User_H_info u) {
        double BMI = 0;
        double heignt = u.getUserHeight() * 0.01;
        BMI = u.getUserWeight() / (heignt*heignt);

        return BMI;
    }
    // 다이어트 1일 탄수화물.
    public double getCar (User_H_info u) {
        double car = 0;
        car = (getBMR(u) * 55 * 0.01) / 4.0;
        return car;
    }
    // 다이어트 1일 단백질.
    public double getPro (User_H_info u) {
        double pro = 0;
        pro = (getBMR(u) * 35 * 0.01) / 4.0;
        return pro;
    }
    // 다이어트 1일 지방.
    public double getFat (User_H_info u) {
        double fat = 0;
        fat = (getBMR(u) * 10 * 0.01) / 9.0;
        return fat;
    }

}
