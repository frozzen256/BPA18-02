package templateMethodPackage;

import commonPackage.*;


public class DepthFirstSearch extends SearchAlgorithm {
	private Stack stack = new Stack();
	
	@Override
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
				visitVertex(graph, neighbour);
			}
		}
	}
	
	@Override
	public void endSearch(Graph graph) {
		System.out.println("ќбход в глубину завершен\n");	
		graph.reset();
	}
	
	@Override
	void visitVertex(Graph graph, int neighbour) {
		//если есть сосед - выводим его, помечаем, пихаем в стек
		System.out.println(graph.vertexArray[neighbour].name);
		graph.vertexArray[neighbour].isVisited = true;
		stack.push(neighbour);
	}
	
	
}
