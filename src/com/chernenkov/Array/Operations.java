package com.chernenkov.Array;

import java.util.Scanner;

public class Operations {
    //Создание массива
    public static void operations() {
        int[] arr = new int[3];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Введите значения");
            int value = scanner.nextInt();
            arr[i] = value;
        }

        //Поиск минимального значения

        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min)
                min = arr[i];
        }
        System.out.println("Минимальное значение: " + min);

        //Поиск максимального значения

        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        System.out.println("Максимальное значение: " + max);

        //Определение суммы улементов

        float summ = 0;
        for (int i = 0; i < arr.length; i++) {
            summ += arr[i];
        }
        System.out.println("Сумма: " + summ);

        //Определение среднего значения массива
        float average = summ / arr.length;
        System.out.println("Среднее значение: " + average);

        //Определение числа положительных элментов:
        int plus = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0)
                plus += 1;
        }
        System.out.println("Положительных элементов: " + plus);

        //Определение числа отрицательных элементов

        int minus = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0)
                minus += 1;
        }
        System.out.println("Отрицательных элементов: " + minus);

        //Определение нулевых элементов
        int zero = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0)
                zero += 1;
        }
        System.out.println("Нулевых элементов: " + zero);
    }

}
