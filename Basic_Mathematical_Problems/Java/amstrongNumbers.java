// SOLVED IN GEEKS FOR GEEKS
// PROBLEM NAME : Amstrong Numbers

//{ Driver Code Starts
//Initial Template for Java
import java.util.*;
import java.io.*;
class  amstrongNumbers{
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(read.readLine());
            Solution ob = new Solution();

            System.out.println(ob.armstrongNumber(n));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution {
    static String armstrongNumber(int num){
        int n = num;
        int count = 0;
        while(n!=0){
            int digit = n%10;
            count++;
            n = n/10;
        }
        
        n = num;
        
        int total = 0;
        while(n != 0){
            int digit = n % 10;
            int sum = 1;
            for(int i = 1; i <= count; i++){
                sum = sum * digit;
            }
            total = total + sum;
            n = n/10;
        }
        
        if(total == num){
            return "Yes";
        }
        else{
            return "No";
        }
    }
}

//input format:
//2
//120
//153


