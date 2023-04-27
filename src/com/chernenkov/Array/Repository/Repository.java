package com.chernenkov.Array.Repository;

import com.chernenkov.Array.Entity.Array;

import java.util.ArrayList;

public class Repository {
    ArrayList<Array> ArrayList = new ArrayList<>();
    public void AddToRepository (Array array){
        ArrayList.add(array);
    }
    public void RemoveByName (String name){
        ArrayList.remove(name);
    }
    public void RemoveById (int id){
        ArrayList.remove(id);
    }
    public Array GetObject(int index){
        return ArrayList.get(index);
    }
    public Array GetObjectByName (String name){
        int index = -1;
        for (int i = 0; i < ArrayList.size(); i++) {
            Array test = ArrayList.get(i);
            if (name.equals(test.name)) {
                index = i;
                break;
            }
        }
        return ArrayList.get(index);
    }
    public int[] getArr(int index) {
        Array array = GetObject(index);
        int[] arr = array.getArr();
        return arr;
    }
    public int[] getArr(String name) {
        Array array = GetObjectByName(name);
        int[] arr = array.getArr();
        return arr;
    }
    public int Size(){
        return ArrayList.size();
    }
}