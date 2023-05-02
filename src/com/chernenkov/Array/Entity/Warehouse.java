package com.chernenkov.Array.Entity;


import java.util.ArrayList;

public class Warehouse {
    ArrayList<Float> summa = new ArrayList<Float>();
    ArrayList<Integer> minimum = new ArrayList<Integer>();
    ArrayList<Integer> maximum = new ArrayList<Integer>();

    public void setSum(float sum) {
        summa.add(sum);
    }
    public void setmin(int min) {
        minimum.add(min);
    }
    public void setmax(int max) {
        maximum.add(max);
    }
    public void clear() {
        summa.clear();
        minimum.clear();
        maximum.clear();
    }
    public int getsize(){
        int a = summa.size();
        return  a;
    }

    public ArrayList<Float> getSumma() {
        return summa;
    }

    public ArrayList<Integer> getMinimum() {
        return minimum;
    }

    public ArrayList<Integer> getMaximum() {
        return maximum;
    }
}