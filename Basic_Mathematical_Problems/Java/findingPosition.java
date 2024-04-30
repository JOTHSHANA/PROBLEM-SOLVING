// SOLVED IN GEEKS FOR GEEKS
// PROBLEM NAME : Finding Position

//{ Driver Code Starts
//Initial Template for Java
import java.util.*;
import java.io.*;
class findingPosition {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            long n = Integer.parseInt(read.readLine());
            Solution ob = new Solution();

            System.out.println(ob.nthPosition(n));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution {
    static long nthPosition(long n){
        int i=1;
        int prev=0;
        while(n>i)
        {
            prev=i;
            i=i*2;
        }
        if(i==n)
        {
            return i;
        }
        return prev;
    }
}





/*

INPUT:
2
5
9
OUTPUT:
4
8

*/

