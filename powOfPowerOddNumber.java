// SOLVED IN GEEKS FOR GEEKS
// PROBLEM NAME : Power of Pow | Odd Numbers

//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class powOfPowerOddNumber
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            long n = Long.parseLong(br.readLine().trim());            
            Solution ob = new Solution();
            long ans = ob.sum_of_square_oddNumbers(n);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public long sum_of_square_oddNumbers(long n)
    {
        long ans = 0;
        for(int i = 1; i <= (n*2)-1; i = i+2){
            ans = ans + i*i;
        }
        return ans;
    }
}

/*

INPUT:
2
2
3
OUTPUT:
10
35

*/