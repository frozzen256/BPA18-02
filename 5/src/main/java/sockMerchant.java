public class sockMerchant {

    static int sockMerchant1(int n, int[] ar) {
        int[] simpleAr = new int[n];
        int j, nb = 0;
        for (int i = 0; i < n; i++) {
            j = 0;

            while (j < n & (ar[i] != ar[j] | i == j)) {
                j++;
                if (j == n)
                    break;
            }

            if (j < n) {
                int t = 0;
                while (t <= nb & ar[i] != simpleAr[t])
                    t++;
                if (t > nb) {
                    nb++;
                    simpleAr[nb] = ar[i];
                }
            }
        }
        return nb;
    }
}
