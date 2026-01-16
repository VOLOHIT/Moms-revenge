package com.volohit.pipiska.items;

import com.volohit.pipiska.items.Inventory;
import java.util.HashMap;

public class ItemMap {
    static Inventory inventory = new Inventory();

    private static final HashMap<Integer, String> idNames = new HashMap<>();

    public void itemRegister(int id, String name) {
        Inventory.id = id;
        Inventory.name = name;
        idNames.put(Inventory.id, Inventory.name);
    }

    public String getName(int id) {
        String name = idNames.getOrDefault(inventory.getItem(id), "-");
        return name;
    }
}