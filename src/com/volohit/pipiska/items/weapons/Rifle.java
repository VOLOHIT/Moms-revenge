package com.volohit.pipiska.items.weapons;
import com.volohit.pipiska.items.Inventory;
import com.volohit.pipiska.items.ItemMap;

public class Rifle extends Weapon{
    ItemMap item = new ItemMap();

    public Rifle(int damage, int ammo, int id) {
        super(damage, ammo, id);
    }
    @Override
    public void shoot() {
        if (this.ammo >= 3) {
            this.ammo -= 3;
            System.out.println("Ра-та-та! Хи-хи (^///^) \n" + item.getName(Inventory.id) + " выстрел и наносит урон: " + this.damage * 3 + " ОЗ");
        } else {
            System.out.println("Не хватает патрон на выстрел (┬┬﹏┬┬)");
        }
    }
}
