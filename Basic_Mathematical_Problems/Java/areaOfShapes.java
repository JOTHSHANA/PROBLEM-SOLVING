// SOLVED IN GEEKS FOR GEEKS
// PROBLEM NAME : Area of Rectangle, Right Angled Triangle and Circle

//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class areaOfShapes {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S[] = read.readLine().split(" ");
            int L = Integer.parseInt(S[0]);
            int W = Integer.parseInt(S[1]);
            int B = Integer.parseInt(S[2]);
            int H = Integer.parseInt(S[3]);
            int R = Integer.parseInt(S[4]);

            Solution ob = new Solution();
            int[] ptr = ob.getAreas(L,W,B,H,R);
            
            System.out.print(ptr[0]);
            System.out.print(" ");
            System.out.print(ptr[1]);
            System.out.print(" ");
            System.out.println(ptr[2]);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static int[] getAreas(int L , int W , int B , int H , int R) {
        int[] arr = new int[3];
        int AR = L*W;
        int AT = (int)(0.5 *B*H);
        int AC = (int)(03.14*(R*R));
        arr[0] = AR;
        arr[1] = AT;
        arr[2] =AC;
        return arr;
    }
};


/*

INPUT:
2
32 32 54 12 52
2 2 4 8 4
OUTPUT:
1024 324 8490
4 16 50
*/