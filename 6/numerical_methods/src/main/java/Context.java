public class Context {
    public static MethodsStrategy strategy;

     public void chooseStrategy(MethodsStrategy strategy){
        this.strategy = strategy;
     }

     public double executeStrategy(double a, double b, double epsilone){
         return strategy.method(a,b,epsilone);
     }
}
