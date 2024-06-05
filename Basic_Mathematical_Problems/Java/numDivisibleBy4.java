// SOLVED IN GEEKS FOR GEEKS
// PROBLEM NAME : Check if divisible by 4

//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class numDivisibleBy4
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            String s = sc.next ();

    		System.out.println (new Sol().divisibleBy4 (s));
        }
        
    }
}

// Contributed By: Pranay Bansal

// } Driver Code Ends


//User function Template for Java

class Sol
{
    int divisibleBy4 (String N)
    {
        if(N.length()==1){
            return (N.charAt(0)-'0')%4 == 0?1:0;
        }
        int num = Integer.parseInt(N.substring(N.length()-2));
        return num%4 == 0?1 : 0;
    }
}


/*

INPUT:
2
1124
7

OUTPUT:
1
0

*/