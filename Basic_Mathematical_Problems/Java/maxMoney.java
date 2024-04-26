// SOLVED IN GEEKS FOR GEEKS
// PROBLEM NAME : Maximum money

//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class maxMoney {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String St[] = read.readLine().split(" ");
            int N = Integer.parseInt(St[0]);
            int K = Integer.parseInt(St[1]);

            Solution ob = new Solution();
            System.out.println(ob.maximizeMoney(N,K));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static int maximizeMoney(int N , int K) {
        int oddHouse = 0;
        int evenHouse = 0;
        for(int i = 1; i <= N; i++){
            if(i%2 == 0){
                evenHouse += K;
            }
            else{
                oddHouse += K;
            }
        }
        
        if(evenHouse > oddHouse){
            return evenHouse;
        }
        else{
            return oddHouse;
        }
    }
};


/*

INPUT:
2
5 10
2 12
OUTPUT:
30
12

*/