import java.util.Scanner;

public class Main {
    
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());

        final int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        scanner.close();
        Func1 Func1 = new Func1();
        Func1.setName(n);

      //  System.out.println("Проверяем");
      //   System.out.println("Старт "+Thread.currentThread().getName());
      //  new Thread(new Runnable() {
      //      public void run() {
      //          System.out.println("Результат " + Func1.staircase(n));
       //     }
      //  }).start();

       // System.out.println("Стоп "+Thread.currentThread().getName());

        System.out.println();

        System.out.printf("%s старт... \n", Thread.currentThread().getName());
        (new Thread(Func1::staircase)).start();
        System.out.printf("%s финиш... \n", Thread.currentThread().getName());

    }
}

