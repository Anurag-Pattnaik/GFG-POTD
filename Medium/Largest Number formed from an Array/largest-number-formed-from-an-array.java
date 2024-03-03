//{ Driver Code Starts
//Initial Template for Java



import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            String[] arr = br.readLine().trim().split(" ");

            String ans = new Solution().printLargest(n, arr);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    String printLargest(int n, String[] arr) {
    Arrays.sort(arr, (a, b) -> {
            String combined1 = a + b;
            String combined2 = b + a;
            return combined2.compareTo(combined1);
        });

        // Concatenate the sorted array elements
        StringBuilder result = new StringBuilder();
        for (String str : arr) {
            result.append(str);
        }

        // Remove leading zeros (if any)
        while (result.length() > 1 && result.charAt(0) == '0') {
            result.deleteCharAt(0);
        }

        return result.toString();
    }
}