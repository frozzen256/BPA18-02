package commonPackage;

import templateMethodPackage.*;
import strategyPatternPackage.*;

public class Main {

	public static void main(String[] args) {

		Graph graph = new Graph();
		graph.addVertex('A'); //0
		graph.addVertex('B'); //1
		graph.addVertex('C'); //2
		graph.addVertex('D'); //3
		graph.addVertex('E'); //4
		graph.addVertex('F'); //5
		graph.addVertex('G'); //6
		graph.addVertex('H'); //7
		
		graph.addEdge(0, 1); //AB
		graph.addEdge(1, 2); //BC
		graph.addEdge(2, 3); //CD
		graph.addEdge(0, 4); //AE
		graph.addEdge(4, 5); //EF
		graph.addEdge(3, 6); //DG
		graph.addEdge(3, 7); //DG
		
		//TEMPLATE
		/*SearchAlgorithm dfs = new DepthFirstSearch();
		SearchAlgorithm bfs = new BreadthFirstSearch();
		dfs.search(graph, 0);
		bfs.search(graph, 0);*/
			
		//STRATEGY		
		Context context = new Context(); 
		context.setAlgorithm(new BFS());
		context.search(graph, 0);
		 	
	}

}
