
// Name : Chinmoy Das
// Date : 11/03/2024
// Problem : Count-pairs-sum-in-matrices
// Difficulty level : Easy
// Problem Link : https://www.geeksforgeeks.org/problems/count-pairs-sum-in-matrices4332/1

class Solution {
    int countPairs(int m1[][], int m2[][], int n, int x) {
        // code here
        int []a = new int[100001];
        for(int i=0; i<n*n; i++)
            a[m1[i/n][i%n]]++;
        int ret = 0;
        for(int i=0; i<n*n; i++)
            ret += a[Math.max(x - m2[i/n][i%n], 0)];
        return ret;
    }
}

// Thankyou❤️‍🩹