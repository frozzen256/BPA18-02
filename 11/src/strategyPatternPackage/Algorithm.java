package strategyPatternPackage;

import commonPackage.Graph;

public interface Algorithm {
	void startSearch(Graph graph, int index);
	void endSearch(Graph graph);
	void visitVertex(Graph graph, int vertex);
}
