// SOLVED IN GEEKS FOR GEEKS
// PROBLEM NAME : Print the Kth Digit

//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class kthDigit
{
    public static void main(String args[])throws IOException
    {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0)
        {
            int A = in.nextInt();
            int B = in.nextInt();
            int K = in.nextInt();
            Solution ob = new Solution();
            System.out.println(ob.kthDigit(A,B,K));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static long kthDigit(int A,int B,int K){
        long ans = (long)Math.pow(A, B);
        
        int digitCount = 0;
        long digit;
        while(ans!= 0){
            digit = ans%10;
            digitCount++;
            if(digitCount == K){
                return digit;
            }
            
            ans = ans / 10;
        }
        return -1;
    }
}



/*

INPUT:
2
3 3 1
5 2 2
OUTPUT:
7
2

*/