package com.volohit.pipiska.items.weapons;

public class Weapon {
    protected int damage;
    protected int ammo;
    public int id;

    public Weapon(int damage, int ammo, int id) {
        this.damage = damage;
        this.ammo = ammo;
        this.id = id;
    }

    public Weapon() {

    }

    public void shoot() {
        if (this.ammo > 0) {
            this.ammo--;
            System.out.println("Бум! Выстрел! Нанесен урон: " + this.damage + " ОЗ (●'◡'●)");
        } else {
            System.out.println("Не хватает патрон на выстрел (┬┬﹏┬┬)");
        }
    }

    public void addAmmo(int value) {
        this.ammo += value;
        System.out.println("Вау!  Было добавлено " + value + " патрон (. ❛ ᴗ ❛.)");
    }

    public void getAmmo() {
        System.out.println("У тебя в рюкзачке: " + this.ammo + " патрон (. ❛ ᴗ ❛.)");;
    }
}
