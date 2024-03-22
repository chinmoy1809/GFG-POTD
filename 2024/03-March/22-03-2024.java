
// Name : Chinmoy Das
// Date : 22/03/2024
// Problem : Diagonal-sum-in-binary-tree
// Difficulty level : Medium
// Problem Link : https://www.geeksforgeeks.org/problems/diagonal-sum-in-binary-tree/1

import java.util.*;

class Node {
    int data;
    Node left, right;

    Node(int d) {
        data = d;
        left = right = null;
    }
}

class Tree {
    public static ArrayList<Integer> diagonalSum(Node root) {
        // code here.
        ArrayList<Integer> al = new ArrayList<>();

        Queue<Node> q = new LinkedList<>();

        q.offer(root);
        int c = 0;

        while (q.size() > 0) {
            int size = q.size();

            for (int i = 0; i < size; i++) {
                Node nn = q.poll();

                while (nn != null) {
                    if (nn.left != null)
                        q.offer(nn.left);

                    c += nn.data;
                    nn = nn.right;
                }
            }
            al.add(c);
            c = 0;
        }
        return al;
    }
}

// Thankyou❤️‍🩹