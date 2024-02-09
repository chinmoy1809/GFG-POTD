// Name : Chinmoy Das
// Date : 09/02/2024
// Problem : children-sum-parent
// Difficulty level : Medium
// Problem Link : https://www.geeksforgeeks.org/problems/children-sum-parent/1


class Solution {
    class Node {
        int data;
        Node left, right;

        public Node(int d) {
            data = d;
            left = right = null;
        }
    }
    public static int isSumProperty(Node root) {
        // add your code here
        if (root == null)
            return 1;
        if (root.left == null & root.right == null)
            return 1;
        int sum = 0;
        if (root.left != null)
            sum += root.left.data;
        if (root.right != null)
            sum += root.right.data;
        if (root.data == sum)
            return (isSumProperty(root.left) & isSumProperty(root.right));
        return 0;
    }
}

// Thankyou❤️‍🩹