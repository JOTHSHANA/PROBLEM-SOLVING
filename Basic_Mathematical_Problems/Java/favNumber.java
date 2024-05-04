// SOLVED IN GEEKS FOR GEEKS
// PROBLEM NAME : Anshuman's Favourite Number

//{ Driver Code Starts
import java.io.*;
import java.util.*;

class favNumber
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            Long N = Long.parseLong(read.readLine());

            Solution ob = new Solution();
            System.out.println(ob.isValid(N));
        }
    }
}
// } Driver Code Ends


class Solution{
    static String isValid(Long N){
        if(N%5 == 0){
            return "YES";
        }
        return "NO";
    }
}



/*

INPUT:
2
10
9
OUTPUT:
YES
NO

*/