import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

/*
Алиса - воспитатель детского сада. Она хочет дать детям конфеты. Все дети 
сидят в очереди, и каждый из них получает номер в соответствии с успеваемостью 
в классе. Алиса хочет дать каждому ребенку хотя бы по 1 конфете. Если двое 
детей сидят рядом, то тот, у кого рейтинг выше, должен получить больше конфет. 
Алиса хочет минимизировать общее количество конфет, которое она должна купить.

Параметры:
 int n: количество детей в классе
 int arr[n]: оценки каждого 

Вывод:
 int: минимальное количество конфет, которое Алиса должна купить

Пимер 1:
3
1
2
2
Ответ:
4
Здесь 1, 2, 2 - рейтинг. Обратите внимание: если у двух детей одинаковый рейтинг, 
им разрешено иметь разное количество конфет. Следовательно, оптимальное 
распределение будет 1, 2, 1.

Пример 2:
10
2
4
2
6
1
7
8
9
2
1
Ответ:
19
Отпимально: 1, 2, 1, 2, 1, 2, 3, 4, 2, 1

*/


public class Solution {

    static long candies(int n, int[] arr) {


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            int arrItem = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            arr[i] = arrItem;
        }

        long result = candies(n, arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
