// Name : Chinmoy Das
// Date : 15/02/2024
// Problem : Count all possible paths
// Difficulty level : Medium
// Problem Link : https://www.geeksforgeeks.org/problems/castle-run3644/1

class Solution
{
    public int isPossible(int[][] paths)
    {
        // Code here
        for(int i=0;i<paths.length;i++){
            int c=0;
            for(int j=0;j<paths.length;j++){
                if(paths[i][j]==1)c++;
            }
            if(c%2==1)return 0;
        }
        return 1;
    }
}

// Thankyou❤️‍🩹