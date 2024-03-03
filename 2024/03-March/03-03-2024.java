
// Name : Chinmoy Das
// Date : 03/03/2024
// Problem : Largest-number-formed-from-an-array
// Difficulty level : Medium
// Problem Link : https://www.geeksforgeeks.org/problems/largest-number-formed-from-an-array1117/1

import java.util.*;

class Solution {
    String printLargest(int n, String[] arr) {

        Comparator<String> com = new Comparator<String>() {
            public int compare(String a, String b) {
                String s1 = a + b;
                String s2 = b + a;

                return s2.compareTo(s1);
            }
        };

        Arrays.sort(arr, com);

        StringBuilder result = new StringBuilder();
        for (String s : arr) {
            result.append(s);
        }
        return result.toString();
    }
}

// Thankyou❤️‍🩹