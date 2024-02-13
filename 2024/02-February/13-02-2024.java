// Name : Chinmoy Das
// Date : 13/02/2024
// Problem : Clone-graph
// Difficulty level : Mediam
// Problem Link : https://www.geeksforgeeks.org/problems/clone-graph/1

import java.util.*;

class Node {
    int val;
    ArrayList<Node> neighbors;

    public Node() {
        val = 0;
        neighbors = new ArrayList<>();
    }

    public Node(int val) {
        this.val = val;
        neighbors = new ArrayList<>();
    }

    public Node(int val, ArrayList<Node> neighbors) {
        this.val = val;
        this.neighbors = neighbors;
    }
}

class Solution {
    public static void addEdges(HashMap<Node, Node> map) {
        for (Map.Entry m : map.entrySet()) {
            Node ori = (Node) m.getKey();
            map.get(m.getKey()).neighbors.add(ori);
        }
    }

    public static void dfs(Node start, HashSet<Node> visited, HashMap<Node, Node> map) {

        visited.add(start);
        Node copyNode = new Node(start.val);
        map.put(start, copyNode);
        for (Node p : start.neighbors) {
            if (!visited.contains(p)) {
                dfs(p, visited, map);
            }
        }
    }

    Node cloneGraph(Node node) {
        Node start = node;
        HashSet<Node> visited = new HashSet<>();
        HashMap<Node, Node> map = new HashMap<>();
        dfs(start, visited, map);

        addEdges(map);

        return map.get(start);
    }
}

// Thankyou❤️‍🩹