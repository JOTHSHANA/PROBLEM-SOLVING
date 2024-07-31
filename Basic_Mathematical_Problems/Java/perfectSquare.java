// SOLVED IN GEEKS FOR GEEKS
// PROBLEM NAME : Check perfect square

//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class perfectSquare
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());

            Solution ob = new Solution();
            System.out.println(ob.checkPerfectSquare(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution{
    static int checkPerfectSquare(int N){
        int n = (int)Math.sqrt(N);
        if(n * n == N ){
            return 1;
        }
        return 0;
    }
}


/*

INPUT:
2
35
49
OUTPUT:
0
1

*/