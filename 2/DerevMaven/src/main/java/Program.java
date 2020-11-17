import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

import java.awt.event.TextListener;
import java.util.Scanner;
/* В саду растут 2 дерева: яблоня и апельсин.
 * а - точка расположения яблони, b - точка расположения апельсина.
 * Имется участок с границами [s, t] и два массива, описывающих
 * местоположение упавших яблок и апельсин - d, размерности n и m.
 * 1 <= s, t, a, b, n, m <= 10e5;
 * -10e5 <= d <= 10e5;
 * a < s < t < b;
 * Найти сколько яблок и апельсин можно собрать Никодиму на участке [s, t]
 *
 *7 11
 * 5 15
 * 3 2
 * -2 2 1
 * 5 -6
 *
 * 1
 *
 */

class JThread extends Thread {

    private int s,t,a,b;
    private int[] apples,oranges;
    JThread(int s, int t, int a, int b, int[] apples, int[] oranges){
        this.s=s;
        this.t=t;
        this.a=a;
        this.b=b;
        this.apples=apples;
        this.oranges=oranges;
    }
    public void run(){

        System.out.printf("%s старт... \n", Thread.currentThread().getName());

        System.out.println("Результат вычисления:  " + Rasch.countApplesAndOranges(s,t,a,b,apples,oranges));

        System.out.printf("%s финиш... \n", Thread.currentThread().getName());
    }
}




public class Program {

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

        System.out.println("Старт основного потока...");
        new JThread(s,t,a,b,apples,oranges).start();
        new JThread(s,t,a,b,apples,oranges).start();
        System.out.println("Финиш основного потока...");

        scanner.close();
    }

    private static final Scanner scanner = new Scanner(System.in);
}
