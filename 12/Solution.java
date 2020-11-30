import java.util.Scanner;

class Scratch {

    public static void main(String[] args) {
        /*
         * ÐÐ°Ð½Ð¾: n - ÑÐ¸ÑÐ»Ð¾ ÑÐ»ÐµÐ¼ÐµÐ½ÑÐ¾Ð² Ð² ÑÑÑÐ¾ÐºÐµ
         *		s - ÑÑÑÐ¾ÐºÐ°
         * 		2 <= n <= 10e6
         *		s[i]= {UD}
         * Ð­ÑÐ° ÑÑÑÐ¾ÐºÐ° Ð¾Ð¿Ð¸ÑÑÐ²Ð°ÐµÑ Ð´Ð²Ð¸Ð¶ÐµÐ½Ð¸Ðµ ÑÐµÐ»Ð¾Ð²ÐµÐºÐ° Ñ ÑÑÐ¾Ð²Ð½Ñ 0. D - ÑÐ°Ð³ Ð²Ð½Ð¸Ð·; U - ÑÐ°Ð³ Ð²Ð²ÐµÑÑ.
         * Ð§ÐµÐ»Ð¾Ð²ÐµÐº Ð¿ÑÐ¾ÑÐµÐ» Ð´Ð¾Ð»Ð¸Ð½Ñ, ÐµÑÐ»Ð¸ ÑÐ¿ÑÑÑÐ¸Ð»ÑÑ Ð²Ð½Ð¸Ð· Ð¸ Ð²ÐµÑÐ½ÑÐ»ÑÑ Ð½Ð° ÑÑÐ¾Ð²ÐµÐ½Ñ 0.
         * ÐÑÐ²ÐµÑÑÐ¸ ÑÐ¸ÑÐ»Ð¾ Ð´Ð¾Ð»Ð¸Ð½ Ð½Ð° Ð¿ÑÑÐ¸ ÑÐ»ÐµÐ´Ð¾Ð²Ð°Ð½Ð¸Ñ.
         * ÐÑÐ¸Ð¼ÐµÑ:
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
    }
}