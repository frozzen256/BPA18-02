package first_package;

import static org.junit.Assert.*;

import org.junit.Test;

public class FirstCase {

	@Test
	public void test() {
		MainClass test = new MainClass();
		int[] array1 = {1, 1, 2, 2, 4, 4, 5, 5, 5};
		int[] array2 = {4, 6, 5, 3, 3, 1};

		//первый пример
		Solver solver = new Solver();
		solver.setArray(array1);
		int result = solver.FirstTaskSolution(solver);
		assertEquals(5, result);
		
		//второй пример
		solver.setArray(array2);
		result = solver.FirstTaskSolution(solver);
		assertEquals(3, result);
		
		
	}

}
