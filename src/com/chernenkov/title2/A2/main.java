package com.chernenkov.title2.A2;
import java.util.*;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество чисел: ");
        int n = scanner.nextInt();
        String[] numbers = new String[n];
        System.out.println("Введите числа:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.next();
        }
        Arrays.sort(numbers, Comparator.comparingInt(String::length));
        System.out.println("Числа, отсортированные по возрастанию длины:");
        for (String number : numbers) {
            System.out.println(number);
        }
        Arrays.sort(numbers, Comparator.comparingInt(String::length).reversed());
        System.out.println("Числа, отсортированные по убыванию длины:");
        for (String number : numbers) {
            System.out.println(number);
        }
    }
}