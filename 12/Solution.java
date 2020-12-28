import java.util.InputMismatchException;
import java.util.Scanner;

class Solution {

	//обявили сканер
	static Scanner in = new Scanner(System.in);
	static RouteHuman Route = new RouteHuman();
	static Thread thread = new Thread(Route::Amout_Of_Valleys);

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
		Start();
	}

	public static void Start() {

		System.out.print("Enter a string of characters: U and D\n");
		Route.setRoute(in.nextLine());

		System.out.print("Enter the number of elements per line: ");
		//проверка числоваого ввода
		try {
			Route.setValleyNumber(in.nextInt());
			thread.run();
		} catch (InputMismatchException e) {
			String s = "";
			for (int i = 0; i < 40; i++) {
				s += "~";
			}
			System.out.println(s + "\n" + "Quantity was assigned a value of " + e.getMessage());
			System.out.println("Please enter the correct quantity\n" + s + "\n");
		}

		//ождинание завершения потока
		try {
			thread.join();
			System.out.println("Thread completed successfully");
		} catch (Exception e) {
			String s = "";
			for (int i = 0; i < 40; i++) {
				s += "~";
			}
			System.out.println(s + "\n" + "Thread terminated by exception");
			System.out.println(e.getMessage() + "\n" + s + "\n");
		}
		//завершается метод Start после завершения потока Thread
	}
}