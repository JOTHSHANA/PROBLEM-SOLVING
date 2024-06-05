// SOLVED IN GEEKS FOR GEEKS
// PROBLEM NAME : Find N-th term in the series

//{ Driver Code Starts
//Initial Template for Java
import java.util.*;
import java.io.*;
class NthTermOfASeries {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            long n = Integer.parseInt(read.readLine());
            Solution ob = new Solution();

            System.out.println(ob.nthOfSeries(n));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution {
    static long nthOfSeries(long n){
        long add = 24;
        long ans= 9;
        if(n == 1){
            return 9;
        }
        
        for(int i = 2; i <= n; i++){
            ans += add;
            add += 16;
            if(i == n){
                return ans;
            }
        }
        
        return ans;
    }
}



/*

INPUT:
2
4
5

OUTPUT:
129
201

*/