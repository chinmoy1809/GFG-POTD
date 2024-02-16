// Name : Chinmoy Das
// Date : 16/02/2024
// Problem : Flatten-bst-to-sorted-list
// Difficulty level : Medium
// Problem Link : https://www.geeksforgeeks.org/problems/flatten-bst-to-sorted-list--111950/1

class Node{
    int data;
    Node left,right;
    Node(int d){
        data = d;
        left = right = null;
    }
}
class Solution {
    public Node flattenBST(Node root) {
        // Code here
        if (root == null || (root.left == null && root.right == null)) {
            return root;
        }
        Node l = flattenBST(root.left);
        Node r = flattenBST(root.right);
        root.left = null;
        root.right = r;
        if (l == null)
            return root;
        else {
            Node temp = l;
            while (temp.right != null)
                temp = temp.right;
            temp.right = root;
            root = l;
            return root;
        }
    }
}

// Thankyou❤️‍🩹