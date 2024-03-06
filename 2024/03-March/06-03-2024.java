
// Name : Chinmoy Das
// Date : 06/03/2024
// Problem : Search-pattern-rabin-karp-algorithm
// Difficulty level : Medium
// Problem Link : https://www.geeksforgeeks.org/problems/search-pattern-rabin-karp-algorithm--141631/1

import java.util.ArrayList;

class Solution {

    ArrayList<Integer> search(String pattern, String text) {
        // your code here
        ArrayList<Integer> list = new ArrayList<>();
        if (pattern.equals(text)) {
            list.add(1);
            return list;
        }

        int len = pattern.length();

        for (int i = 0; i <= text.length() - len; i++) {
            if (text.substring(i, i + len).equals(pattern)) {
                list.add(i + 1);
            }
        }

        return list;
    }
}

// Thankyou❤️‍🩹