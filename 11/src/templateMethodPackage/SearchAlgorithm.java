package templateMethodPackage;

import commonPackage.Graph;

public abstract class SearchAlgorithm {	
	
			
	public final void search(Graph graph, int index) {	
		startSearch(graph, index);
		endSearch(graph);
	}
	
	//������ ������
	abstract void startSearch(Graph graph, int index);	
	
	//����� ������
	abstract void endSearch(Graph graph);
	
	//��������� �������
	abstract void visitVertex(Graph graph, int vertex);
	
	
	
		
	
}
