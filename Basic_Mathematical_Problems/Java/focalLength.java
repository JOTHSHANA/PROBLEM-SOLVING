// SOLVED IN GEEKS FOR GEEKS
// PROBLEM NAME : Determine focal length of a spherical mirror

//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class focalLength
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String type = br.readLine().trim();
            float R = Float.parseFloat(br.readLine().trim());
            Solution ob = new Solution();
            int ans = ob.findFocalLength(R, type);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int findFocalLength(float R, String type)
    {
        if(type.equals("concave")){
            return (int)Math.floor(R/2);
        } 
        
        return (int)Math.floor(-R/2);
        
        
    }
}


/*

INPUT:
2
concave
5.4
convex
10
OUTPUT:
2
-5

*/