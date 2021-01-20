package commonPackage;

public class Graph {
	private final int maxN = 10;
	public int[][] matrix; //������� ���������
	public Vertex[] vertexArray; //������ ������
	public int currentN; //������� ������� ������
	
	/*
	 * public int[][] getMatrix() { return this.matrix; }
	 * 
	 * public Vertex[] getVertexArray() { return this.vertexArray; }
	 * 
	 * public int getCurrentN( ) { return this.currentN; }
	 */
	
	//������������� �����
	public Graph() {
		vertexArray = new Vertex[maxN];
		matrix = new int[maxN][maxN];
		currentN = 0;
	}
	
	//�������� �������
	public void addVertex(char name) {
		vertexArray[currentN++] = new Vertex(name);
	}
	
	//�������� �����
	public void addEdge(int start, int end) {
		matrix[start][end] = 1;
		matrix[end][start] = 1;
	}
	
	//����� ������������ ������
	public void reset() {
		for(int i = 0; i < currentN; i++) {
			vertexArray[i].isVisited = false;
		}
	}
	
	//�������� ������������
	public int checkUnvisitedVertex(int v) {
		for(int i = 0; i < currentN; i++) {
			if (matrix[v][i] == 1 && vertexArray[i].isVisited == false) {
				return i;
			}
		}
		
		return -1;
	}		
	
			
	
	
}
