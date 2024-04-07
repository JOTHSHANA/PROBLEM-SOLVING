// SOLVED IN GEEKS FOR GEEKS
// PROBLEM NAME : Cube root of a numbe

//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class cubeRoot {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());

            Solution ob = new Solution();
            System.out.println(ob.cubeRoot(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static int cubeRoot(int N) {
         return (int) Math.cbrt(N);
    }
};


/*

INPUT:
2
3
8
OUTPUT:
1
2

*/
