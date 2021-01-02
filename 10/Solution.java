import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    /*
     * ���� � ����� ����� ��������� ����� �������� ������� �������.
     * �� ��� ����� �������, ������� ���� ����� ��������� ����-��.
     * ����� ��� ����� ��� ��������� ������� � ������. � ���� ���� ������
     * ������������ �����, � �� ����� ��������������� ���������� �������,
     * ������� �� �������� �� ��� ������. �������� ������ ��� � �����,
     * ������� ����� ���������, ����� ������������ ���������� ������� ����� ������?
     *
     * k - ������
     * 1 <= k <= 10e9
     * 1 <= n <= 10e5, n - ���������� ��� �������
     * 1 <= prices[i] <= 10e9
     *
     * ������: 7 50
     *         1 12 5 111 200 1000 10
     * �����: 4
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
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        int[] prices = new int[n];

        String[] pricesItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int pricesItem = Integer.parseInt(pricesItems[i]);
            prices[i] = pricesItem;
        }


        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}