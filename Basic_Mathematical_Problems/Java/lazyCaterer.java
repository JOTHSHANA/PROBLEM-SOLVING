// SOLVED IN GEEKS FOR GEEKS
// PROBLEM NAME : The Lazy Caterer's Problem

//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class lazyCaterer
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            Solution ob = new Solution();
            int ans = ob.maximum_Cuts(n);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int maximum_Cuts(int n)
    {
        return ((n*(n+1))/2)+1;
    }
}


/*

INPUT:
2
5
3
OUTPUT:
16
7

*/