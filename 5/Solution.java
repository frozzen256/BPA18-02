import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
	/*
	* ����� �������� � �������� ������. � ���� ���� ������� ���� ������, 
	* ������� �� ������ ��������� �� ����� �� ����� ��� �������. 
	* �� ��������� ������� ����� �����, �������������� ���� ������� �����, 
	* ����������, ������� ��� ������ � ������������ ������� ����������.
	* 1 <= n <= 100, n - ���������� ��� ������
	* 1 <= ar[i] <= 100 - ����� ������
	*	
	* ������: 9
	*         10 20 20 10 10 30 50 10 20
	* �����: 3	
	*/


    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[n];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

         bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}