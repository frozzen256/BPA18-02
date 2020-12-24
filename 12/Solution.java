import java.util.Scanner;

class Solution {

    public static void main(String[] args) {
	/*
	 * Дано: n - число элементов в строке
	 *		s - строка
	 * 		2 <= n <= 10e6
	 *		s[i]= {UD}
	 * Эта строка описывает движение человека с уровня 0. D - шаг вниз; U - шаг вверх.
	 * Человек прошел долину, если спустился вниз и вернулся на уровень 0.
	 * Вывести число долин на пути следования.
	 * Пример:
	 * 8
	 * UDDDUDUU
	 * 1
	 *
	 *_/\      _
	 *   \    /
	 *    \/\/
	 */


        Scanner in = new Scanner(System.in);

        RouteHuman Route = new RouteHuman();

        System.out.print("Enter a string of characters: U and D\n");
        Route.setRoute(in.nextLine());

        System.out.print("Enter the number of elements per line: ");
        Route.setValleyNumber(in.nextInt());

        Route.Amout_Of_Valleys();

        new Thread(Route::Amout_Of_Valleys).start();
    }
}