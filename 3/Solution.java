 import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.Scanner;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
     	/*

	     * ÐÐ²Ð° ÐºÐµÐ½Ð³ÑÑÑ ÐÐµÑÐ° Ð¸ ÐÐ³Ð¾ÑÑ Ð½Ð°ÑÐ¸Ð½Ð°ÑÑ Ð¿ÑÑÐ³Ð°ÑÑ Ð¾Ð´Ð½Ð¾Ð²ÑÐµÐ¼ÐµÐ½Ð½Ð¾, Ð½Ð¾ Ñ ÑÐ°Ð·Ð½ÑÑ ÑÑÐ°ÑÑÐ¾Ð²ÑÑ Ð¿Ð¾Ð·Ð¸ÑÐ¸Ð¹: Ñ1 Ð¸ Ñ2.
         * Ð Ð¸Ð¼ÐµÑÑ ÑÐ°Ð·Ð½ÑÑ Ð´Ð»Ð¸Ð½Ñ Ð¿ÑÑÐ¶ÐºÐ¾Ð²: v1 Ð¸ v2.
         * ÐÑÑÐ³Ð°ÑÑ Ð² Ð¾Ð´Ð½Ð¾Ð¼ Ð½Ð°Ð¿ÑÐ°Ð²Ð»ÐµÐ½Ð¸Ð¸. ÐÐ¿ÑÐµÐ´ÐµÐ»Ð¸ÑÑ ÑÐ¼Ð¾Ð³ÑÑ Ð»Ð¸ Ð¾Ð½Ð¸ Ð¾ÐºÐ°Ð·Ð°ÑÑÑÑ Ð²
         * Ð¾Ð´Ð½Ð¾Ð¹ ÑÐ¾ÑÐºÐµ Ð² Ð¾Ð´Ð¸Ð½ Ð¼Ð¾Ð¼ÐµÐ½Ñ Ð²ÑÐµÐ¼ÐµÐ½Ð¸Ð¸. ÐÑÐ»Ð¸ Ð´Ð°, ÑÐ¾ Ð²ÑÐ²ÐµÑÑÐ¸ YES, Ð¸Ð½Ð°ÑÐµ NO.
         * 0 <= x1 <= x2 <= 10000
         * 1 <= v1 <= 10e4
         * 1 <= v2 <= 10e4
         *
         * ÐÑÐ¸Ð¼ÐµÑ: 0 3 4 2 YES  0 2 5 3 NO
         */

    // Complete the kangaroo function below.
    static String kangaroo(int x1, int v1, int x2, int v2) {
        String result = new String();
        while ((x1 <= 10000) && (v1 <= 10000) && (x2 <= 10000) && (v2 <= 10000)){
            x1 += v1;
            x2 += v2;
            if (x1 == x2){
                result = "YES";
                break;
            }
        }
        if (result.length() == 0) result = "NO";
        return result;
	* ??????: 0 3 4 2. ?????: YES
	*/


    // Complete the kangaroo function below.
    static String kangaroo(int x1, int v1, int x2, int v2) {


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        FileWriter F = new FileWriter("OUTPUT_PATH.txt");
       BufferedWriter bufferedWriter = new BufferedWriter(F);
        String[] x1V1X2V2 = scanner.nextLine().split(" ");

        int x1 = Integer.parseInt(x1V1X2V2[0]);

        int v1 = Integer.parseInt(x1V1X2V2[1]);

        int x2 = Integer.parseInt(x1V1X2V2[2]);

        int v2 = Integer.parseInt(x1V1X2V2[3]);

        bufferedWriter.write(kangaroo(x1,v1,x2,v2));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

