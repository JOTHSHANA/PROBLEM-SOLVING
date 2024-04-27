// SOLVED IN GEEKS FOR GEEKS
// PROBLEM NAME : Check if a number is power of another number

//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class numPowerOfAnotherNum
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String[] inp=read.readLine().split(" ");
            Long X=Long.parseLong(inp[0]);
            Long Y=Long.parseLong(inp[1]);

            Solution ob = new Solution();
            System.out.println(ob.isPowerOfAnother(X,Y));
        }
    }
}

// } Driver Code Ends


//User function Template for Java
class Solution{
    static Long isPowerOfAnother(Long X, Long Y){
        if(X == 1){
            return 0L;
        }
        else{
            while(Y%X == 0){
                Y = Y/X;
            }
            if(Y == 1){
                return 1L;
            }
            else{
                return 0L;
            }
        }
    }
}


/*

INPUT:
2
2 8
1 8
OUTPUT:
1
0

*/
