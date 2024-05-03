// SOLVED IN GEEKS FOR GEEKS
// PROBLEM NAME : Thief trying to escape

//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
import java.lang.*;

class helpEscape{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            String a[] = in.readLine().trim().split("\\s+");
            int X = Integer.parseInt(a[0]);
            int Y = Integer.parseInt(a[1]);
            int N = Integer.parseInt(a[2]);
            String a1[] = in.readLine().trim().split("\\s+");
            int[] arr = new int[N];
            for(int i = 0;i < N;i++)
                arr[i] = Integer.parseInt(a1[i]);
            
            Solution ob = new Solution();
            System.out.println(ob.totalJumps(X, Y, N, arr));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution{
    static int totalJumps(int X, int Y, int N, int arr[]) {
        int jc = 0;
        for (int i = 0; i < N; i++) {
            int remainingHeight = arr[i];
            while (remainingHeight > 0) {
                remainingHeight -= X;
                jc++;
                if (remainingHeight <= 0)
                    break;
                remainingHeight += Y; 
            }
        }
        return jc;
    }
}


/*

INPUT:
2
10 1 1
5
4 1 5
6 9 11 4 5
OUTOUT:
1
12

*/