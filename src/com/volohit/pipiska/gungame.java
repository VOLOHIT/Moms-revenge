package com.volohit.pipiska;

import com.volohit.pipiska.items.weapons.Pistol;
import com.volohit.pipiska.items.Inventory;
import com.volohit.pipiska.items.weapons.Weapon;
import java.util.Scanner;

public class gungame {
    static Inventory inventory = new Inventory();

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Pistol WalterP99 = new Pistol("Walter P998", 3,3,1);
        WalterP99.shoot();
        inventory.giveItem();

        inventory.showInv();
    }
}
