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
		int result = test.func1(array1);
		assertEquals(5, result);
		
		//второй пример
		result = test.func1(array2);
		assertEquals(3, result);
		
		
	}

}
