// SOLVED IN GEEKS FOR GEEKS
// PROBLEM NAME : Number of divisors

//{ Driver Code Starts
import java.io.*;
import java.util.*;

class numberOfDivisors
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.count_divisors(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution{
    static long count_divisors(int N){
      int count = 0;
        for (int i = 1; i * i <= N; i++) {
            if (N % i == 0) {
                 
                if (i % 3 == 0) {
                    count++;
                }

                 
                if (i != N / i && (N / i) % 3 == 0) {
                    count++;
                }
            }
        }

        return count;
    }
};


/*

INPUT:
2
6
10
OUTPUT:
2
0

 */