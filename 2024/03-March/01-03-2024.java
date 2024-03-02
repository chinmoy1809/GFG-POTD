
// Name : Chinmoy Das
// Date : 01/03/2024
// Problem : Peak-element
// Difficulty level : medium
// Problem Link : https://www.geeksforgeeks.org/problems/peak-element/1

class Solution {
    // Function to find the peak element
    // arr[]: input array
    // n: size of array a[]
    public int peakElement(int[] arr, int n) {
        // add code here.
        int s = 0;
        int e = n - 1;
        while (s != e) {
            int mid = (s + e) / 2;
            if (arr[mid] < arr[mid + 1])
                s = mid + 1;
            else
                e = mid;
        }
        return s;
    }
}


// Thankyou❤️‍🩹