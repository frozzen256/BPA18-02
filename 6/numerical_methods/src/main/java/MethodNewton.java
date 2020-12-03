import java.lang.*;

public class MethodNewton implements MethodsStrategy {
    public double func1(double a) {
        double x = 0;
        x = Math.pow(a, 3) - 3 * a - 2;
        return x;
    }

    public static double SecondDerivativeF1(double a)
    {
        double x;
        x = 6 * a;
        return x;
    }

    public double method(double a, double b, double epsilon) {
        double[] ListX = new double[100];
        ListX[0] = b;
        ListX[1] = a;
        int k = 0;
        while(Math.abs(func1(ListX[k+1])) > epsilon)
        {
            ListX[k + 2] = ListX[k + 1] - (func1(ListX[k + 1]) / SecondDerivativeF1(ListX[k + 1]));
           System.out.println("Итерация k = " + k + "   Полученное значение = " + ListX[k + 1]);
            k++;
        }
        System.out.println("Итоговое число итераций k = " + k);

        return ListX[k+1];
    }
}
