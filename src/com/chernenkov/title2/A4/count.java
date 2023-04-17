package com.chernenkov.title2.A4;

public class count {
    public static int countDistinctDigits(int number) {
        boolean[] digits = new boolean[10];
        while (number > 0) {
            digits[number % 10] = true;
            number /= 10;
        }
        int count = 0;
        for (boolean digit : digits) {
            if (digit) {
                count++;
            }
        }
        return count;
    }
}
