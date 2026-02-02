package com.searching;

import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearch {
    public static void main(String[] args) {
        int[][] graph = {
                { 0, 1, 1, 0, 0 },
                { 1, 0, 0, 1, 1 },
                { 1, 0, 0, 0, 1 },
                { 0, 1, 0, 0, 1 },
                { 0, 1, 1, 1, 0 }
        };
        int startNode = 0;
        System.out.println("Breadth-First Search starting from node " + startNode + ":");
        breadthFirstSearch(graph, startNode);
    }

    public static void breadthFirstSearch(int[][] graph, int startNode) {
        boolean[] visited = new boolean[graph.length];
        Queue<Integer> queue = new LinkedList<>();

        visited[startNode] = true;
        queue.add(startNode);

        while (!queue.isEmpty()) {
            int node = queue.poll();
            System.out.print(node + " ");

            for (int i = 0; i < graph[node].length; i++) {
                if (graph[node][i] == 1 && !visited[i]) {
                    visited[i] = true;
                    queue.add(i);
                }
            }
        }
    }
}
