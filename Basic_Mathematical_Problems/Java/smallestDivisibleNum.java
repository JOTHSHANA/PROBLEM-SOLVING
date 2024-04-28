// SOLVED IN GEEKS FOR GEEKS
// PROBLEM NAME : Smallest divisible number

//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

public class smallestDivisibleNum {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            Solution g=new Solution();
            System.out.println(g.getSmallestDivNum(n));
        }
    }
}


// } Driver Code Ends


//User function Template for Java

class Solution {
    static long gcd( long a, long b){
        if (b == 0)
        return a;
        return gcd(b, a % b);
    }
    public static long getSmallestDivNum(int n){
       
        long res=1;
        for(int i =2; i<=n; i++)
        {
        res = (res*i)/gcd(res,i);

        }

        return res;
    }
}


/*

INPUT:
2
3
6
OUTPUT:
6
60


*/