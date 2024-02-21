
// Name : Chinmoy Das
// Date : 21/02/2024
// Problem : Boolean parenthesization
// Difficulty level : Hard
// Problem Link : https://www.geeksforgeeks.org/problems/boolean-parenthesization5610/1

class Solution {
    static int countWays(int N, String S) {
        int mod = 1003;
        int[][][] dp = new int[N][N][2];

        for (int gap = 0; gap < N; gap += 2) {
            for (int i = 0, j = gap; j < N; i += 2, j += 2) {
                for (int isTrue = 0; isTrue < 2; isTrue++) {
                    if (i == j) {
                        dp[i][j][isTrue] = (S.charAt(i) == 'T' && isTrue == 1) || (S.charAt(i) == 'F' && isTrue == 0)
                                ? 1
                                : 0;
                    } else {
                        for (int k = i + 1; k < j; k += 2) {
                            int lt = dp[i][k - 1][1];
                            int lf = dp[i][k - 1][0];
                            int rt = dp[k + 1][j][1];
                            int rf = dp[k + 1][j][0];

                            if (S.charAt(k) == '^') {
                                dp[i][j][isTrue] += (isTrue == 1 ? lt * rf + rt * lf : lt * rt + lf * rf);
                            } else if (S.charAt(k) == '&') {
                                dp[i][j][isTrue] += (isTrue == 1 ? lt * rt : lt * rf + rt * lf + lf * rf);
                            } else if (S.charAt(k) == '|') {
                                dp[i][j][isTrue] += (isTrue == 1 ? lt * rf + rt * lf + lt * rt : lf * rf);
                            }

                            dp[i][j][isTrue] %= mod;
                        }
                    }
                }
            }
        }

        return dp[0][N - 1][1];
    }
}

// Thankyou❤️‍🩹