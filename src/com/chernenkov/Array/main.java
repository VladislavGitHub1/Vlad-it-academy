package com.chernenkov.Array;

import java.util.Scanner;

import static com.chernenkov.Array.Operations.operations;

public class main {
    public static void main(String[] args) {
        int[] arr = new int[3];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Введите значения");
            int value = scanner.nextInt();
            arr[i] = value;
        }
        operations(arr);
    }
}
