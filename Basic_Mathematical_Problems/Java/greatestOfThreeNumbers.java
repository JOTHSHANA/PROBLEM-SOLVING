// SOLVED IN GEEKS FOR GEEKS
// PROBLEM NAME : Greatest of three numbers

//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class greatestOfThreeNumbers {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String[] S = read.readLine().split(" ");
            int A = Integer.parseInt(S[0]);
            int B = Integer.parseInt(S[1]);
            int C = Integer.parseInt(S[2]);
            Solution ob = new Solution();
            System.out.println(ob.greatestOfThree(A, B, C));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    int greatestOfThree(int A, int B, int C) {
        if(A>B && A>C){
            return A;
        }
        else{
            if(B>C){
                return B;
            }
            else{
                return C;
            }
        }
    }
}

/*

INPUT:
2               ----->num of testcases
27 30 21
18 23 27
OUTPUT:
30
27

 */

