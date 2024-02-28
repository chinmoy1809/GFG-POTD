
// Name : Chinmoy Das
// Date : 28/02/2024
// Problem : Check-if-a-number-is-divisible-by-8
// Difficulty level : Easy
// Problem Link : https://www.geeksforgeeks.org/problems/check-if-a-number-is-divisible-by-83957/1

class Solution {
    int DivisibleByEight(String s) {
        // code here
        if (s.length() > 3)
            s = s.substring(s.length() - 3, s.length());
        return Integer.parseInt(s) % 8 == 0 ? 1 : -1;
    }
}

// Thankyou❤️‍🩹