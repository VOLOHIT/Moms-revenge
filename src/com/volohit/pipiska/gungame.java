package com.volohit.pipiska;

import com.volohit.pipiska.items.ItemReg;
import com.volohit.pipiska.items.weapons.Pistol;
import com.volohit.pipiska.items.Inventory;
import java.util.Scanner;


public class gungame {
    static Inventory inventory = new Inventory();
    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        // Загрузка мапы с названиями предметов
        ItemReg.loadItems();

        Pistol WalterP99 = new Pistol(3,10,1);
        WalterP99.shoot();
        inventory.giveItem();
        inventory.showInv();

    }
}
