 import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
<<<<<<< HEAD
import java.util.Scanner;
=======
>>>>>>> upstream/Dev
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
     	/*
<<<<<<< HEAD
	     * Два кенгуру Кеша и Игорь начинают прыгать одновременно, но с разных стартовых позиций: х1 и х2.
         * И имеют разную длину прыжков: v1 и v2.
         * Прыгают в одном направлении. Определить смогут ли они оказаться в
         * одной точке в один момент времении. Если да, то вывести YES, иначе NO.
         * 0 <= x1 <= x2 <= 10000
         * 1 <= v1 <= 10e4
         * 1 <= v2 <= 10e4
         *
         * Пример: 0 3 4 2 YES  0 2 5 3 NO
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
=======
	* ??? ??????? ???? ? ????? ???????? ??????? ????????????, ?? ? ?????? ????????? ???????: ?1 ? ?2.
	* ? ????? ?????? ????? ???????: v1 ? v2.
	* ??????? ? ????? ???????????. ?????????? ?????? ?? ??? ????????? ?
	* ????? ????? ? ???? ?????? ????????. ???? ??, ?? ??????? YES, ????? NO.
	* 0 <= x1 <= x2 <= 10000
	* 1 <= v1 <= 10e4
	* 1 <= v2 <= 10e4
	*
	* ??????: 0 3 4 2. ?????: YES
	*/

    // Complete the kangaroo function below.
    static String kangaroo(int x1, int v1, int x2, int v2) {


>>>>>>> upstream/Dev
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
<<<<<<< HEAD
        FileWriter F = new FileWriter("OUTPUT_PATH.txt");
       BufferedWriter bufferedWriter = new BufferedWriter(F);
=======
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
>>>>>>> upstream/Dev

        String[] x1V1X2V2 = scanner.nextLine().split(" ");

        int x1 = Integer.parseInt(x1V1X2V2[0]);

        int v1 = Integer.parseInt(x1V1X2V2[1]);

        int x2 = Integer.parseInt(x1V1X2V2[2]);

        int v2 = Integer.parseInt(x1V1X2V2[3]);

<<<<<<< HEAD
        bufferedWriter.write(kangaroo(x1,v1,x2,v2));
=======

        bufferedWriter.write(result);
>>>>>>> upstream/Dev
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

