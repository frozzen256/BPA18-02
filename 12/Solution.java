import java.util.Scanner;

class Scratch {

    static int N;
    static String strUD;

    static void Amout_Of_Valleys() {
        System.out.print("Amout of valleys:");

        int y = 0;
        boolean up = true;
        int Amout = 0;
        int Max=0;
        int Min=0;

        for (char ch : strUD.toCharArray()) {
            if (ch == 'U')
            {
                up = true;
                y++;
                //System.out.println("/");
            }
            else
            {
                up = false;
                y--;
                //System.out.println("\\");
            }
            //System.out.println(y);
            if (y == 0 & up){
                Amout++;
                //System.out.println("_");
            }

            Max = Max > y?Max:y;
            Min = Min < y?Min:y;
        }
       /* System.out.println();
        System.out.println(Max);
        System.out.println(Min);*/
        System.out.println(Amout);
        Graph_Output(Max,Min,Amout);
    }

    static void Graph_Output(int Max, int Min, int Amout){

        char[][] Graph = new char[Max-Min][Amout+N+1];

        Graph[Max-1][0]= '_';
        int k = 0;
        int y = Max-1;
        boolean up = true;
        for (char ch : strUD.toCharArray()) {
            k++;
            if (ch == 'U')
            {
                Graph[y][k] = '/';
                y--;
                if (y==Max-1) {
                    k++;
                    Graph[y][k] = '_';
                }
            }
            else
            {
                y++;
                Graph[y][k] = '\\';
            }
        }
        System.out.println("Output Graph:");
        for (int l=0;l<Max-Min;l++){
            System.out.println();
            for (int c=0;c<Amout+N+1;c++) {
                if (Graph[l][c] == 0)
                    System.out.print(" ");
                else
                    System.out.print(Graph[l][c]);
            }
        }
    }

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

        System.out.println("Hello World!");
        Scanner in= new Scanner(System.in);

        System.out.print("Enter a string of characters: U and D\n");
        strUD = in.nextLine();

        System.out.print("Enter the number of elements per line: ");
        N = in.nextInt();

        Amout_Of_Valleys();

    }
}