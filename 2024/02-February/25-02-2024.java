
// Name : Chinmoy Das
// Date : 25/02/2024
// Problem : Reach-a-given-score
// Difficulty level : Easy
// Problem Link : https://www.geeksforgeeks.org/problems/reach-a-given-score-1587115621/1

class Geeks {
    public long count(int n) {
        // Add your code here.
        long[] dp = new long[n + 1];
        dp[0] = 1;
        int[] moves = { 3, 5, 10 };
        for (int move : moves) {
            for (int i = move; i <= n; i++) {
                dp[i] += dp[i - move];
            }
        }
        return dp[n];
    }
}

// Thankyou❤️‍🩹