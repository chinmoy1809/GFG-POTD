
// Name : Chinmoy Das
// Date : 29/02/2024
// Problem : Sum-of-bit-differences
// Difficulty level : Medium
// Problem Link : https://www.geeksforgeeks.org/problems/sum-of-bit-differences2937/1

class Solution {
    long sumBitDifferences(int[] arr, int n) {
        // code here
        long ans = 0;
        for(int i=31;i>=0;i--){
            long count = 0;
            for(int j=0;j<n;j++){
                if((arr[j] & (1<<i))!=0)
                count++;
            }
            ans += 2*count*(n-count);
        }
        return ans;
    }
}

// Thankyou❤️‍🩹