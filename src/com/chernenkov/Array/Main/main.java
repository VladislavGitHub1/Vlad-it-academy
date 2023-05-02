package com.chernenkov.Array.Main;

import com.chernenkov.Array.Entity.Array;
import com.chernenkov.Array.Entity.Warehouse;
import com.chernenkov.Array.Entity.WarehouseCreator;
import com.chernenkov.Array.Repository.Repository;
import com.chernenkov.Array.Service.Service;
import java.util.ArrayList;
public class main {
    public static void main(String[] args) {

        Repository Newrepository = new Repository();

        Array array1 = new Array("first", new int[]{1, 2, 3, 4, 7, 3});
        Array array2 = new Array("second", new int[]{4, 3, 5});
        Array array3 = new Array("third", new int[]{10, 3, 5});

        Newrepository.AddToRepository(array1);
        Newrepository.AddToRepository(array2);
        Newrepository.AddToRepository(array3);

        WarehouseCreator creator = new WarehouseCreator();
        creator.Calculations(Newrepository);
        creator.getter();

    }
}
