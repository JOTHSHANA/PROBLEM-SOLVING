// SOLVED IN GEEKS FOR GEEKS
// PROBLEM NAME : Sum of odd and even elements

//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class sumOfOddAndEvenNumbers
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            Solution ob = new Solution();
            int[] ans = ob.find_sum(n);
            for(int i = 0; i < ans.length; i++)
            {
                System.out.print(ans[i] + " ");
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int[] find_sum(int n)
    {
        int[] arr = new int[2];
        int evensum= 0, oddsum =0;
        for(int i = 1; i <= n; i++){
            if(i % 2 == 0){
                evensum += i;
            }
            else{
                oddsum += i;
            }
        }
        arr[0] = oddsum;
        arr[1] = evensum;
        return arr;
        
    }
}  

/*

INPUT:
2
5
6
OUTPUT:
9 6
9 12

*/