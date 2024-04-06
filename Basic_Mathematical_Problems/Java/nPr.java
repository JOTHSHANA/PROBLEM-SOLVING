// SOLVED IN GEEKS FOR GEEKS
// PROBLEM NAME : nPr

//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class nPr{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            String a[] = in.readLine().trim().split("\\s+");
            Long n = Long.parseLong(a[0]);
            Long r = Long.parseLong(a[1]);
            
            Solution ob = new Solution();
            System.out.println(ob.nPr(n, r));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static long nPr(long n, long r){
        long ans = factorial(n)/factorial(n-r);
        return ans;
    }
    
    static long factorial(long num){
        if(num <= 1){
            return 1;
        }else{
            return num*factorial(num-1);
        }
        
    }
}


/*

INPUT:
2
2 1
3 3
OUTPUT:
2
6

 */