// Name : Chinmoy Das
// Date : 02/02/2024
// Problem :  Implement Atoi
// Difficulty level : Medium
// Problem Link : https://www.geeksforgeeks.org/problems/implement-atoi/1
class Solution {
    int atoi(String s) {
        boolean flag = false;
        int res = 0;
        if (s.charAt(0) == '-')
            flag = true;
        for (int i = 0; i < s.length(); i++) {
            int ch = (int) s.charAt(i);
            if (ch >= 48 && ch <= 57) {
                res = res * 10 + (ch - 48);
            } else if (flag && i == 0)
                continue;
            else
                return -1;
        }
        if (flag) {
            res = -res;
            return res;
        } else
            return res;
    }
}

// Thankyou❤️‍🩹❤️‍🩹