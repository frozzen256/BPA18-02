public class HordRun extends ProgramTemp{



    public double RunFunc(double x_prev, double x_curr, double e) {
        double x_next = 0;
        double tmp;
        do{
            tmp = x_next;
            x_next = x_curr - f(x_curr) * (x_prev - x_curr) / (f(x_prev) - f(x_curr));
            x_prev = x_curr;
            x_curr = tmp;
        } while (Math.abs(x_next - x_curr) > e);
        return x_next;
    }

    public void WinPrint(double x) {
    }

}
