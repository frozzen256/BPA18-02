import java.util.logging.Logger;

//убрала входную переменную и сделала сеттер
public class Func1 {

    private int n;

    public void setName(int n) {
        this.n = n;
    }

    public void staircase() {
        System.out.println(Thread.currentThread().getName());

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {
                if (j < n - 1 - i) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");

                }
            }
            System.out.println(" ");
        }
    }
}

