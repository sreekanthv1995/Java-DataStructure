package graph;

public class Main {

    public static void main(String[] args) {


        Graph myGraph = new Graph();
        myGraph.addVertex("A");
        myGraph.addVertex("B");
        myGraph.addVertex("C");
        myGraph.addVertex("D");

        myGraph.addEdges("A","B");
        myGraph.addEdges("A","C");
        myGraph.addEdges("A","D");
        myGraph.addEdges("B","D");
        myGraph.addEdges("C","D");

        myGraph.removeVertex("D");

        myGraph.printGraph();
    }
}
