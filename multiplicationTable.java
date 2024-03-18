// SOLVED IN GEEKS FOR GEEKS
// PROBLEM NAME : Multiplication Table

//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class multiplicationTable
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int N = sc.nextInt();
            Solution ob = new Solution();
            ArrayList<Integer> ans = ob.getTable(N);
            for (Integer val: ans) 
                System.out.print(val+" "); 
            System.out.println();
        }
    }
}

// } Driver Code Ends


//User function Template for Java
class Solution{
    static ArrayList<Integer> getTable(int N){
        ArrayList arr = new ArrayList<>();
        for(int i = N;i <= N*10 ; i = i +N){
            arr.add(i);
        }
        return arr;
    }
}



/*

INPUT:
2             --------->num of testcases
9
2
OUTPUT:
9 18 27 36 45 54 63 72 81 90
2 4 6 8 10 12 14 16 18 20

 */