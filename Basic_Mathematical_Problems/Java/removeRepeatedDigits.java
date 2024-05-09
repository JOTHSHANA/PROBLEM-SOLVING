// SOLVED IN GEEKS FOR GEEKS
// PROBLEM NAME : Remove repeated digits in a given number

//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class removeRepeatedDigits
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            long num = Long.parseLong(read.readLine()); 
            Solution ob = new Solution();
            System.out.println(ob.modify(num));
        }
    }
}

// } Driver Code Ends

class Solution {
    public long modify(long N) {
        long n = N;
        long ans = 0;
        long prevDigit = -1; // Initialize to a value that won't occur in digits

        // Reconstruct the number with non-repeated digits
        while (n != 0) {
            long digit = n % 10;
            if (digit != prevDigit) {
                ans = ans * 10 + digit;
                prevDigit = digit;
            }
            n = n / 10;
        }

        // Reverse the modified number
        long reversed = 0;
        while (ans != 0) {
            reversed = reversed * 10 + ans % 10;
            ans /= 10;
        }

        return reversed;
    }
}


/*

INPUT:
2
1224
1242
OUTPUT:
124
1242

*/
