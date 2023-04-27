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

    public void getSum() {
        System.out.print("Суммы элементов массивов: ");
        for (int i = 0; i < summa.size(); i++) {
            float summ = summa.get(i);
            System.out.print(summ + " ");
        }
        System.out.println(" ");
    }
    public void getmin() {
        System.out.print("Минимальные элементы массивов: ");
        for (int i = 0; i < minimum.size(); i++) {
            int min = minimum.get(i);
            System.out.print(min + " ");
        }
        System.out.println(" ");
    }
    public void getmax() {
        System.out.print("Максимальные элементы массивов: ");
        for (int i = 0; i < maximum.size(); i++) {
            int max = maximum.get(i);
            System.out.print(max + " ");
        }
        System.out.println(" ");
    }
}