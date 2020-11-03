import java.io.*;
import java.util.Scanner;

public class Program {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        Bank bank = new Bank();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new FileWriter("Solution.txt"));
        String[] nd = scanner.nextLine().split(" ");
        int n = Integer.parseInt(nd[0]);
        int d = Integer.parseInt(nd[1]);
        int[] expenditure = new int[n];
        String[] expenditureItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        for (int i = 0; i < n; i++) {
            int expenditureItem = Integer.parseInt(expenditureItems[i]);
            expenditure[i] = expenditureItem;
        }
        bw.write(String.valueOf(bank.activityNotifications(expenditure,d,n)));
        bw.newLine();

        bw.close();
        scanner.close();
        System.out.println(bank.activityNotifications(expenditure,d,n));
    }
}
