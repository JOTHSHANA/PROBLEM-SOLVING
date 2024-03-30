// SOLVED IN GEEKS FOR GEEKS
// PROBLEM NAME : Power of Pow | Even Number

//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class powOfPowerEvenNumber
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            long n = Long.parseLong(br.readLine().trim());            
            Solution ob = new Solution();
            long ans = ob.sum_of_square_evenNumbers(n);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public long sum_of_square_evenNumbers(long n)
    {
        long sum = 0;
        for(int i = 2; i <= n*2; i = i + 2){
            sum = sum + (i * i);
        }
        return sum;
    }
}