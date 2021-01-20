package commonPackage;

public class Queue {
	private int[] array;
	private int size = 10;
	private int head;
	private int tail;
	private int count;
	
	public Queue() {
		array = new int[size];
		head = 0;
		tail = -1;
		count = 0;
	}
	
	public void insert(int v) {
		if (tail == size-1) {		
			tail = -1; //если превысили лимит очереди
		}
		
		array[++tail] = v;
		count++;
	}
	
	public int remove() {
		if (head == size) {
			head = 0;
		}
		
		count--;
		return array[head++];
	}
	
	public boolean isEmpty() {
		return count == 0;
	}
}
