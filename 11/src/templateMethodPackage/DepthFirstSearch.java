package templateMethodPackage;

import commonPackage.*;


public class DepthFirstSearch extends SearchAlgorithm {
	private Stack stack = new Stack();
	
	@Override
	void startSearch(Graph graph, int index) {
		System.out.println("������� ����� � �������");
		visitVertex(graph, index);
		while (!stack. IsEmpty()) {
			int neighbour = graph.checkUnvisitedVertex(stack.peak()); //��������� ������� � ���������, �� �� �������
			
			if(neighbour == -1) {
				//���� ������� ��� - ������� �� �����
				neighbour = stack.pop();
			}
			else {
				visitVertex(graph, neighbour);
			}
		}
	}
	
	@Override
	void endSearch(Graph graph) {
		System.out.println("����� � ������� ��������\n");	
		graph.reset();
	}
	
	@Override
	void visitVertex(Graph graph, int neighbour) {
		//���� ���� ����� - ������� ���, ��������, ������ � ����
		System.out.println(graph.vertexArray[neighbour].name);
		graph.vertexArray[neighbour].isVisited = true;
		stack.push(neighbour);
	}
	
	
}
