
// Name : Chinmoy Das
// Date : 04/03/2024
// Problem : Need-some-change
// Difficulty level : Easy
// Problem Link : https://www.geeksforgeeks.org/problems/need-some-change/1

class Solution
{
    public void swapElements(int[] arr, int n)
    {
        // Code here
        for(int i=0;i<n;i++){
            if(i+2 >= n) break;
            else {
                int temp = arr[i];
                arr[i] = arr[i+2];
                arr[i+2] = temp;
            }
            
        }
    }
}

// Thankyou❤️‍🩹