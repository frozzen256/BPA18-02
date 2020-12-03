import java.lang.*;

public class MethodHalfDiv implements MethodsStrategy {
    public double func1(double a) {
        double x = 0;
        x = Math.pow(a, 3) - 3 * a - 2;
        return x;

    }

    public double method(double a, double b, double epsilon) {
        double[] ListX = new double[100];
        ListX[0] = a;
        ListX[1] = (b + a) / 2;
        int k = 0;
        double F1 = func1(a);
        while(Math.abs(ListX[k] - ListX[k+1]) > epsilon)
        {
            ListX[k + 2] = ListX[k + 1] + ((b - a) * Math.abs(F1) * Math.abs(func1(ListX[k + 1])) / (Math.pow(2,k+2) * F1 * func1(ListX[k+1])));
            System.out.println("Итерация k = " + k + "   Полученное значение = " + ListX[k + 1]);
            k++;
        }
        System.out.println("Итоговое число итераций k = " + k + '\n');
        return ListX[k+1];
    }
}
