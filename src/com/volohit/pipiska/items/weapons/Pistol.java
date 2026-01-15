package com.volohit.pipiska.items.weapons;

public class Pistol extends Weapon{
    public Pistol(String name, int damage, int ammo, int id) {
        super(name, damage, ammo, id);
    }
    @Override
    public void shoot() {
        if (this.ammo > 0) {
            this.ammo -= 2;
            System.out.println("Пыщ-пыщ! Хи-хи (^///^) \nПистолет делает двойной выстрел и наносит урон: " + this.damage * 2 + " ОЗ");
        } else {
            System.out.println("Не хватает патрон на выстрел (┬┬﹏┬┬)");
        }
    }
}
