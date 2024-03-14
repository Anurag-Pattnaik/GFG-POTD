//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            char A[][] = new char[N][N];
            for (int i = 0; i < N; i++) {
                String S[] = read.readLine().trim().split(" ");
                for (int j = 0; j < N; j++) A[i][j] = S[j].charAt(0);
            }
            Solution ob = new Solution();
            System.out.println(ob.largestSubsquare(N, A));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Pair {
    public int x, y;
    public Pair(int a, int b) {
        this.x = a;
        this.y = b;
    }
}

class Solution {
    int largestSubsquare(int n, char a[][]) {
        Pair dp[][] = new Pair[n][n]; 
        
        for(int i = 0; i < n; i++)
            for(int j = 0; j < n; j++)
                dp[i][j] = new Pair(0, 0);
        
        for(int i = 0; i < n; i++) {
            int x = 0;
            for(int j = 0; j < n; j++) {
                if(a[i][j] == 'X')
                    x++;
                else
                    x = 0;
                
                dp[i][j].x = x;
            }
        }
        
        for(int i = 0; i < n; i++) {
            int x = 0;
            for(int j = 0; j < n; j++) {
                if(a[j][i] == 'X')
                    x++;
                else
                    x = 0;
                
                dp[j][i].y = x;
            }
        }
        
        int maxi = 0;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                int mini = Math.min(dp[i][j].x, dp[i][j].y);
                
                while(mini > 0) {
                    int x = j - mini + 1, y = i - mini + 1;
                        
                    if(x >= 0 && x < n && y >= 0 && y < n) {
                        if(dp[i][x].y >= mini && dp[y][j].x >= mini) {
                            maxi = Math.max(maxi, mini); 
                            break;
                        }
                    }
                    
                    mini--;
                }
            }
        }
        
        return maxi;
    }
};