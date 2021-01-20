package templateMethodPackage;

import commonPackage.Graph;

public abstract class SearchAlgorithm {	
	
			
	public final void search(Graph graph, int index) {	
		startSearch(graph, index);
		endSearch(graph);
	}
	
	//начало обхода
	abstract void startSearch(Graph graph, int index);	
	
	//конец обхода
	abstract void endSearch(Graph graph);
	
	//посещение вершины
	abstract void visitVertex(Graph graph, int vertex);
	
	
	
		
	
}
