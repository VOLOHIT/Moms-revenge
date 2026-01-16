package com.volohit.pipiska.items.weapons;

import com.volohit.pipiska.items.Inventory;
import com.volohit.pipiska.items.ItemMap;

public class Pistol extends Weapon{
    ItemMap item = new ItemMap();

    public Pistol(int damage, int ammo, int id) {
        super(damage, ammo, id);
    }
//    @Override
//    public void shoot() {
//        if (this.ammo > 0) {
//            this.ammo -= 2;
//            System.out.println("Пыщ-пыщ! Хи-хи (^///^) \n" + item.getName(Inventory.id) + " делает двойной выстрел и наносит урон: " + this.damage * 2 + " ОЗ");
//        } else {
//            System.out.println("Не хватает патрон на выстрел (┬┬﹏┬┬)");
//        }
//    }
}
