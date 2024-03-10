// SOLVED IN GEEKS FOR GEEKS
// PROBLEM NAME : GCD of two numbers

//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GCD {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            int a;
            a = Integer.parseInt(br.readLine());
            
            
            int b;
            b = Integer.parseInt(br.readLine());
            
            Solution obj = new Solution();
            int res = obj.gcd(a, b);
            
            System.out.println(res);
            
        }
    }
}

// } Driver Code Ends


class Solution {
    public static int gcd(int a, int b) {
        int rem = a%b;
        while(a%b != 0){
            a = b;
            b = rem;
            rem = a%b;
        }
        
        return b;
    } 
}

//input format:

//2      ---> no od=f test cases

//3      ----->a
//6      ----->b

//1      ----->a
//1      ----->b