//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            ArrayList<String> result = ob.NBitBinary(n);
            for(String value  : result){
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution 
{
 ArrayList<String> NBitBinary(int N)
{
  ArrayList<String> result = new ArrayList<>();
  helper(N, "", result, 0, 0);
  return result;
}

private static void helper(int N, String current, ArrayList<String> result, int ones, int zeros) {
  if (current.length() == N) {
    result.add(current);
    return;
  }

  // If adding 1 maintains the condition (more or equal 1s than 0s)
  if (ones >= zeros) {
    helper(N, current + "1", result, ones + 1, zeros);
  }

  // Explore adding 0 as well (only if ones are greater than zeros)
  if (ones > zeros) {
    helper(N, current + "0", result, ones, zeros + 1);
  }
}
}