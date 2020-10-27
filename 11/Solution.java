import java.io.*;
import java.util.*;
import java.math.*;

import java.util.Arrays;
	

    static int func1(int[] A) 
    {
    	int n = A.length;
    	Arrays.sort(A);
    	int max = 0;
        int s = 0;       
        
        for(int i = 0; i < n; i++) 
        {
            for(int j = i; j < n; j++)
                if(A[j] - A[i] <= 1) 
                    s++;
   
            if(s > max)
                max = s;
            s = 0;
        }
        
        return max;
      }
    

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("out.txt"));//System.getenv("OUTPUT_PATH")


        System.out.print(func1(a));;		


	
        bufferedWriter.write(String.valueOf(result));
       
        bufferedWriter.close();
        scanner.close();
    }
}