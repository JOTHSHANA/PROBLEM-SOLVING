// SOLVED IN GEEKS FOR GEEKS
// PROBLEM NAME : Reverse Digits

//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class reverseDigits
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            long n = Long.parseLong(br.readLine().trim());            
            Solution ob = new Solution();
            long ans = ob.reverse_digit(n);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public long reverse_digit(long n)
    {
        long reversedNumber = 0;
        while(n != 0){
            long digit = n%10;
            reversedNumber = reversedNumber * 10 + digit;
            n = n / 10;
        }
        return reversedNumber;
    }
}


//input format:

//2
//10400
//54321