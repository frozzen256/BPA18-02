package com.company;

//import java.io.BufferedWriter;
//import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    /*
     * Лука и Фекла очень счастливы после рождения первого ребенка.
     * Их сын любит игрушки, поэтому Лука хочет прикупить чего-то.
     * Перед ним лежит ряд различных игрушек с ценами. У Луки есть только
     * определенная сумма, и он хочет максимизировать количество игрушек,
     * которые он покупает на эти деньги. Учитывая список цен и сумму,
     * которую можно потратить, какое максимальное количество игрушек можно купить?
     *
     * k - бюджет
     * 1 <= k <= 10e9
     * 1 <= n <= 10e5, n - количество цен игрушек
     * 1 <= prices[i] <= 10e9
     *
     * Пример: 7 50
     *         1 12 5 111 200 1000 10
     * Ответ: 4
     */
    static int maximumToys(int[] p, int k) {
        int n = p.length;
        int minToys = 0;
        int amountToys = 0;
        for(int j = 0; j < n ; j++){
            for(int i = 0; i < n -1 ; i++){
                if (p[i] > p[i+1]){
                    int temp = p[i];
                    p[i] = p[i+1];
                    p[i+1] = temp;
                }
            }
        }
        System.out.println(p);
        while (k >= p[minToys]) {
            k = k - p[minToys];
            minToys++;
            amountToys++;
        }
        return amountToys;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        System.out.println("Enter kol-vo n:");
        int n = scanner.nextInt();
        System.out.println("Enter kol-vo k-many:");
        int k = scanner.nextInt();
        System.out.println("Enter stoimost igrushek:");
        int[] p = new int[n];
        for(int i = 0; i < n; i++){
            p[i] = (int) Math.round((Math.random() * 200) );
            System.out.println(p[i]);
        }
        System.out.println("Игрушек можно купить :" + maximumToys(p ,k));
    }
}


