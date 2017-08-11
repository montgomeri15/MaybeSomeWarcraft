package com.company.common;

import com.company.Elves.ElfMage;
import com.company.characters.Mage;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Random random = new Random();

        ElfMage elfMage = new ElfMage();
        elfMage.MageRealiz();
        elfMage.ElfMageRealiz();

       /* System.out.println("Введите 1, 2 или 3");

        Scanner in = new Scanner(System.in);
        //String s = in.nextLine();

        while (true) {

            String s = in.nextLine();

            if (s.equals("1")) {
                elfMage.setHp(elfMage.getHp() - (Math.random() * 10));
                System.out.println(elfMage.getHp());
            }
            if (s.equals("2")) {
                elfMage.setPow(elfMage.getPow() * elfMage.getSp_pow());
                System.out.println(elfMage.getPow());
            }
            if (s.equals("3")){
                elfMage.MageRealiz();
                elfMage.ElfMageRealiz();
            }
        }*/
    }
}
