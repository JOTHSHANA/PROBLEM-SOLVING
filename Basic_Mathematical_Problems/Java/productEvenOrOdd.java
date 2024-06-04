// SOLVED IN GEEKS FOR GEEKS
// PROBLEM NAME : Product is even or odd?

//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class productEvenOrOdd
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    String n1 = sc.next();
                    String n2 = sc.next();
                    Sol obj = new Sol();
                    System.out.println(obj.EvenOdd(n1,n2));
                }
                
        }
}

// } Driver Code Ends


//User function Template for Java

class Sol
{
    int EvenOdd(String n1 , String n2)
        {
            char ch1 = n1.charAt(n1.length() - 1);
            char ch2 = n2.charAt(n2.length() - 1);
            int product = ch1*ch2;
            if(product % 2 == 0){
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
12 15
123 457

OUTPUT:
1
0

*/