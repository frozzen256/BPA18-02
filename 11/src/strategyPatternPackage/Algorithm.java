package strategyPatternPackage;

import commonPackage.Graph;

public interface Algorithm {
	public void startSearch(Graph graph, int index);
	public void endSearch(Graph graph);
	public void visitVertex(Graph graph, int vertex);
}
