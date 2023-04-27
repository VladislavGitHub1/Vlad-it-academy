package com.chernenkov.Array.Entity;

public class Array {
    public String name;

    public int[] arr;

    public Array(String name, int[] arr) {
        this.name = name;
        this.arr = arr;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }

    public int[] getArr(){
        return arr;
    }

}
