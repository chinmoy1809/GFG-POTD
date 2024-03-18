
// Name : Chinmoy Das
// Date : 18/03/2024
// Problem : Level-order-traversal
// Difficulty level : Easy
// Problem Link : https://www.geeksforgeeks.org/problems/level-order-traversal/1

import java.util.*;

class Node {
    int data;
    Node left, right;

    Node(int item) {
        data = item;
        left = right = null;
    }
}

class Solution {
    // Function to return the level order traversal of a tree.
    static ArrayList<Integer> levelOrder(Node root) {
        // Your code here
        Queue<Node> q = new LinkedList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        q.add(root);

        while (!q.isEmpty()) {
            Node val = q.poll();
            ans.add(val.data);
            if (val.left != null) {
                q.add(val.left);
            }
            if (val.right != null) {
                q.add(val.right);
            }
        }
        return ans;
    }
}
// Thankyou❤️‍🩹