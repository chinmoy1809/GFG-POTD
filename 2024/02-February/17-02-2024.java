// Name : Chinmoy Das
// Date : 17/02/2024
// Problem : Does-array-represent-heap
// Difficulty level : Easy
// Problem Link : https://www.geeksforgeeks.org/problems/does-array-represent-heap4345/1

class Solution {
    
    public boolean countSub(long arr[], long n)
    {
        // Your code goes here
        for(int i=0;i<n/2;i++){
            int c1 = 2*i+1;
            int c2 = 2*i+2;
            if((c1 < n && arr[i] < arr[c1]) || (c2 < n && arr[i] < arr[c2]) ) return false;
        }
        return true;
    }
}

// Thankyou❤️‍🩹
