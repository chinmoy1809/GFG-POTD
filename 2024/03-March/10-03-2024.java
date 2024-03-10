
// Name : Chinmoy Das
// Date : 10/03/2024
// Problem : Remove-all-duplicates-from-a-given-string
// Difficulty level : Easy
// Problem Link : https://www.geeksforgeeks.org/problems/remove-all-duplicates-from-a-given-string4321/1

class Solution {
    String removeDuplicates(String str) {
        String s1="";
        for(int i=0;i<str.length();i++)
        {
            if(s1.contains(String.valueOf(str.charAt(i)))==true)
            continue;
            else
            s1+=str.charAt(i);
        }
        return s1;
    }
}
// Thankyou❤️‍🩹