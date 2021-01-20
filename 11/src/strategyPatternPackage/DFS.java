package strategyPatternPackage;

import commonPackage.Graph;
import commonPackage.Stack;

public class DFS implements Algorithm {
	Stack stack = new Stack();
	
	public void startSearch(Graph graph, int index) {
		System.out.println("������� ����� � �������");
		visitVertex(graph, index);
		while (!stack. IsEmpty()) {
			int neighbour = graph.checkUnvisitedVertex(stack.peak()); //��������� ������� � ���������, �� �� �������
			
			if(neighbour == -1) {
				//���� ������� ��� - ������� �� �����
				neighbour = stack.pop();
			}
			else {
				//���� ���� ����� - ������� ���, ��������, ������ � ����
				visitVertex(graph, neighbour);
			}
		}		
	}
	
	public void endSearch(Graph graph) {
		System.out.println("����� � ������� ��������\n");	
		graph.reset();
	}
	
	public void visitVertex(Graph graph, int vertex) {
		System.out.println(graph.vertexArray[vertex].name);
		graph.vertexArray[vertex].isVisited = true;
		stack.push(vertex);
	}
}
