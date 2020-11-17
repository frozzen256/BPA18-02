import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Program {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        FileWriter F = new FileWriter("OUTPUT_PATH.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(F);
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] x1V1X2V2 = scanner.nextLine().split(" ");

        int x1 = Integer.parseInt(x1V1X2V2[0]);

        int v1 = Integer.parseInt(x1V1X2V2[1]);

        int x2 = Integer.parseInt(x1V1X2V2[2]);

        int v2 = Integer.parseInt(x1V1X2V2[3]);

        bufferedWriter.write(Solution.kangaroo(x1,v1,x2,v2));

        bufferedWriter.newLine();

        bufferedWriter.close();

        System.out.println("Старт основного потока...");

        System.out.printf("%s старт... \n", Thread.currentThread().getName());

        new Thread(() -> System.out.println("Результат вычисления:  " + Solution.kangaroo(x1, v1, x2, v2))).start();
        new Thread(() -> System.out.println("Результат вычисления:  " + Solution.kangaroo(x1, v1, x2, v2))).start();

        System.out.printf("%s финиш... \n", Thread.currentThread().getName());

        scanner.close();

        System.out.println(Solution.kangaroo(x1,v1,x2,v2));
    }
}
