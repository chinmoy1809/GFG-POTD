
// Name : Chinmoy Das
// Date : 23/02/2024
// Problem : Buy-and-sell-a-share-at-most-twice
// Difficulty level : Medium
// Problem Link : https://www.geeksforgeeks.org/problems/buy-and-sell-a-share-at-most-twice/1


class Solution {
    public static int maxProfit(int n, int[] price) {
        // code here
        int buy1 = Integer.MIN_VALUE;
        int buy2 = Integer.MIN_VALUE;
        int sell1 = 0;
        int sell2 = 0;
        for(int pri : price){
            buy1 = Math.max(buy1 ,-pri);
            sell1 = Math.max(sell1,buy1 + pri);
            buy2 = Math.max(buy2 ,sell1 - pri);
            sell2 = Math.max(sell2,buy2 + pri);
        }
        return sell2;
    }
}

// Thankyou❤️‍🩹