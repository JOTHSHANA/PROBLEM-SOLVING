// SOLVED IN GEEKS FOR GEEKS
// PROBLEM NAME : Prime Number

//{ Driver Code Starts
import java.io.*;
import java.util.*;

class primeNumber
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.isPrime(N));
        }
    }
}
// } Driver Code Ends


class Solution{
    static int isPrime(int N){
        if(N== 0 || N == 1){
            return 0;
        }
        if(N == 2){
            return 1;
        }
        if (N % 2 == 0) {
            return 0;
        }
        for(int i = 3; i*i<=N; i = i+2){
            if(N%i == 0){
                return 0;
            }
        }
        return 1;
    }
}


/*

INPUT:
2
5
25
OUTPUT:
1
0

*/