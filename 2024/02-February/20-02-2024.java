
// Name : Chinmoy Das
// Date : 20/02/2024
// Problem : Word break
// Difficulty level : Medium 
// Problem Link : https://www.geeksforgeeks.org/problems/word-break1352/1

import java.util.*;

class Solution {
    public static int wordBreak(String A, ArrayList<String> B) {
        // code here
        int n = A.length();
        HashSet<String> wordSet = new HashSet<>(B);
        boolean[] dp = new boolean[n + 1];
        dp[0] = true;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                if (dp[j] && wordSet.contains(A.substring(j, i))) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[n] ? 1 : 0;
    }
}

// Thankyou❤️‍🩹