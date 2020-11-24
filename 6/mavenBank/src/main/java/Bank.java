public class Bank {

    private int[] expenditure;

    public Bank(int[] input){
        expenditure = input;
    }

    static int[] bubbleSort(int[] array, int d){
        for(int i = 0; i < d; i++){
            for(int j = 0; j < d-i-1; j++){
                if(array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        return array;
    }

    static int activityNotifications(int n, int d, int[] expenditure)
    {

        int days = 0, k = 0;
        double m = 0;
        int[] halfActivity = new int[d];
        for(int i = 0; i < d; i++){
            halfActivity[i] = expenditure[i];
        }
        bubbleSort(halfActivity,d);
        if(d % 2 != 0){
            while(d+k < n){
                m = halfActivity[((d+1)/2)-1];
                if(2*m <= expenditure[d+k]){
                    days++;
                    halfActivity[0] = expenditure[d+k];
                    k++;
                    bubbleSort(halfActivity,d);
                }
                else{
                    halfActivity[0] = expenditure[d+k];
                    k++;
                    bubbleSort(halfActivity,d);
                }
            }
        }
        else{
            while(d+k < n){
                m = (double)(halfActivity[d/2] + halfActivity[(d/2)-1]) / 2;
                if(2*m <= expenditure[d+k]){
                    days++;
                    halfActivity[0] = expenditure[d+k];
                    k++;
                    bubbleSort(halfActivity,d);
                }
                else{
                    halfActivity[0] = expenditure[d+k];
                    k++;
                    bubbleSort(halfActivity,d);
                }
            }
        }
        return days;
    }
}
