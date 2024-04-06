// SOLVED IN GEEKS FOR GEEKS
// PROBLEM NAME : Find the median

//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class findTheMedian
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            String s = br.readLine();
            String[] S = s.split(" ");
            int[] v  = new int[n];
            for(int  i = 0; i < n; i++)
                v[i] = Integer.parseInt(S[i]);
            Solution ob = new Solution();
            int ans = ob.find_median(v);
            System.out.println(ans);
        }
    }
    
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int find_median(int[] v)
    {
       Arrays.sort(v);
       int len = v.length;
       if(len % 2 == 0){
           return (v[(len/2)-1]+ v[len/2])/2;
       }
       else{
           return v[len/2];
       }
    }
}

//2               // Number of test cases
//5               // Size of the first array
//1 2 3 4 5       // Elements of the first array
//4               // Size of the second array
//7 3 1 5         // Elements of the second array
