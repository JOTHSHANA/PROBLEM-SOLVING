// SOLVED IN GEEKS FOR GEEKS
// PROBLEM NAME : Count numbers containing 4

//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class numContainingFour {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());

            Solution ob = new Solution();
            System.out.println(ob.countNumberswith4(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static int countNumberswith4(int N) {
        int count = 0;
        for(int i = 3; i <= N; i++){
            String s = Integer.toString(i);
            if(s.contains("4")){
                count++;
            }
        }
        return count;
    }
};




/*

INPUT:
2
9
14
OUTPUT:
1
2

*/