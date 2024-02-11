// Name : Chinmoy Das
// Date : 11/02/2024
// Problem : Recamans-sequence
// Difficulty level : Easy
// Problem Link : https://www.geeksforgeeks.org/problems/recamans-sequence4856/1
import java.util.*;

class Solution{
    static ArrayList<Integer> recamanSequence(int n){
        // code here 
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(0);
        if(n == 0) {
            return ans;
        }
        Set<Integer> ansSet = new HashSet<>();
        for(int i=1; i<n; i++) {
            int val = ans.get(i-1) - i;
            if(!(val > 0 && !ansSet.contains(val))) {
                val = ans.get(i-1) + i;
            }
            ansSet.add(val);
            ans.add(val);
        }
        return ans;
    }
}

// Thankyou❤️‍🩹