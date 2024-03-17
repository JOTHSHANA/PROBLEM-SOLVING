// SOLVED IN GEEKS FOR GEEKS
// PROBLEM NAME : Sum Palindrome

//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
class sumPalindrome {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            long n = Integer.parseInt(read.readLine());
            Solution ob = new Solution();

            System.out.println(ob.isSumPalindrome(n));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution {
    static long isSumPalindrome(long n){
        if(reverseNumber(n) == n){
            return n;
        }
        long reversedN = reverseNumber(n);
        long sum = reversedN + n;
        if(reverseNumber(sum) == sum){
            return sum;
        }
        else{
            for(int i = 1; i < 5; i++){
                sum = sum + reverseNumber(sum);
                if(reverseNumber(sum) == sum){
                    return sum;
                }
            }
        }
        return -1;
        
    }
    
    static long reverseNumber(long num){
        long reversedNumber = 0;
        while(num!=0){
            long digit = num%10;
            reversedNumber = reversedNumber * 10 + digit;
            num /= 10;
        }
        return reversedNumber;
    }
}



/*

INPUT:
3           ------------>num of testcases
23
30
101
OUTPUT:
55
33
101

 */