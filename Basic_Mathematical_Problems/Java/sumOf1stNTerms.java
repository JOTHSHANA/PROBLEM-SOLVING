// SOLVED IN GEEKS FOR GEEKS
// PROBLEM NAME : Sum of first n terms

//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class sumOf1stNTerms {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.sumOfSeries(N));
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    long sumOfSeries(long n) {
        long sum = 0;
        for(int i = 1; i <= n; i++){
            sum += (long)Math.pow(i, 3);
        }
        
        return sum;
    }
}


/*

INPUT:
2
5
7
OUTPUT:
225
784

*/