//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String s = br.readLine().trim();
            Solution ob = new Solution();
            List<String> ans = ob.AllPossibleStrings(s);
            for(String i: ans)
                System.out.print(i + " ");
            System.out.println();
            
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public static List<String> AllPossibleStrings(String s) {
      List<String> subsequences = new ArrayList<>();
        generateSubsequences(s, "", subsequences, 0);
        Collections.sort(subsequences);
        return subsequences;
    }

    private static void generateSubsequences(String s, String current, List<String> subsequences, int index) {
        if (index == s.length()) {
            // Base case: if we reach the end of the string, add the current subsequence (if not empty)
            if (!current.isEmpty()) {
                subsequences.add(current);
            }
            return;
        }

        // Include the current character
        generateSubsequences(s, current + s.charAt(index), subsequences, index + 1);

        // Exclude the current character (continue building the sequence without including it)
        generateSubsequences(s, current, subsequences, index + 1);
    }
}