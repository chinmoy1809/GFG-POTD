
// Name : Chinmoy Das
// Date : 13/03/2024
// Problem : Print-matrix-in-diagonal-pattern
// Difficulty level : Easy
// Problem Link : https://www.geeksforgeeks.org/problems/print-matrix-in-diagonal-pattern/1

class Solution {
    public int[] matrixDiagonally(int[][] mat) {
        int n = mat.length;
        int[] res = new int[n*n];
        boolean flag = false;
        int j = 0;
        for(int row=0; row<n; row++){
            int r = row, c = 0;
            int[] temp = new int[r-c+1];
            int i = 0;
            while(r>=0 && c<n){
                temp[i++] = mat[r--][c++]; 
            }
            if(flag){
                reverse(temp);
                flag = false;
            }
            else flag = true;
            for(int k=0; k<temp.length; k++,j++){
                res[j] = temp[k];
            }
        }
        for(int col=1; col<n; col++){
            int r = n-1, c = col;
            int[] temp = new int[r-c+1];
            int i = 0;
            while(r>=0 && c<n){
                temp[i++] = mat[r--][c++]; 
            }
            if(flag){
                reverse(temp);
                flag = false;
            }
            else flag = true;
            for(int k=0; k<temp.length; k++,j++){
                res[j] = temp[k];
            }
        }
        return res;
    }
    
    private void reverse(int[] arr){
        int s = 0;
        int e = arr.length-1;
        while(s<e){
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
    }
}



// Thankyou❤️‍🩹