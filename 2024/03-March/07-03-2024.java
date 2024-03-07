
// Name : Chinmoy Das
// Date : 07/03/2024
// Problem : Longest-repeating-and-non-overlapping-substring
// Difficulty level : Hard
// Problem Link : https://www.geeksforgeeks.org/problems/longest-repeating-and-non-overlapping-substring3421/1

class Solution {
    static String longestSubstring(String s, int n) {
        // code here
        String res = "";
        int i=0, j=0;
        while(j < n && i < n) {
            String str = s.substring(i, j+1);
            if(s.substring(j+1, n).indexOf(str) != -1) 
                res = res.length() < (j-i+1) ? str : res;
            else
                i++;
            j++;
        }
        return res == "" ? "-1" : res;
    }
};

// Thankyou❤️‍🩹