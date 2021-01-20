package commonPackage;

public class Graph {
	private final int maxN = 10;
	public int[][] matrix; //матрица смежности
	public Vertex[] vertexArray; //массив вершин
	public int currentN; //счетчик текущих вершин
	
	/*
	 * public int[][] getMatrix() { return this.matrix; }
	 * 
	 * public Vertex[] getVertexArray() { return this.vertexArray; }
	 * 
	 * public int getCurrentN( ) { return this.currentN; }
	 */
	
	//инициализация графа
	public Graph() {
		vertexArray = new Vertex[maxN];
		matrix = new int[maxN][maxN];
		currentN = 0;
	}
	
	//создание вершины
	public void addVertex(char name) {
		vertexArray[currentN++] = new Vertex(name);
	}
	
	//создание ребра
	public void addEdge(int start, int end) {
		matrix[start][end] = 1;
		matrix[end][start] = 1;
	}
	
	//сброс посещенности вершин
	public void reset() {
		for(int i = 0; i < currentN; i++) {
			vertexArray[i].isVisited = false;
		}
	}
	
	//проверка посещенности
	public int checkUnvisitedVertex(int v) {
		for(int i = 0; i < currentN; i++) {
			if (matrix[v][i] == 1 && vertexArray[i].isVisited == false) {
				return i;
			}
		}
		
		return -1;
	}		
	
			
	
	
}
