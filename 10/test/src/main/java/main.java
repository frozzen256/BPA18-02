//package com.company;

import java.util.*;
import java.util.Scanner;



public class main {
    public static void main(String[] arge){
        System.out.println("Enter kol-vo n:");
        //int n = scanner.nextInt();
        int n = 7;
        System.out.println("Enter kol-vo k-many:");
        //int k = scanner.nextInt();
        int k = 50;
        System.out.println("Enter stoimost igrushek:");
        int[] p = {1, 12, 5, 111, 200, 1000, 10};
//        for(int i = 0; i < n; i++){
//            p[i] = (int) Math.round((Math.random() * 200) );
//            System.out.println(p[i]);
//        }
        maximumToys clasToys = new maximumToys();
        System.out.println("Игрушек можно купить :" + clasToys.maximumToystest(p ,k));
        System.out.println("Проверяем");
        System.out.println("Старт "+Thread.currentThread().getName());
        new Thread(() -> System.out.println(("Результат" + clasToys.maximumToystest(p, k)))).start();
        new Thread(() -> System.out.println(("Результат" + clasToys.maximumToystest(p, k)))).start();
        new Thread(() -> System.out.println(("Результат" + clasToys.maximumToystest(p, k)))).start();
        System.out.println("Стоп "+Thread.currentThread().getName());
        System.out.println();
    }
}
