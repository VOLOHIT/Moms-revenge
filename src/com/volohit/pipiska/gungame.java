package com.volohit.pipiska;

import com.volohit.pipiska.command.GamePanel;
import com.volohit.pipiska.items.Inventory;
import com.volohit.pipiska.items.ItemReg;
import com.volohit.pipiska.items.weapons.WeaponList;
import java.util.Scanner;
import javax.swing.JFrame;


public class gungame {
    static Inventory inventory = new Inventory();
    static Scanner keyboard = new Scanner(System.in);
    static WeaponList gun = new WeaponList();

    public static void main(String[] args) {
        JFrame window = new JFrame();
        GamePanel gamePanel = new GamePanel();

        // Загрузка мапы с названиями предметов
        ItemReg.loadItems();
        // Настройка окна
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);
        window.setTitle("Mo revenge");
        window.add(gamePanel);
        window.pack();
        window.setLocationRelativeTo(null);
        window.setVisible(true);
        gamePanel.startGameThread();

    }
}
