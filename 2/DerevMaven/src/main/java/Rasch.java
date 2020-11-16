public class Rasch {
    public static int countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
        int result =0;

        for(int i=0;i<apples.length;i++)
        {
            apples[i]=apples[i]+a;
            if(apples[i]>s && apples[i]<t)
                result++;
        }
        for(int j=0;j<oranges.length;j++)
        {
            oranges[j]=oranges[j]+b;
            if(oranges[j]>s && oranges[j]<t)
                result++;
        }

        return result;
    }
}
