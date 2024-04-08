// SOLVED IN GEEKS FOR GEEKS
// PROBLEM NAME : Floyd's triangle

//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class floydsTriangle
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int N = sc.nextInt();

            Solution ob = new Solution();
            ob.printFloydTriangle(N);
        }
    }
}

// } Driver Code Ends


//User function Template for Java
class Solution{
    static void printFloydTriangle(int N){
        int num = 1;
        for(int i = 1; i <= N; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }
}



/*

INPUT:
2
4
5
OUTPUT:
1
2 3
4 5 6
7 8 9 10
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15

*/