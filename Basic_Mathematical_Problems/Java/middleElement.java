// SOLVED IN GEEKS FOR GEEKS
// PROBLEM NAME : Middle of Three

//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class middleElement {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String[] S = read.readLine().split(" ");
            int A=Integer.parseInt(S[0]);
            int B=Integer.parseInt(S[1]);
            int C=Integer.parseInt(S[2]);
            Solution ob = new Solution();
            System.out.println(ob.middle(A,B,C));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    int middle(int A, int B, int C){
        int[] arr = new int[]{A, B, C};
        Arrays.sort(arr);
        return arr[1];
    }
}

/*

INPUT:
2
324 456 643
764 855 643
OUTPUT:
456
764

*/