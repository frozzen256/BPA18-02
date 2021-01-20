package strategyPatternPackage;

import commonPackage.Graph;
import commonPackage.Stack;

public class DFS implements Algorithm {
	Stack stack = new Stack();
	
	public void startSearch(Graph graph, int index) {
		System.out.println("«апущен обход в глубину");
		visitVertex(graph, index);
		while (!stack. IsEmpty()) {
			int neighbour = graph.checkUnvisitedVertex(stack.peak()); //извлекаем вершину и провер€ем, но не удал€ем
			
			if(neighbour == -1) {
				//если соседей нет - убираем из стека
				neighbour = stack.pop();
			}
			else {
				//если есть сосед - выводим его, помечаем, пихаем в стек
				visitVertex(graph, neighbour);
			}
		}		
	}
	
	public void endSearch(Graph graph) {
		System.out.println("ќбход в глубину завершен\n");	
		graph.reset();
	}
	
	public void visitVertex(Graph graph, int vertex) {
		System.out.println(graph.vertexArray[vertex].name);
		graph.vertexArray[vertex].isVisited = true;
		stack.push(vertex);
	}
}
