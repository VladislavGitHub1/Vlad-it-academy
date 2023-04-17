package com.chernenkov.title2.A1;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество чисел: ");
        int n = scanner.nextInt();

        String shortestNumber = null;
        String longestNumber = null;

        for (int i = 0; i < n; i++) {
            System.out.print("Введите число: ");
            String number = scanner.next();

            if (shortestNumber == null || number.length() < shortestNumber.length()) {
                shortestNumber = number;
            }

            if (longestNumber == null || number.length() > longestNumber.length()) {
                longestNumber = number;
            }
        }

        System.out.println("Самое короткое число: " + shortestNumber + " (длина: " + shortestNumber.length() + ")");
        System.out.println("Самое длинное число: " + longestNumber + " (длина: " + longestNumber.length() + ")");
    }
}
