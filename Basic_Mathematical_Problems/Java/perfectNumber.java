// SOLVED IN GEEKS FOR GEEKS
// PROBLEM NAME : Perfect Number

//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class perfectNumber {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.isPerfect(N));
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    int isPerfect(int N) {
        int n = N;
        int sum = 0;
        while(n!=0){
            int digit = n%10;
            sum += fact(digit);
            n /= 10;
        }
        if(sum == N){
            return 1;
        }
        return 0;
    }
    
    int fact(int num){
        if(num == 0 || num == 1){
            return 1;
        }
        else{
            return num * fact(num-1);
        }
    }
}


/*

INPUT:
2
23
145
OUTPUT:
0
1

*/