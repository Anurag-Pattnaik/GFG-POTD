//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Main {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            Solution obj = new Solution();
            int ans[] = obj.Series(n);
            for (int i : ans) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


class Solution {

    //int[] Series(int n)


    private static final int MOD = 1000000007;
    
    // Method to calculate Fibonacci series up to n-th term
    public static int[] Series(int n) {
        // Edge cases handling: When n is 0, we return an array with the first term of the Fibonacci series
        if (n == 0) {
            return new int[]{0};
        }
        
        // When n is 1, we return an array with the first two terms of the Fibonacci series, considering 0-based indexing
        else if (n == 1) {
            return new int[]{0, 1};
        }
        
        // Main logic for n > 1
        else {
            int[] series = new int[n+1];
            // Initializing the first two terms
            series[0] = 0;
            series[1] = 1;
            
            // Loop to fill the array with Fibonacci series terms using the formula
            for (int i = 2; i <= n; i++) {
                series[i] = (series[i - 1] + series[i - 2]) % MOD; // Calculate each term as the sum of the previous two terms modulo 10^9+7
            }
            
            // Return the complete series up to n-th term
            return series;
        }
    }
}