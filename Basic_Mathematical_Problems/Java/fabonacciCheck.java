// SOLVED IN GEEKS FOR GEEKS
// PROBLEM NAME : Check if the number is Fibonacci

//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class fabonacciCheck
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.checkFibonacci(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution{
    static String checkFibonacci(int N){
        int pre = 1;
        int curr = 1;
        if(N == 0 || N == 1){
            return "Yes";
        }

        for(int i = 1; i <= N; i++){
            int next = pre + curr;
            if(next == N){
                return "Yes";
            }
            pre = curr;
            curr = next;
            
            if(next>N){
                break;
            }
        }
        return "No";
    }
}


/*

INPUT:
2
34
41
OUTPUT:
Yes
No

*/