// SOLVED IN GEEKS FOR GEEKS
// PROBLEM NAME : Sum of AP series

//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class sumOfAPSeries
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String s = br.readLine();
            String[] S = s.split(" ");
            long n = Long.parseLong(S[0]);
            Long a = Long.parseLong(S[1]);
            Long d = Long.parseLong(S[2]);
            Solution ob = new Solution();
            Long ans = ob.sum_of_ap(n, a, d);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public long sum_of_ap(long n, long a, long d)
    {
        long curr = a;
        long sum = a;
        for(int i = 1; i < n; i++){
            curr += d;
            sum += curr;
        }
        return sum;
    }
}


/*

INPUT:
2   --------> num of test cases
5 1 3
3 1 2

OUTPUT:
35
9

 */