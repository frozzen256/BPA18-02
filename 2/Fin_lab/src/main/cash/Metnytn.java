public class Metnytn {
    public static void main(String[] args) {

        double eps = 0.001;
        double x = 2;

        int iteration;
        for (iteration = 1; Math.abs(f(x)) > eps; iteration++) {
            if (df(x) == 0) {
                break;
            }
            x -= f(x) / df(x);

        }
        System.out.println("Iteration: " + iteration + ";");

        System.out.printf("x =     %.4f;\n", x);

        System.out.printf("f(x) =  %.4f;\n", f(x));
        System.out.printf("f`(x) = %.4f;\n", df(x));

    }

    private static double f(double x) {
        return Math.pow(x, 2) - 2;
    }

    private static double df(double x) {
        return 2*x;
    }
}