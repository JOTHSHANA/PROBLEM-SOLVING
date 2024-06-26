// SOLVED IN GEEKS FOR GEEKS
// PROBLEM NAME : Small Factorial

//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class smallFactorial
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            Solution ob = new Solution();
            long ans = ob.find_fact(n);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public long find_fact(int n)
    {
        if(n == 0 || n == 1){
            return 1;
        }
        return n*(find_fact(n-1));
    }
}


/*

INPUT:
1
5
OUTPUT:
120

*/