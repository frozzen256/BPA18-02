import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    
   	/* HackerLand National Bank èìååò ïðîñòóþ ïîëèòèêó ïðåäóïðåæäåíè¤ êëèåíòîâ î 
	 * âîçìîæíûõ ìîøåííè÷åñêèõ äåéñòâè¤õ íà ñ÷åòå. ?ñëè ñóììà, ïîòðà÷åííà¤ êëèåíòîì 
	 * â îïðåäåëåííûé äåíü, áîëüøå èëè ðàâíà ìåäèàíå ðàñõîäîâ êëèåíòà çà êîíå÷íîå 
	 * ÷èñëî äíåé, îíè îòïðàâë¤þò êëèåíòó óâåäîìëåíèå î ïîòåíöèàëüíîì ìîøåííè÷åñòâå.
	 * _àíê íå îòïðàâë¤åò êëèåíòó íèêàêèõ óâåäîìëåíèé äî òåõ ïîð, ïîêà ó íåãî íåò, 
	 * ïî êðàéíåé ìåðå, ýòîãî êîíå÷íîãî ÷èñëà òðàíçàêöèé çà ïðåäûäóùèå äíè. "÷èòûâà¤ 
	 * êîëè÷åñòâî çàâåðøàþùèõ äíåé è îáùèå åæåäíåâíûå ðàñõîäû êëèåíòà çà ïåðèîä, 
 	 * íàéäèòå è ðàñïå÷àòàéòå êîëè÷åñòâî äíåé, êîãäà êëèåíò ïîëó÷èò óâåäîìëåíèå.
	 *
	 * 1 <= n <= 2*10e5, n - êîëè÷åñòâî ó÷òåííûõ ðàñõîäîâ 
	 * 1 <= d <= n, d - êîëè÷åñòâî äíåé äë¤ ðàñ÷åòà ìåäèàíû
	 * 0 <= exp[i] <= 200
	 *
	 * _ðèìåð: 9 5
	 *	   2 3 4 2 3 6 8 4 5
	 * _òâåò: 2
	 * {2 2 3 3 4}, m = 3, 2 * 3 <= 6  1
	 * {2 3 3 4 6}, m = 3, 2 * 3 <= 8  1
	 * {3 3 4 6 8}, m = 4, 2 * 4 > 4   0
	 * {3 4 4 6 8}, m = 4, 2 * 4 > 5   0

	 * _ðèìåð: 5 4 
	 *	   1 2 3 4 4
	 * {1 2 3 4}, m = 2.5, 2 * 2.5 > 4 0	
	 * _òâåò: 0
	 */ 

    // Complete the activityNotifications function below.
    private static final Scanner scanner = new Scanner(System.in);

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
    static int activityNotifications(int[] expenditure, int d, int n)
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

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new FileWriter("Solution.txt"));
        String[] nd = scanner.nextLine().split(" ");
        int n = Integer.parseInt(nd[0]);
        int d = Integer.parseInt(nd[1]);
        int[] expenditure = new int[n];
        String[] expenditureItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int expenditureItem = Integer.parseInt(expenditureItems[i]);
            expenditure[i] = expenditureItem;
        }
        bw.write(String.valueOf(activityNotifications(expenditure,d,n)));
        bw.newLine();

        bw.close();
        scanner.close();
        System.out.println(activityNotifications(expenditure,d,n));
    }

}
