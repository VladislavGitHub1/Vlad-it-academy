package com.chernenkov.BallsArray;

import java.util.ArrayList;

public class Bascket {
    public String color;
    ArrayList<Ball> balls = new ArrayList<>();
    public void addBall(Ball ball){
        balls.add(ball);
    }
}

