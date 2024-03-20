
// Name : Chinmoy Das
// Date : 20/03/2024
// Problem : sum-of-the-longest-bloodline-of-a-tree
// Difficulty level : Medium
// Problem Link : https://www.geeksforgeeks.org/problems/sum-of-the-longest-bloodline-of-a-tree/1

class Node {
    int data;
    Node left, right;

    public Node(int data) {
        this.data = data;
    }
}

class Solution {

    int max, res;

    public void preorder(Node root, int sum, int height) {

        if (root == null) {
            if (max < height) {
                res = sum;
                max = height;
            } else if (max == height) {
                res = Math.max(res, sum);
            }
            return;
        }

        preorder(root.left, sum + root.data, height + 1);
        preorder(root.right, sum + root.data, height + 1);

    }

    public int sumOfLongRootToLeafPath(Node root) {

        max = 0;
        res = 0;
        preorder(root, 0, 1);
        return res;
    }
}

// Thankyou❤️‍🩹