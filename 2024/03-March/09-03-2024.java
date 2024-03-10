
// Name : Chinmoy Das
// Date : 09/03/2024
// Problem : Find-the-n-th-character
// Difficulty level : medium
// Problem Link : https://www.geeksforgeeks.org/problems/find-the-n-th-character5925/1

class Solution {
    public char nthCharacter(String s, int r, int n) {
        // code here
        String tempString = "";

        while (r > 0) {
            tempString = "";
            for (int i = 0; i <= n; i++) {

                if (s.charAt(i) == '0') {
                    tempString += "01";
                } else {
                    tempString += "10";
                }
            }
            s = tempString;
            r--;
        }

        return s.charAt(n);
    }
}
// Thankyou❤️‍🩹