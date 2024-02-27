
// Name : Chinmoy Das
// Date : 27/02/2024
// Problem : Play with OR
// Difficulty level : Easy
// Problem Link : https://www.geeksforgeeks.org/problems/play-with-or5515/1

class Solution{
    // Function for finding maximum and value pair
    public static int[] game_with_number (int arr[], int n) {
        // Complete the function
        for(int i=0;i<n-1;i++){
            arr[i] = (arr[i] | arr[i+1]);
        }
        return arr;
    }
}

// Thankyou❤️‍🩹