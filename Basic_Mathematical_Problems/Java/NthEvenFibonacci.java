// SOLVED IN GEEKS FOR GEEKS
// PROBLEM NAME : Nth Even Fibonacci Number

//{ Driver Code Starts
//Initial Template for Java
import java.util.*;
import java.io.*;
class nthEvenFibonacci {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            long n = Integer.parseInt(read.readLine());
            Solution ob = new Solution();

            System.out.println(ob.nthEvenFibonacci(n));
        }
    }
}
// } Driver Code Ends


class Solution {
   static long nthEvenFibonacci(long n){
       // code here
       long N=3*n;
       return solution(N);
   }
   public static long solution(long N)
   {
       long a=1,b=0,c=0;
       for(long i=1;i<=N;i++)
         {
             c=(a+b)%1000000007;
             a=b;
             b=c;
         }
         
         return b%1000000007;
   }
}