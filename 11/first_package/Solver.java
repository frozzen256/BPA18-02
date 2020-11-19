package first_package;

import java.util.Arrays;

public class Solver {
	
	int[] array;
	
	public int[] getArray() {
		return array;
	}
	
	public void setArray(int[] array) {
		this.array = array; 
	}
	
	
	public int FirstTaskSolution(Solver solver) {
		int[] A = solver.array;
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

}
