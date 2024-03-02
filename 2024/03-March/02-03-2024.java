
// Name : Chinmoy Das
// Date : 02/03/2024
// Problem : First-element-to-occur-k-times
// Difficulty level : Easy
// Problem Link : https://www.geeksforgeeks.org/problems/first-element-to-occur-k-times5150/1
import java.util.*;

class Solution
{
    public int firstElementKTime(int n, int k, int[] a) { 
        HashMap<Integer, Integer> mp = new HashMap<>();
        for(int i=0;i<n;i++){
            mp.put(a[i],mp.getOrDefault(a[i],0) + 1);
            if(mp.get(a[i]) == k){
                return a[i];
            }
        }
        return -1;
    } 
}
// Thankyou❤️‍🩹