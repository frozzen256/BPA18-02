import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static String result;
    public static void main(String[] args) throws IOException, InterruptedException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new FileWriter("Solution.txt"));

        final int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        final int[] ar = new int[n];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }
        final SockSort sockSort = new SockSort();
        System.out.println("Проверяем");
        System.out.println("Старт "+Thread.currentThread().getName());
        new Thread(() -> System.out.println("Результат "+ sockSort.sockMerchant(n,ar))).start();
        new Thread(() -> System.out.println("Результат "+ sockSort.sockMerchant(n,ar))).start();
        System.out.println("Стоп "+Thread.currentThread().getName());
        System.out.println();
        scanner.close();
    }
}
