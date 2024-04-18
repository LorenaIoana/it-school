package com.itschool.course;

public class House {

    public House() {
    }

    private String color;
    private int mp;

    public House(String color, int mp) {
        this.color = color;
        this.mp = mp;
    }

    public String getColor() {
        return color;
    }

    public int getMp() {
        return mp;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMp(int mp) {
        this.mp = mp;
    }

    public int mputils() {
        return mp -10;
    }

    public static int totalCost(int electriciy, int gas) {
        return electriciy + gas;
    }
}

