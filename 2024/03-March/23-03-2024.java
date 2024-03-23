
// Name : Chinmoy Das
// Date : 23/03/2024
// Problem : Fibonacci-series-up-to-nth-term
// Difficulty level : Easy
// Problem Link : https://www.geeksforgeeks.org/problems/fibonacci-series-up-to-nth-term/1

class Solution {

    int[] Series(int n) {
        // code here
        int mod = 1000000007;
        int ans[] = new int[n+1];
        ans[1] = 1;
        for(int i=2;i<=n;i++){
            ans[i] = ((ans[i-1]%mod) + (ans[i-2]%mod))%mod;
        }
        return ans;
    }
}

// Thankyou❤️‍🩹