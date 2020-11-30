<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
>>>>>>> 098ff85999e9e929f36fc1e0c4f3ed8b9903d473
package com.company;
import java.util.*;
public class Main {

    /* В саду растут 2 дерева: яблоня и апельсин.
     * а - точка расположения яблони, b - точка расположения апельсина.
     * Имется участок с границами [s, t] и два массива, описывающих
     * местоположение упавших яблок и апельсин - d, размерности n и m.
     * 1 <= s, t, a, b, n, m <= 10e5;
     * -10e5 <= d <= 10e5;
     * a < s < t < b;
     * Найти сколько яблок и апельсин можно собрать Никодиму на участке [s, t]
     */


    // Complete the countApplesAndOranges function below.
<<<<<<< HEAD
    static int countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
=======
       public static int countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
>>>>>>> 098ff85999e9e929f36fc1e0c4f3ed8b9903d473
        int result =0;

        for(int i=0;i<apples.length;i++)
        {
<<<<<<< HEAD
            if(apples[i]>=s && apples[i]<=t)
=======
            apples[i]=apples[i]+a;
            if(apples[i]>s && apples[i]<t)
>>>>>>> 098ff85999e9e929f36fc1e0c4f3ed8b9903d473
                result++;
        }
        for(int j=0;j<oranges.length;j++)
        {
<<<<<<< HEAD
            if(oranges[j]>=s && oranges[j]<=t)
=======
            oranges[j]=oranges[j]+b;
            if(oranges[j]>s && oranges[j]<t)
>>>>>>> 098ff85999e9e929f36fc1e0c4f3ed8b9903d473
                result++;
        }

        return result;
    }
    

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] st = scanner.nextLine().split(" ");

        int s = Integer.parseInt(st[0]);

        int t = Integer.parseInt(st[1]);

        String[] ab = scanner.nextLine().split(" ");

        int a = Integer.parseInt(ab[0]);

        int b = Integer.parseInt(ab[1]);

        String[] mn = scanner.nextLine().split(" ");

        int m = Integer.parseInt(mn[0]);

        int n = Integer.parseInt(mn[1]);

        int[] apples = new int[m];


        String[] applesItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < m; i++) {
            int applesItem = Integer.parseInt(applesItems[i]);
            apples[i] = applesItem;
        }

        int[] oranges = new int[n];

        String[] orangesItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int orangesItem = Integer.parseInt(orangesItems[i]);
            oranges[i] = orangesItem;
        }

        System.out.print(countApplesAndOranges(s,t,a,b,apples,oranges));
        scanner.close();

    }
}
<<<<<<< HEAD
>>>>>>> origin/Dev
=======

>>>>>>> 098ff85999e9e929f36fc1e0c4f3ed8b9903d473
