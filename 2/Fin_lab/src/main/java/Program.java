
public class Program {

    public static void main(String[] args) {
        ProgramTemp hordrun = new HordRun();
        ProgramTemp nythrun = new NythRun();

        int a=5,b=10;


        System.out.println("Метод Хорд\n");
        hordrun.runPageMat(a,b);

        System.out.println("\n----------------------------------\n");

        System.out.println("Метод Ньютона\n");
        nythrun.runPageMat(a,b);

    }

}
