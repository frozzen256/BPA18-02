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

        System.out.println("Hello World!");
        Scanner in= new Scanner(System.in);

        System.out.print("Enter a string of characters: U and D\n");
        strUD = in.nextLine();

        System.out.print("Enter the number of elements per line: ");
        N = in.nextInt();

        Amout_Of_Valleys();
    }
}