package strategyPatternPackage;

import commonPackage.Graph;
import commonPackage.Queue;

public class BFS implements Algorithm {
	
	private Queue queue = new Queue();
	
	public void startSearch(Graph graph, int index) {
		System.out.println("������� ����� � ������");
		visitVertex(graph, index);

		int vertex;
		
		while(!queue.isEmpty()) {
			int temp = queue.remove(); //���������� �������
			
			while ((vertex = graph.checkUnvisitedVertex(temp)) != -1) {
				visitVertex(graph, vertex);
			}
		}
		
	}
	
	public void endSearch(Graph graph) {
		System.out.println("����� � ������ ��������\n");	
		graph.reset();
	}
	
	public void visitVertex(Graph graph, int vertex) {
		System.out.println(graph.vertexArray[vertex].name);
		graph.vertexArray[vertex].isVisited = true;
		queue.insert(vertex);
	}
}
