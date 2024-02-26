
// Name : Chinmoy Das
// Date : 26/02/2024
// Problem : Power Set
// Difficulty level : Medium
// Problem Link : https://www.geeksforgeeks.org/problems/power-set4302/1
import java.util.*;

class Solution {
    public void solve(String s, int idx, String temp, List<String> ans) {
        if (idx == s.length()) {
            if (temp.length() != 0)
                ans.add(temp);
            return;
        }
        solve(s, idx + 1, temp, ans);
        solve(s, idx + 1, temp + s.charAt(idx), ans);
    }

    public List<String> AllPossibleStrings(String s) {
        // Code here
        List<String> ans = new ArrayList<>();
        solve(s, 0, "", ans);
        Collections.sort(ans);
        return ans;
    }
}

// Thankyou❤️‍🩹