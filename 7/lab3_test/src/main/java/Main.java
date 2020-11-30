import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static int[] result = new int[2];
    public static void main(String[] args) throws IOException, InterruptedException {

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        final int[] scores = new int[n];
        String[] scoresItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        for (int i = 0; i < n; i++) {
            int scoresItem = Integer.parseInt(scoresItems[i]);
            scores[i] = scoresItem;
        }


        Thread th = new Thread(new Runnable() {
            public void run() {
                result = function.breakingRecords(scores);
            }
        });
        th.start();
        th.join();

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
                System.out.print(String.valueOf(result[i] + " "));
            }
        }
        scanner.close();
    }
}
