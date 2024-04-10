// SOLVED IN GEEKS FOR GEEKS
// PROBLEM NAME : Check if two given circles touch each other

//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class circleTouch {
    public static void main(String args[]) throws IOException {
        Scanner sc=new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int X1 = sc.nextInt();
            int Y1 = sc.nextInt();
            int R1 = sc.nextInt();
            int X2 = sc.nextInt();
            int Y2 = sc.nextInt();
            int R2 = sc.nextInt();
            Solution ob = new Solution();
            System.out.println(ob.circleTouch(X1, Y1, R1, X2, Y2, R2));
        }
    }
}
// } Driver Code Ends


// User function template for Java
class Solution {
    int circleTouch(int X1, int Y1, int R1, int X2, int Y2, int R2) {
        int ans = (int)Math.sqrt(((X2-X1)*(X2-X1)) + ((Y2-Y1)*(Y2-Y1)));
        if(ans<R1+R2){
            return 1;
        }
        else{
            return 0;
        }
    }
}




/*

INPUT:
2
3 4 5 14 18 8
3 4 5 14 18 18
OUTPUT:
0
1

*/
