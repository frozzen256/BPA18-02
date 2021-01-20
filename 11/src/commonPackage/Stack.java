package commonPackage;

public class Stack {
	private int size = 10;	
	private int top; //то, что наверху стека
	private int[] array;
	
	public Stack() {
		array = new int[size];
		top = -1;
	}

	public void push(int v) {
		array[++top] = v;
	}
	
	public int pop() {
		return array[top--];
	}
	
	public int peak() {
		return array[top];
	}
	
	public boolean IsEmpty() {
		if (top == -1) {	
			return true;
		}
		else {
			return false;
		}
	}
}
