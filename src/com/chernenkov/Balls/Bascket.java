package com.chernenkov.Balls;

public class Bascket {
    public String color;
    public void filling() {
        Ball green = new Ball();
        green.SetValues(10, "Green");
        Ball yellow = new Ball();
        yellow.SetValues(15,"yellow");
        Ball blue = new Ball();
        blue.SetValues(20, "blue");
        int summ = green.weight + yellow.weight + blue.weight;
        System.out.println("Вес мячей: " + summ);
        System.out.println("Цвета мячей: " + green.color + " " + yellow.color + " " + blue.color);

//       Bascket[] first = new Bascket[3]{
//               Bascket[0] = green;
//               Bascket[1] = yellow;
//               Bascket[2] = blue;
//       }

//        for(int i = 0; i < 2; i++){
//            int summ = 0;
//            summ += Bascket[i].weight;
//            System.out.println(summ);
//        }


    }
}
