package com.chernenkov.Array.Service;

import com.chernenkov.Array.Entity.Array;
import com.chernenkov.Array.Repository.Repository;

public class Service {
        //Поиск минимального значения
    public static int min (int[] arr){
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min)
                min = arr[i];
        }
        return min;

    }
        //Поиск максимального значения
    public static int max (int[] arr){
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        return max;
    }
//        //Определение суммы улементов
     public static float summ (int[] arr){
        float summ = 0;
        for (int i = 0; i < arr.length; i++) {
            summ += arr[i];
        }
        return summ;
    }
       //Определение среднего значения массива
    public static float average (int[] arr) {
        float summ = 0;
        for (int i = 0; i < arr.length; i++) {
            summ += arr[i];
        }
        float average = summ / arr.length;
        return average;
    }
        //Определение числа положительных элментов:
        public static int plus (int[] arr){
        int plus = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0)
                plus += 1;
        }
        return plus;
    }
//        //Определение числа отрицательных элементов
        public static int minus (int[] arr) {
        int minus = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0)
                minus += 1;
        }
            return minus;
        }
//        //Определение нулевых элементов
    public static int zero (int[] arr) {
        int zero = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0)
                zero += 1;
        }
        return zero;
    }
}
