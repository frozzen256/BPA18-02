/*
Шерлок считает строку действительной, если все символы строки встречаются 
одинаковое количество раз. Также допустимо, если он может удалить один символ 
в строке, а остальные символы будут встречаться одинаковое количество раз. 
Определите, действительна ли она. Если да, верните YES, в противном случае 
верните NO.

Пример 1:
aabbcd
Ответ
NO

Пример 2:
abcdefghhgfedecba
Ответ:
Yes
*/

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the isValid function below.
    static String isValid(String s) {


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        String result = isValid(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
