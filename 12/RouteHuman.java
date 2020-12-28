public class RouteHuman {

    private String Route;
    private int ValleyNumber;
    private int Amout;

    public RouteHuman(String Route, int ValleyNumber, int Amout) {
        this.Route = Route;
        this.ValleyNumber = ValleyNumber;
        this.Amout = Amout;
    }

    public RouteHuman() {
    }

    public String getRoute() {
        return Route;
    }

    public void setRoute(String Route) {
        this.Route = Route;
    }

    public int getValleyNumber() {
        return ValleyNumber;
    }

    public void setValleyNumber(int ValleyNumber) {
        this.ValleyNumber = ValleyNumber;
    }

    public int getAmout() {
        return Amout;
    }

    public void setAmout(int Amout) {
        this.Amout = Amout;
    }

    public void Amout_Of_Valleys() {
        System.out.print("Amout of valleys:");

        int y = 0;
        boolean up = true;
        int Amout = 0;
        int Max = 1;
        int Min = 0;

        for (char ch : Route.toCharArray()) {
            if (ch == 'U') {
                up = true;
                y++;
                //System.out.println("/");
            } else {
                up = false;
                y--;
                //System.out.println("\\");
            }
            //System.out.println(y);
            if (y == 0 & up) {
                Amout++;
                //System.out.println("_");
            }

            Max = Max > y ? Max : y;
            Min = Min < y ? Min : y;
        }

        System.out.println(Amout);

        try {
            Graph_Output(Max, Min, Amout);
        }
        //ловим исключения в массивах
        catch (ArrayIndexOutOfBoundsException e) {
            String s = "";
            for (int i = 0; i < 40; i++) {
                s += "~";
            }
            System.out.println(s + "\n" + e.getMessage());
            System.out.println(Max + "\n" + Min + "\n" + s + "\n");
        }
        //ловим другие исключения
        catch (Exception e) {
            String s = "";
            for (int i = 0; i < 40; i++) {
                s += "~";
            }
            System.out.println(s + "\n" + e.getMessage() + "\n" + s + "\n");
        }

        setAmout(Amout);
    }

    //пропускаем все исключения
    void Graph_Output(int Max, int Min, int Amout) throws Exception {

        char[][] Graph = new char[Max - Min][Amout + ValleyNumber + 1];

        Graph[Max - 1][0] = '_';
        int k = 0;
        int y = Max - 1;
        boolean up = true;
        for (char ch : Route.toCharArray()) {
            k++;
            if (ch == 'U') {
                Graph[y][k] = '/';
                y--;
                if (y == Max - 1) {
                    k++;
                    Graph[y][k] = '_';
                }
            } else {
                y++;
                Graph[y][k] = '\\';
            }
        }
        System.out.println("Output Graph:");
        for (int l = 0; l < Max - Min; l++) {
            System.out.println();
            for (int c = 0; c < Amout + ValleyNumber + 1; c++) {
                if (Graph[l][c] == 0)
                    System.out.print(" ");
                else
                    System.out.print(Graph[l][c]);
            }
        }
        System.out.println("");
    }
}