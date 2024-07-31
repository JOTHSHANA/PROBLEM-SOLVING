// SOLVED IN GEEKS FOR GEEKS
// PROBLEM NAME : Doctors Clinic

//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
import java.lang.*;

class doctorsClinic{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0){
            String arr[] = read.readLine().trim().split("\\s+");
            int N = Integer.parseInt(arr[0]);
            int X = Integer.parseInt(arr[1]);

            Solution ob = new Solution();
            System.out.println(ob.waitingTime(N, X));
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution{
    static int waitingTime(int N, int X){
        int arrTimeOfLast = N*X - X;
        int othersCheckupTime = (N-1) * 10;
        int res = othersCheckupTime - arrTimeOfLast;
        if(res <= 0){
            return 0;
        }
        return res;
    }
}


/*

INPUT:
2
4 5
3 10
OUTPUT:
15
0

*/