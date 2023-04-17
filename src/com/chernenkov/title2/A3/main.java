package com.chernenkov.title2.A3;
import java.util.*;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество чисел: ");
        int n = scanner.nextInt();
        String[] numbers = new String[n];
        int sum = 0;
        System.out.println("Введите числа:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.next();
            sum += numbers[i].length();
        }
        double average = (double) sum / n;
        System.out.println("Средняя длина чисел: " + average);
        System.out.println("Числа, длина которых меньше средней:");
        for (String number : numbers) {
            if (number.length() < average) {
                System.out.println(number + " (" + number.length() + ")");
            }
        }
        System.out.println("Числа, длина которых больше средней:");
        for (String number : numbers) {
            if (number.length() > average) {
                System.out.println(number + " (" + number.length() + ")");
            }
        }
    }
}