
// Name : Chinmoy Das
// Date : 17/03/2024
// Problem : Count-pairs-whose-sum-is-equal-to-x
// Difficulty level : Easy
// Problem Link : https://www.geeksforgeeks.org/problems/count-pairs-whose-sum-is-equal-to-x/1

import java.util.*;

class Solution {
    public static int countPairs(LinkedList<Integer> head1, LinkedList<Integer> head2, int x) {
        // add your code here
        int count = 0;
        HashSet<Integer> temp = new HashSet<>(head1);
        for (Integer nums : head2) {
            if (temp.contains(x - nums)) {
                count++;
            }
        }
        return count;
    }
}

// Thankyou❤️‍🩹