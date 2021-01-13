import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Main {

    // Инициализация логера
    private static final Logger log = Logger.getLogger(String.valueOf(Main.class));

    //new
    private static Func1 logic;

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
       // log.info("Это информационное сообщение.Начало построения треугольника!");

        //new
        logic = new Func1();
        logic.staircase();

        System.out.println(Thread.currentThread().getName());
        int  n = 0;
        // логируем инфо
        log.info("Начало построения треугольника! Ввод параметра");
        try
        {
            log.warning("Параметр - число больше 0. Возможны ошибки");
            n = scanner.nextInt();
            System.out.println("Ошибок нет.Продолжение работы программы");
        }
        catch (InputMismatchException e)
        {
            System.out.println(e);
            System.out.println("Ошибка ввода!!! Параметр введен неверно");
            log.info("Ошибка ввода параметра!");
        }
        catch (Exception e)
        {
            System.out.println(e);
            // логируем
            log.info("Ошибка!");
            log.log(Level.INFO,"выводим все элементы листа с типизацией Integers в консоль");
        }
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            scanner.close();

        Func1 Func1 = new Func1();
        Func1.setName(n);
        System.out.println();
        System.out.printf("%s старт... \n", Thread.currentThread().getName());
        (new Thread(Func1::staircase)).start();
        System.out.printf("%s финиш... \n", Thread.currentThread().getName());

        // логируем
        log.info("Это информационное сообщение.Завершение работы программы!");
    }
}

