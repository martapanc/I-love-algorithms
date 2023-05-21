package com.martapanc.datastructures;

import java.util.Iterator;
import java.util.LinkedList;

class Graph {
    private int V; // number of vertices
    private LinkedList<Integer>[] adjacencyList; // adjacency list representation

    public Graph(int V) {
        this.V = V;
        adjacencyList = new LinkedList[V];
        for (int i = 0; i < V; i++) {
            adjacencyList[i] = new LinkedList<>();
        }
    }

    // Method to add an edge to the graph
    public void addEdge(int source, int destination) {
        adjacencyList[source].add(destination);
    }

    // Method to perform BFS traversal
    public void bfs(int source) {
        boolean[] visited = new boolean[V]; // keep track of visited vertices
        LinkedList<Integer> queue = new LinkedList<>(); // queue for BFS traversal

        visited[source] = true;
        queue.add(source);

        while (!queue.isEmpty()) {
            int currentVertex = queue.poll();
            System.out.print(currentVertex + " ");

            // Traverse all adjacent vertices of the current vertex
            Iterator<Integer> iterator = adjacencyList[currentVertex].listIterator();
            while (iterator.hasNext()) {
                int adjacentVertex = iterator.next();
                if (!visited[adjacentVertex]) {
                    visited[adjacentVertex] = true;
                    queue.add(adjacentVertex);
                }
            }
        }
    }
}

public class BfsExample {
    public static void main(String[] args) {
        Graph graph = new Graph(6);

        // Adding edges to the graph
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4);
        graph.addEdge(2, 5);

        System.out.println("BFS traversal starting from vertex 0:");
        graph.bfs(0);
    }
}

