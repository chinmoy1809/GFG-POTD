
// Name : Chinmoy Das
// Date : 21/03/2024
// Problem : Zigzag-tree-traversal
// Difficulty level : Medium
// Problem Link : https://www.geeksforgeeks.org/problems/zigzag-tree-traversal/1

import java.util.*;

class Node {
    int data;
    Node left, right;

    Node(int d) {
        data = d;
        left = right = null;
    }
}

class GFG {
    // Function to store the zig zag order traversal of tree in a list.
    ArrayList<Integer> zigZagTraversal(Node root) {
        // Add your code here.
        Queue<Node> q = new ArrayDeque<>();
        ArrayList<Integer> ans = new ArrayList<>();

        q.add(root);
        int level = 0;

        while (!q.isEmpty()) {
            int cnt = q.size();
            ArrayList<Integer> list = new ArrayList<>();

            while (cnt > 0) {
                Node node = q.remove();
                list.add(node.data);

                if (node.left != null)
                    q.add(node.left);
                if (node.right != null)
                    q.add(node.right);

                cnt--;
            }

            if (level % 2 == 1) {
                for (int i = list.size() - 1; i >= 0; i--)
                    ans.add(list.get(i));

            } else {
                for (int i = 0; i < list.size(); i++)
                    ans.add(list.get(i));

            }

            level++;
        }

        return ans;
    }
}

// Thankyou❤️‍🩹