package com.chernenkov.BallsArray;


import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Bascket first = new Bascket();
        Ball grey = new Ball();
        first.addBall(grey);


            Scanner scanner = new Scanner(System.in);
            System.out.println("Какое число мячей в корзине?");
            int number = scanner.nextInt();
            Ball[] football = new Ball[number];
            for (int i = 0; i < number; i++) {
                football[i] = new Ball();
                System.out.println("Введите вес мяча");
                football[i].weight = scanner.nextInt();
                System.out.println("Введите цвет мяча");
                football[i].color = scanner.next();
            }
            int summ = 0;
            for(int i=0; i< football.length; i++)
                summ += football[i].weight;
            System.out.println("Вес мячей: " + summ);
            System.out.print("Цвета мячей: ");
            for(int i=0; i< football.length; i++)
            System.out.print(football[i].color + " ");
//
//            int summ = 1.weight + 2.weight + 3.weight;
//
//            System.out.println("Цвета мячей: " + green.color + " " + yellow.color + " " + blue.color);


    }
}