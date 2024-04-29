// SOLVED IN GEEKS FOR GEEKS
// PROBLEM NAME : Find all factorial numbers less than or equal to N

//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class factorialLessThanN
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            long N=sc.nextLong();
			
            Solution ob = new Solution();
            ArrayList<Long> ans = ob.factorialNumbers(N);
            for(long num : ans){
                System.out.print(num+" ");
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


//User function Template for Java
class Solution{
    static ArrayList<Long> factorialNumbers(long N){
        ArrayList<Long> arr = new ArrayList();
        for(long i=1; i<=N; i++){
            long factorial = factorial(i);
            if(factorial <= N){
                arr.add(factorial);
            }else{
                break;
            }
        }
        return arr;
    }
    
    static long factorial(long n){
        if(n == 1 || n == 0){
            return 1;
        }
        return n*factorial(n-1);
    }
}


/*

INPUT:
2
3
6
OUTPUT:
1 2
1 2 6

*/