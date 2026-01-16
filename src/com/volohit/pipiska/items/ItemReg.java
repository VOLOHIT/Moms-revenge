package com.volohit.pipiska.items;

public class ItemReg {
    private static ItemMap map = new ItemMap();

    public static void loadItems() {
        map.itemRegister(1, "Walter P99");
    }
}
