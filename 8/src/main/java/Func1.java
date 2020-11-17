public class Func1 {
    static String func1(int[] arr) {
        int q = 0;
        int p = 0;
        int z = 0;
        for (int i = 0;i < arr.length; i++){
            if (arr[i]>0)
                q++;
            else if (arr[i]<0)
                p++;
            else
                z++;
        }
        String str = Float.toString((float) q/arr.length) + ' ' + Float.toString((float) p/arr.length) + ' ' + Float.toString((float) z/arr.length);
        return str;
    }
}
