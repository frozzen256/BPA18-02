
package com.company;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.IOException;

public class Main {

    /* ÐÐ°ÑÑÑÑ Ð¸Ð³ÑÐ°ÐµÑ Ð² Ð±Ð°ÑÐºÐµÑÐ±Ð¾Ð» Ð¸ ÑÐ¾ÑÐµÑ ÑÑÐ°ÑÑ Ð¿ÑÐ¾ÑÐµÑÑÐ¸Ð¾Ð½Ð°Ð»Ð¾Ð¼. ÐÐ°Ð¶Ð´ÑÐ¹ ÑÐµÐ·Ð¾Ð½
     * Ð¾Ð½Ð° Ð²ÐµÐ´ÐµÑ Ð·Ð°Ð¿Ð¸ÑÐ¸ ÑÐ²Ð¾Ð¸Ñ Ð¸Ð³Ñ. ÐÐ½Ð° Ð¿Ð¾Ð´ÑÑÐ¸ÑÑÐ²Ð°ÐµÑ, ÑÐºÐ¾Ð»ÑÐºÐ¾ ÑÐ°Ð· Ð¾Ð½Ð°
     * Ð¿Ð¾Ð±Ð¸Ð»Ð° ÑÐ²Ð¾Ð¹ ÑÐµÐºÐ¾ÑÐ´ Ð¾ÑÐºÐ¾Ð² Ð¸ ÑÐºÐ¾Ð»ÑÐºÐ¾ ÑÐ°Ð· ÑÑÑÐ´ÑÐ¸Ð»Ð° ÑÐµÐ·ÑÐ»ÑÑÐ°Ñ. ÐÐ¾Ð¼Ð¾ÑÑ ÐÐ°ÑÑÑÐµ.
     * n - ÐºÐ¾Ð»Ð¸ÑÐµÑÑÐ²Ð¾ Ð¸Ð³Ñ Ð·Ð° ÑÐµÐ·Ð¾Ð½.
     * 1 <= n <= 1000
     * 0 <= scores[i] <= 10e8
     *
     * ÐÑÐ¸Ð¼ÐµÑ: 9
     *         10 5 20 20 4 5 2 25 1
     * ÐÑÐ²ÐµÑ: 2 4
     */


    static int[] breakingRecords(int[] scores) {
        int max = scores[0];
        int min = scores [0];
        int[] result = new int[2];
        for (int i = 1; i < scores.length; i++) {
            if(scores[i] > max) {
                max = scores[i];
                result[0]++;
            }
            else if (scores[i] < min) {
                min = scores[i];
                result[1]++;
            }
        }
        return result;
    }

    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws IOException {

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        int[] scores = new int[n];
        String[] scoresItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] scores = new int[n];

        String[] scoresItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");


        int[] result = breakingRecords(scores);
        String outFile = System.getenv("OUTPUT_PATH");
        if(outFile != null) {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

            for (int i = 0; i < result.length; i++) {
                bufferedWriter.write(String.valueOf(result[i]));

                if (i != result.length - 1) {
                    bufferedWriter.write(" ");
                }
            }
            bufferedWriter.newLine();
            bufferedWriter.close();
        }
        else {
            for (int i = 0; i < result.length; i++) {
                System.out.println(String.valueOf(result[i]));
            }
        }
        scanner.close();
    }
}

