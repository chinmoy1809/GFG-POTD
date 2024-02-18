// Name : Chinmoy Das
// Date : 18/02/2024
// Problem : Sum-of-leaf-nodes-in-BST
// Difficulty level : Easy
// Problem Link : https://www.geeksforgeeks.org/problems/sum-of-leaf-nodes-in-bst/1

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        this.left = this.right = null;
    }
}

class Solution {
    public static int sumOfLeafNodes(Node root) {
        // code here
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return root.data;
        }
        return sumOfLeafNodes(root.left) + sumOfLeafNodes(root.right);
    }
}

// Thankyou❤️‍🩹