import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Logger;


public class main {

    private static final Logger LOGGER = Logger.getGlobal();

    public static void main(String[] arge){
        LOGGER.info("Поработаем?");
        boolean wh;
        final Scanner scanner = new Scanner(System.in);
        System.out.println("Проработать свой случай(0) или из примера(1)? 0/1");
        int pwh = scanner.nextInt();
        if(pwh == 0) {
            wh = false;
        }else{
            wh = true;
        }

        maximumToys clasToys = new maximumToys();

        if(!wh){
            LOGGER.warning("Записываются только числа и при том положительные!");
            System.out.println("Кол-во товара n:");
            int n = 0;
            try
            {
                 n = scanner.nextInt();
            }catch (InputMismatchException e)
            {
                LOGGER.info("Нужно вводить только числа, предётся перезапустить программу.");
            }
            System.out.println("Кол-во денег:");
            int k = scanner.nextInt();
            System.out.println("Стоиомсть игрушек берем рандом:");
            try{
                int[] p = new int[n];
            }catch (NegativeArraySizeException e){
                LOGGER.info("Введено " + n + " :Введите положительное");
                n = scanner.nextInt();
            }
            int[] p = new int[n];
            for(int i = 0; i < n; i++){
                p[i] = (int) Math.round((Math.random() * (k*1.5)) );
                System.out.println(p[i]);
            }
            System.out.println("Игрушек можно купить :" + clasToys.maximumToystest(p ,k));
        }
        else {
            if (wh) {
                int k = 50;
                int[] p = {1, 12, 5, 111, 200, 1000, 10};
                System.out.println("Проверяем");
                System.out.println("Старт "+Thread.currentThread().getName());
                new Thread(() -> System.out.println(("Результат: " + clasToys.maximumToystest(p, k)))).start();
                new Thread(() -> System.out.println(("Проверка Результата: " + clasToys.maximumToystest(p, k)))).start();
                new Thread(() -> System.out.println(("Окончательная проверка результата: " + clasToys.maximumToystest(p, k)))).start();
                System.out.println("Стоп "+Thread.currentThread().getName());
                System.out.println();
            } else {
                System.out.println("Вы ввели что-то не то...");
            }

        }

//        System.out.println("Кол-во товара n:");
//        int n = scanner.nextInt();
//        //int n = 7;
//        System.out.println("Enter kol-vo k-many:");
//        int k = scanner.nextInt();
//        //int k = 50;
//        System.out.println("Enter stoimost igrushek:");
//        //int[] p = {1, 12, 5, 111, 200, 1000, 10};
//        int[] p = new int[n];
//        for(int i = 0; i < n; i++){
//            p[i] = (int) Math.round((Math.random() * 200) );
//            System.out.println(p[i]);
//        }
    }
}
