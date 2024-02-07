// Name : Chinmoy Das
// Date : 07/02/2024
// Problem : Min distance between two given nodes of a binary tree
// Difficulty level : Medium
// Problem Link : https://www.geeksforgeeks.org/problems/min-distance-between-two-given-nodes-of-a-binary-tree/1

class GfG {
    Node lca(Node root, int n1, int n2) {
        if (root == null) {
            return null;
        }
        if (root.data == n1 || root.data == n2) {
            return root;
        }
        Node left = lca(root.left, n1, n2);
        Node right = lca(root.right, n1, n2);

        if (right == null) {
            return left;
        }

        if (left == null) {
            return right;
        }
        return root;
    }

    int lcaDist(Node root, int n) {
        if (root == null) {
            return -1;
        }
        if (root.data == n) {
            return 0;
        }
        int left = lcaDist(root.left, n);
        int right = lcaDist(root.right, n);
        if (left == -1 && right == -1) {
            return -1;
        } else if (left == -1) {
            return right + 1;
        } else {
            return left + 1;
        }
    }

    int findDist(Node root, int a, int b) {
        // Your code here
        Node lca = lca(root, a, b);
        int dist1 = lcaDist(lca, a);
        int dist2 = lcaDist(lca, b);
        return dist1 + dist2;
    }
}

// Thankyou❤️‍🩹
