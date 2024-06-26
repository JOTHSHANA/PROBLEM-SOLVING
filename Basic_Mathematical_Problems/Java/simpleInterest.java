// SOLVED IN GEEKS FOR GEEKS
// PROBLEM NAME : Simple Interest

//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class simpleInterest {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String[] S = read.readLine().split(" ");
            int P = Integer.parseInt(S[0]);
            int R = Integer.parseInt(S[1]);
            int T = Integer.parseInt(S[2]);
            Solution ob = new Solution();
            out.println(String.format("%.2f",ob.simpleInterest(P, R, T)));
        }
        out.flush();
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    double simpleInterest(int P, int R, int T) {
        double ans = (double)(P*R*T)/100;
        return ans;
    }
}


/*

INPUT:
2              -------->number of testcases
999 9 9
100 20 2
OUTPUT:
809.19
40.00

 */