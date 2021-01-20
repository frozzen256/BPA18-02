package strategyPatternPackage;

import commonPackage.Graph;

public class Context {
	private Algorithm algorithm;
	
	public void setAlgorithm(Algorithm algorithm) {
		this.algorithm = algorithm;
	}
	
	public void search(Graph graph, int index) {
		algorithm.startSearch(graph, index);
		algorithm.endSearch(graph);		
	}
}
