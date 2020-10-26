import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
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
    }

}
