public class function {
    static int[] breakingRecords(int[] scores) {
        int max = scores[0];
        int min = scores [0];
        int[] result = new int[2];
        for (int i = 1; i < scores.length; i++) {
            if(scores[i] > max) {
                max = scores[i];
                result[0]++;
            }
            else if (scores[i] < min) {
                min = scores[i];
                result[1]++;
            }
        }
        return result;
    }
}
