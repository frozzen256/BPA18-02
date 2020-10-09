import java.io.*;
import java.util.*;
import java.math.*;
import java.util.Arrays;

public class qwe {
   /*
    * ���������� ������������ �������� ������������ ��������� ��������� �������. �������� ���������� � ������������, ����
	* �������� ����� ������ ���������� ������������ ������ ���� ����� 1.	
	* ����: n - ���������� ����� � �������
	*		a - ������ �����
	* 		2 <= n <= 100
	*		0 < a[i] < 100
	*		����� ������ ���� >=2, �������� ����� ������
	* ������:
	*  9
	*  1 1 2 2 4 4 5 5 5
	* �����:
	* 5
	*
	* 6
	* 4 6 5 3 3 1
	* �����:
	* 3
	*/
	
    static int func1(int[] a) 
    {
    	int n = a.length;
    	Arrays.sort(a);
    	int max = 0;
        int s = 0;       
        
        for(int i = 0; i < n; i++) 
        {
            for(int j = i; j < n; j++)
                if(a[j] - a[i] <= 1) 
                    s++;
   
            if(s > max)
                max = s;
            s = 0;
        }
        
        return max;
      }
    

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

    	
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

        System.out.print(func1(a));;		

        scanner.close();
    }
}