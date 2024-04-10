// SOLVED IN GEEKS FOR GEEKS
// PROBLEM NAME : 12 hour clock addition


//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
import java.lang.*;

class clockAddition{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0){
            String input_line[] = read.readLine().trim().split("\\s+");
            int num1 = Integer.parseInt(input_line[0]);
            int num2 = Integer.parseInt(input_line[1]);

            Solution ob = new Solution();
            System.out.println(ob.clockSum(num1, num2));
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution{
    static int clockSum(int num1, int num2){
        int sum = num1+num2;
        for(int i = 0; i< 12;i++){
            if(sum < 12){
                break;
            }
            if(sum >= 12){
                sum = sum - 12;
            }
        }
        return sum;
        
    }
}


/*

INPUT:
2
5 7
3 5
OUTPUT:
0
8

*/