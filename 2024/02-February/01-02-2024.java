// Name : Chinmoy Das
// Date : 01/02/2024
// Problem :  Panagram Checking
// Difficulty level : Easy
// Problem Link : https://www.geeksforgeeks.org/problems/pangram-checking-1587115620/1

import java.util.*;

class Solution
{
    public static boolean checkPangram  (String s) {
        Map<Character,Boolean> map = new HashMap<>();
        
        int n = s.length();
        s = s.toLowerCase();
        
        for(int i=0;i<n;i++){
            char c = s.charAt(i);
            if(Character.isLetter(c)){
                map.put(c,true);
            }
        }
        return map.size() == 26;
    }
}

// Thankyou❤️‍🩹❤️‍🩹