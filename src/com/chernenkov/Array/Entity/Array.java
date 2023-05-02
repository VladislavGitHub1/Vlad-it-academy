package com.chernenkov.Array.Entity;

public class Array {
    public String name;

    public int[] arr;

    public Array(String name, int[] arr) {
        this.name = name;
        this.arr = arr;
    }

    public Array() {
    }

    public void setArr(String name, int[] arr) {
        this.arr = arr;
        this.name = name;
    }

    public int[] getArr(){
        return arr;
    }

}
