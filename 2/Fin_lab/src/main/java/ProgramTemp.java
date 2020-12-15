public abstract class ProgramTemp {

    public void runPageMat(int a,int b){

        double x = 2;

        double x1 = b-a;
        double e = 0.0001;

        double x0[]=new double[b-a];
        for(int i = 0; i < b-a; i++) {
            x0[i]=a+i+1;

            x= RunFunc(x0[i],x1,e); //вызываем программу

            if(f(x)==0) // проверка, подходит ли корень, иначе идем дальше
                break;
        }

        System.out.printf("x =     %.4f;\n", x);
        System.out.printf("f(x) =  %.4f;\n", f(x));

        WinPrint(x);

    }

    public abstract double RunFunc(double x, double x1, double eps);

    public abstract void WinPrint(double x);

    public static double f(double x) {
        return Math.pow(x, 2) - 2;
    }

    public static double df(double x) {
        return 2*x;
    }
}
