import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    
   	/* HackerLand National Bank ����� ������� �������� ������������� �������� � 
	 * ��������� ������������� �������� �� �����. ?��� �����, ���������� �������� 
	 * � ������������ ����, ������ ��� ����� ������� �������� ������� �� �������� 
	 * ����� ����, ��� ��������� ������� ����������� � ������������� �������������.
	 * _��� �� ��������� ������� ������� ����������� �� ��� ���, ���� � ���� ���, 
	 * �� ������� ����, ����� ��������� ����� ���������� �� ���������� ���. "������ 
	 * ���������� ����������� ���� � ����� ���������� ������� ������� �� ������, 
 	 * ������� � ������������ ���������� ����, ����� ������ ������� �����������.
	 *
	 * 1 <= n <= 2*10e5, n - ���������� �������� �������� 
	 * 1 <= d <= n, d - ���������� ���� �� ������� �������
	 * 0 <= exp[i] <= 200
	 *
	 * _�����: 9 5
	 *	   2 3 4 2 3 6 8 4 5
	 * _����: 2
	 * {2 2 3 3 4}, m = 3, 2 * 3 <= 6  1
	 * {2 3 3 4 6}, m = 3, 2 * 3 <= 8  1
	 * {3 3 4 6 8}, m = 4, 2 * 4 > 4   0
	 * {3 4 4 6 8}, m = 4, 2 * 4 > 5   0

	 * _�����: 5 4 
	 *	   1 2 3 4 4
	 * {1 2 3 4}, m = 2.5, 2 * 2.5 > 4 0	
	 * _����: 0
	 */ 

    // Complete the activityNotifications function below.
    static int activityNotifications(int[] expenditure, int d) {


     }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nd = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nd[0]);

        int d = Integer.parseInt(nd[1]);

        int[] expenditure = new int[n];

        String[] expenditureItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int expenditureItem = Integer.parseInt(expenditureItems[i]);
            expenditure[i] = expenditureItem;
        }

        
	bufferedWriter.write(String.valueOf(r));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }

}
