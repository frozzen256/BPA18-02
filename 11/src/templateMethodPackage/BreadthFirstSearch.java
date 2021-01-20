package templateMethodPackage;

import commonPackage.*;

public class BreadthFirstSearch extends SearchAlgorithm {
	private Queue queue = new Queue();
	
	@Override
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
	
	@Override
	public void endSearch(Graph graph) {
		System.out.println("����� � ������ ��������\n");	
		graph.reset();
	}
	
	@Override
	public void visitVertex(Graph graph, int vertex) {
		System.out.println(graph.vertexArray[vertex].name);
		graph.vertexArray[vertex].isVisited = true;
		queue.insert(vertex);
	}


}
