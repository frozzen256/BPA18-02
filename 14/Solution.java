import java.io.*;
import java.util.*;

public class Solution {

	/*
	* ����������� ������� ����������� ������ ������. ������ ������ � ��� ����� ������ ���. ������ ����� ��� ������ �����������,
	* ������ ���� ������ ���������� ���� ����. ������ ������������ ������� 1 ����. 
	* ��������� ������ ������ ����� n - ������ �����.
	*
	* ����: t - ���������� �������� ��������
	*	n - ���������� ������ �����
	*  	1 <= t <= 10
	* 	0 <= t <= 60
	* ������:
	*       2
	*	0
	*	4
	*
	* �������:
	*	1
	*	7
	*/
	
    static int func(int n) {
   
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");


            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
