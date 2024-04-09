// SOLVED IN GEEKS FOR GEEKS
// PROBLEM NAME : Automorphic Number

//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class automorphic
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            Solution ob = new Solution();
            String ans = ob.is_AutomorphicNumber(n);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public String is_AutomorphicNumber(int n)
    {
        int Square = n*n;
        int SqLast = Square%10;
        if(n%10 == SqLast){
            return "Automorphic";
        }
        else{
            return "Not Automorphic";
        }
    }
}


/*

INPUT:
2
76
14
OUTPUT:
Automorphic
Not Automorphic

*/