import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;

public class Solution {

       /* ������ ������� ����������� �� ����� �� 0 �� 100 ������. ������ ������
	* 40 - �� ����������. 
	* �������� ���������� ����������� �� ���������� �����, �������� 5,
	* ���� ������� ����� ������� � ���� ������ ������ 3. ���������� ������ 
	* 38 �� �����������.
	* ����: n - ���������� ���������
	* 	g[i] - ������ �������� 
	* 	1 <= n <= 60
	* 	0 <= gr[i] <= 100
	* ���������  �������� ����������.
	* 
	*/
    static int[] func(int[] gr) {
        /*
         * Write your code here.
         */

    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(scan.nextLine().trim());

        int[] gr = new int[n];

        for (int gradesItr = 0; gradesItr < n; gradesItr++) {
            int gradesItem = Integer.parseInt(scan.nextLine().trim());
            gr[gradesItr] = gradesItem;
        }


        for (int resultItr = 0; resultItr < result.length; resultItr++) {
            bw.write(String.valueOf(result[resultItr]));

            if (resultItr != result.length - 1) {
                bw.write("\n");
            }
        }

        bw.newLine();

        bw.close();
    }
}
