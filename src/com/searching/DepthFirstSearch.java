package com.searching;

public class DepthFirstSearch {
    public static void main(String[] args) {
        int[][] graph = {
                { 0, 1, 1, 0, 0 },
                { 1, 0, 0, 1, 1 },
                { 1, 0, 0, 0, 1 },
                { 0, 1, 0, 0, 1 },
                { 0, 1, 1, 1, 0 }
        };
        int startNode = 0;
        System.out.println("Depth-First Search starting from node " + startNode + ":");
        boolean[] visited = new boolean[graph.length];
        depthFirstSearch(graph, startNode, visited);
    }

    public static void depthFirstSearch(int[][] graph, int node, boolean[] visited) {
        visited[node] = true;
        System.out.print(node + " ");

        for (int i = 0; i < graph[node].length; i++) {
            if (graph[node][i] == 1 && !visited[i]) {
                depthFirstSearch(graph, i, visited);
            }
        }
    }
}
