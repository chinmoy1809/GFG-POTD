// Name : Chinmoy Das
// Date : 03/02/2024
// Problem :  Decimal equivalent of binary linked list
// Difficulty level : Easy
// Problem Link : https://www.geeksforgeeks.org/problems/decimal-equivalent-of-binary-linked-list/1

class Solution {
    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    long DecimalValue(Node head) {
        long mod = 1000000007;
        Node ptr = head;
        long ans = 0;
        if (ptr == null)
            return 0;
        while (ptr != null) {
            ans = (ans * 2 + ptr.data) % mod;
            ptr = ptr.next;
        }
        return ans % mod;
    }
}

// Thankyou❤️‍🩹❤️‍🩹
