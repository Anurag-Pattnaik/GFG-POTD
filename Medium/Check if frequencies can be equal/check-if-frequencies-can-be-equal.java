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
            
            String input[] = read.readLine().split(" ");
            String a = input[0];
            
            Solution ob = new Solution();
            if(ob.sameFreq(a)){
                System.out.println(1);
            }
            else{
                System.out.println(0);
            }
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    boolean sameFreq(String s) {
       // int[] freq = new int[26];
      int []charFreq = new int[26];
       for(char c:s.toCharArray())
        charFreq[c-'a']++;
        
        HashMap<Integer,Integer> freqCount = new HashMap<>();
        for(int freq:charFreq)
            if(freq!=0)
                freqCount.put(freq,freqCount.getOrDefault(freq,0)+1);
        
        if(freqCount.size()==1)
            return true;
        
        if(freqCount.size()==2){
            int lowFreq = Integer.MAX_VALUE;
            int highFreq = Integer.MIN_VALUE;
            for(int freq:freqCount.keySet()){
                lowFreq = Math.min(lowFreq,freq);
                highFreq = Math.max(highFreq,freq);
            }
            
            return (highFreq-lowFreq==1 && freqCount.get(highFreq)==1)
               || (lowFreq==1 && freqCount.get(lowFreq)==1);
        }
        return false;
    }
}
