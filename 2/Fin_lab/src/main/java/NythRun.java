public class NythRun extends ProgramTemp{

    int iteration;

    public double RunFunc(double x, double x1, double eps) {

        for (iteration = 1; Math.abs(f(x)) > eps; iteration++) {
            if (df(x) == 0) {
                break;
            }
            x -= f(x) / df(x);

        }
        return x;
    }

    public void WinPrint(double x) {
        System.out.println("Итераций: " + iteration + ";");
        System.out.printf("f`(x) = %.4f;\n", df(x));

    }


}
