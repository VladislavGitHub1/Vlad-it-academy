package com.chernenkov.title2.A6;
import java.util.Scanner;
//Программа работает с ошибкой
public class A6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество чисел: ");
        int n = scanner.nextInt();
        int firstAscendingNumber = -1;
        for (int i = 0; i < n; i++) {
            System.out.print("Введите число: ");
            int number = scanner.nextInt();
            boolean isAscending = true;
            int prevDigit = -1;
            while (number > 0) {
                int digit = number % 10;
                if (digit >= prevDigit) {
                    prevDigit = digit;
                    number /= 10;
                } else {
                    isAscending = false;
                    break;
                }
            }
            if (isAscending) {
                firstAscendingNumber = firstAscendingNumber == -1 ? number : Math.min(firstAscendingNumber, number);
            }
        }
        if (firstAscendingNumber == -1) {
            System.out.println("Нет чисел, цифры в котором идут в строгом порядке возрастания");
        } else {
            System.out.println("Первое число, цифры в котором идут в строгом порядке возрастания: " + firstAscendingNumber);
        }
    }
}