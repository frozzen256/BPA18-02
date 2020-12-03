import java.util.Scanner;
import java.io.*;

public class Program {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите значения отрезка [a ; b]");

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        System.out.println("Введите значение точности epsilone");
        double epsilone = scanner.nextDouble();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        Context context = new Context();
        if(a == 0){
            System.out.println("Решаю методом половинного деления");
            context.chooseStrategy(new MethodHalfDiv());
        }
        else{
            System.out.println("Решаю методом Ньютона");
            context.chooseStrategy(new MethodNewton());
        }
        System.out.println("Полученное значение х = "+context.executeStrategy(a,b,epsilone));
    }
}
