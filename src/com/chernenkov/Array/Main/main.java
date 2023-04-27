package com.chernenkov.Array.Main;

import com.chernenkov.Array.Entity.Array;
import com.chernenkov.Array.Entity.Warehouse;
import com.chernenkov.Array.Repository.Repository;
import com.chernenkov.Array.Service.Service;
import java.util.ArrayList;
public class main {
    public static void main(String[] args) {

        Repository Newrepository = new Repository();

        Array array1 = new Array("first", new int[]{1, 2, 3});
        Array array2 = new Array("second", new int[]{4, 3, 5});

        Newrepository.AddToRepository(array1);
        Newrepository.AddToRepository(array2);

        Warehouse warehouse = new Warehouse();

        int size = Newrepository.Size();
        for (int i = 0; i < size; i++) {
            float sum = Service.summ(Newrepository.getArr(i));
            warehouse.setSum(sum);
        }
        for (int i = 0; i < size; i++) {
            int min = Service.min(Newrepository.getArr(i));
            warehouse.setmin(min);
        }
        for (int i = 0; i < size; i++) {
            int max = Service.max(Newrepository.getArr(i));
            warehouse.setmax(max);
        }
        warehouse.getSum();
        warehouse.getmin();
        warehouse.getmax();
    }
}
