
// Name : Chinmoy Das
// Date : 24/02/2024
// Problem : Maximum-sum-problem
// Difficulty level : Easy
// Problem Link : https://www.geeksforgeeks.org/problems/maximum-sum-problem2211/1

class Solution {
    public int maxSum(int n) {
        // code here.
        if (n == 0 || n == 1)
            return n;

        return Math.max((maxSum(n / 2) + maxSum(n / 3) + maxSum(n / 4)), n);
    }
}

// Thankyou❤️‍🩹