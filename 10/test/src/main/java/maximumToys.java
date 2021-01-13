public class maximumToys {
    public int maximumToystest(int[] p, int k) {
        int n = p.length;
        int minToys = 0;
        int amountToys = 0;
        for(int j = 0; j < n ; j++){
            for(int i = 0; i < n -1 ; i++){
                if (p[i] > p[i+1]){
                    int temp = p[i];
                    p[i] = p[i+1];
                    p[i+1] = temp;
                }
            }
        }
        try{while (k >= p[minToys]) {
            k = k - p[minToys];
            minToys++;
            amountToys++;
        }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Программа выводит не достоверные данные так как вы ввели отрицательное число в k");
        }
        return amountToys;
    }
}
