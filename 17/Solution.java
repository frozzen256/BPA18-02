import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

/*
����� - ����������� �������� ����. ��� ����� ���� ����� �������. ��� ���� 
����� � �������, � ������ �� ��� �������� ����� � ������������ � ������������� 
� ������. ����� ����� ���� ������� ������� ���� �� �� 1 �������. ���� ���� 
����� ����� �����, �� ���, � ���� ������� ����, ������ �������� ������ ������. 
����� ����� �������������� ����� ���������� ������, ������� ��� ������ ������.

���������:
 int n: ���������� ����� � ������
 int arr[n]: ������ ������� 

�����:
 int: ����������� ���������� ������, ������� ����� ������ ������

����� 1:
3
1
2
2
�����:
4
����� 1, 2, 2 - �������. �������� ��������: ���� � ���� ����� ���������� �������, 
�� ��������� ����� ������ ���������� ������. �������������, ����������� 
������������� ����� 1, 2, 1.

������ 2:
10
2
4
2
6
1
7
8
9
2
1
�����:
19
����������: 1, 2, 1, 2, 1, 2, 3, 4, 2, 1

*/


public class Solution {

    static long candies(int n, int[] arr) {


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            int arrItem = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            arr[i] = arrItem;
        }

        long result = candies(n, arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
