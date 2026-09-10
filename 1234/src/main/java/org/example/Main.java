package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int day;
        Scanner in = new Scanner(System.in);
        System.out.println("Ваш год рождения?");
        day = in.nextInt();
        int year;
        System.out.println("Какой сейчас год?");
        year = in.nextInt();
        if (day>year){
            System.out.println("Ошибка");
        }
        else {
            int age = year - day;
            System.out.println(age);
            if (age < 18) {
                System.out.println("Вы несовершеннолетний");
            } else if (age >= 18 && age < 65) {
                System.out.println("Вы взрослый");
            } else {
                System.out.println("Вы пенсионер");
            }
        }

    }
}