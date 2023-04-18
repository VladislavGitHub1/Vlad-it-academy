package com.chernenkov.title2.A5;
import java.util.Scanner;

//метод main подчеркнут
public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество чисел: ");
        int n = scanner.nextInt();
        int countEvenDigitsOnly = 0;
        int countEvenOddDigitsEqual = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Введите число: ");
            int number = scanner.nextInt();
            boolean hasOnlyEvenDigits = true;
            int evenDigitsCount = 0;
            int oddDigitsCount = 0;
            while (number > 0) {
                int digit = number % 10;
                if (digit % 2 != 0) {
                    hasOnlyEvenDigits = false;
                }
                if (digit % 2 == 0) {
                    evenDigitsCount++;
                } else {
                    oddDigitsCount++;
                }
                number /= 10;
            }
            if (hasOnlyEvenDigits) {
                countEvenDigitsOnly++;
                if (evenDigitsCount == oddDigitsCount) {
                    countEvenOddDigitsEqual++;
                }
            }
        }
        System.out.println("Количество чисел, содержащих только четные цифры: " + countEvenDigitsOnly);
        System.out.println("Количество чисел с равным числом четных и нечетных цифр: " + countEvenOddDigitsEqual);
    }
}