package com.volohit.pipiska.items;

import java.util.Scanner;

public class Inventory {
    // Объекты
    private Scanner keyboard = new Scanner(System.in);
    private ItemMap item = new ItemMap();

    protected int[] itemSlot = new int[10]; // слоты инвентаря
    public static int id; // id предмета
    public static String name; // Имя предмета в виде текста

    // Положить предмет в определённый слот. Оно вроде должно отличаться чем-то от giveItem(), но сонный я чёт не могу сообразить
    public void addItem(int id, int slot) {
        itemSlot[slot] = getItem(id);
        System.out.println("Вы положили предмет в ячейку: " + slot + " своего рюкзачка （*＾-＾*）");
    }
    // Спавн предметов прямо в рюкзак с вводом id и слота, либо введение этих данных в параметрах.
    public void giveItem(int id, int slot) {
        itemSlot[slot] = getItem(id);
        System.out.println("Вы заспавнили " + item.getName(id) + " в ячейку: " + slot + " своего рюкзачка （*＾-＾*）");
    }
    public void giveItem() {
        int numId, numSlot;
        System.out.print("Введите id предмета: ");
        numId = keyboard.nextInt();
        System.out.print("Введите слот для предмета: ");
        numSlot = keyboard.nextInt();
        if(numSlot == 0) System.out.println("Введи верный слот (*/ω＼*)");
        giveItem(numId, numSlot);
    }

    // Получение id предмета из памяти
    public int getItem(int id) {
        this.id = id;
        return this.id;
    }

    // Показывание инвентаря
    public void showInv() {
        for(byte i = 1; i < this.itemSlot.length; i++) {
            System.out.print("Предмет в слоте " + i + ":");
            System.out.println(item.getName(itemSlot[i]));
        }
    }
}
