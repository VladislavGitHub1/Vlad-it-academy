package com.chernenkov.Array.Entity;


import java.util.ArrayList;

public class Warehouse {
    ArrayList<Float> summa = new ArrayList<Float>();

    public void setSum(float sum) {
        summa.add (sum);
    }

    public void getSum(){
        for (int i=0; i< summa.size(); i++){
         float summ = summa.get(i);
         System.out.print(summ + " ");
        }

    }
