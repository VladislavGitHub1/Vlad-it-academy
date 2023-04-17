package com.chernenkov.Balls;


public class main {
    public static void main(String[] args) {
        Bascket grey = new Bascket();
        grey.color = "Серая";
        System.out.println(grey.color + " корзина наполнена мячами");
        grey.filling();
    }
}