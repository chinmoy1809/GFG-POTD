
// Name : Chinmoy Das
// Date : 15/03/2024
// Problem : Linked-list-that-is-sorted-alternatingly
// Difficulty level : Medium
// Problem Link : https://www.geeksforgeeks.org/problems/linked-list-that-is-sorted-alternatingly/1

import java.util.*;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Solution {
    public Node sort(Node head) {
        // your code here, return the head of the sorted list
        ArrayList<Integer> list = new ArrayList<>();
        for (Node temp = head; temp != null; temp = temp.next) {
            list.add(temp.data);
        }
        Collections.sort(list);
        Node temp = head;
        for (int n : list) {
            temp.data = n;
            temp = temp.next;
        }
        return head;
    }
}

// Thankyou❤️‍🩹