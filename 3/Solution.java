 import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
     	/*
	* ��� ������� ���� � ����� �������� ������� ������������, �� � ������ ��������� �������: �1 � �2.
	* � ����� ������ ����� �������: v1 � v2.
	* ������� � ����� �����������. ���������� ������ �� ��� ��������� �
	* ����� ����� � ���� ������ ��������. ���� ��, �� ������� YES, ����� NO.
	* 0 <= x1 <= x2 <= 10000
	* 1 <= v1 <= 10e4
	* 1 <= v2 <= 10e4
	*
	* ������: 0 3 4 2. �����: YES  0 2 5 3 NO
	*/


    // Complete the kangaroo function below.
    static String kangaroo(int x1, int v1, int x2, int v2) {


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] x1V1X2V2 = scanner.nextLine().split(" ");

        int x1 = Integer.parseInt(x1V1X2V2[0]);

        int v1 = Integer.parseInt(x1V1X2V2[1]);

        int x2 = Integer.parseInt(x1V1X2V2[2]);

        int v2 = Integer.parseInt(x1V1X2V2[3]);


        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

