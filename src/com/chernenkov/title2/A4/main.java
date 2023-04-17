package com.chernenkov.title2.A4;

import java.util.Scanner;

import static com.chernenkov.title2.A4.count.countDistinctDigits;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество чисел: ");
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Введите число: ");
            numbers[i] = scanner.nextInt();
        }
        int minDistinctDigitsNumber = numbers[0];
        int minDistinctDigitsCount = countDistinctDigits(numbers[0]);
        for (int i = 1; i < n; i++) {
            int distinctDigitsCount = countDistinctDigits(numbers[i]);
            if (distinctDigitsCount < minDistinctDigitsCount) {
                minDistinctDigitsNumber = numbers[i];
                minDistinctDigitsCount = distinctDigitsCount;
            }
        }
        System.out.println("Число с минимальным количеством различных цифр: " + minDistinctDigitsNumber);


    }


}