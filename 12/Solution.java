import java.io.*;
import java.util.*;

public class Solution {
	/*
	* ����: n - ����� ��������� � ������
	*		s - ������
	* 		2 <= n <= 10e6
	*		s[i]= {UD}
	* ��� ������ ��������� �������� �������� � ������ 0. D - ��� ����; U - ��� �����.
	* ������� ������ ������, ���� ��������� ���� � �������� �� ������� 0.
	* ������� ����� ����� �� ���� ����������.
	* ������:
	* 8
	* UDDDUDUU
	* 1
	*
	*_/\      _
	*   \    /
  	*    \/\/
	*/

    static int func1(int n, String s) {
     
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("out.txt")); //System.getenv("OUTPUT_PATH")

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String s = scanner.nextLine();


        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}