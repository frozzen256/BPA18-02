import java.util.Scanner;

public class Main {
    
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        final int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        Func1.staircase(n);
        scanner.close();


        System.out.println("Проверяем");
        System.out.println("Старт "+Thread.currentThread().getName());
        new Thread(new Runnable() {
            public void run() {
                System.out.println("Результат " + Func1.staircase(n));
            }
        }).start();
        new Thread(new Runnable() {
            public void run() {
                System.out.println("Результат " + Func1.staircase(n));
            }
        }).start();
        System.out.println("Стоп "+Thread.currentThread().getName());
        System.out.println();
    }
}

