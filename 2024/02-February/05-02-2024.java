// Name : Chinmoy Das
// Date : 05/02/2024
// Problem : Sorted insert for circular linked list
// Difficulty level : Easy
// Problem Link : https://www.geeksforgeeks.org/problems/sorted-insert-for-circular-linked-list/1

class Solution {
    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public Node sortedInsert(Node head, int data) {
        // code here
        Node newnode = new Node(data);
        // if circular linked list is empty
        if (head == null) {
            // point it to itself
            newnode.next = newnode;
            return newnode;
        }
        // insert at beginning
        if (head.data >= data) {
            newnode.next = head;
            Node temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newnode;
            return newnode;
        }
        // insert at a position in between or end
        else {
            Node temp = head;
            while (temp.next != head && temp.next.data < data) {
                temp = temp.next;
            }
            newnode.next = temp.next;
            temp.next = newnode;
            return head;
        }
    }
}

// Thankyou❤️‍🩹