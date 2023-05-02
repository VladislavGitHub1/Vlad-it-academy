package com.chernenkov.Array.Entity;

import com.chernenkov.Array.Repository.Repository;
import com.chernenkov.Array.Service.Service;

import java.util.ArrayList;

public class WarehouseCreator {
    Warehouse warehouse = new Warehouse();

    public void Calculations(Repository repository) {
        warehouse.clear();
        for (int i = 0; i < repository.Size(); i++) {
            float sum = Service.summ(repository.getArr(i));
            warehouse.setSum(sum);
        }
        for (int i = 0; i < repository.Size(); i++) {
            int min = Service.min(repository.getArr(i));
            warehouse.setmin(min);
        }
        for (int i = 0; i < repository.Size(); i++) {
            int max = Service.max(repository.getArr(i));
            warehouse.setmax(max);
        }
    }

    public void getter(){
        int size = warehouse.getsize();
        ArrayList<Float> summa = warehouse.getSumma();
        ArrayList<Integer> minimum = warehouse.getMinimum();
        ArrayList<Integer> maximum = warehouse.getMaximum();
        System.out.print("Суммы элементов массивов: ");
        for (int i = 0; i < size; i++) {
            float summ = summa.get(i);
            System.out.print(summ + " ");
        }
        System.out.println(" ");

        System.out.print("Минимальные элементы массивов: ");
        for (int i = 0; i < size; i++) {
            int min = minimum.get(i);
            System.out.print(min + " ");
        }
        System.out.println(" ");

        System.out.print("Максимальные элементы массивов: ");
        for (int i = 0; i < size; i++) {
            int max = maximum.get(i);
            System.out.print(max + " ");
        }
        System.out.println(" ");
    }
}
