
// Name : Chinmoy Das
// Date : 16/03/2024
// Problem : Delete-without-head-pointer
// Difficulty level : Easy
// Problem Link :https://www.geeksforgeeks.org/problems/delete-without-head-pointer/1

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

// Function to delete a node without any reference to head pointer.
class Solution {
    void deleteNode(Node del_node) {
        // Your code here
        del_node.data = del_node.next.data;
        del_node.next = del_node.next.next;
    }
}

// Thankyou❤️‍🩹