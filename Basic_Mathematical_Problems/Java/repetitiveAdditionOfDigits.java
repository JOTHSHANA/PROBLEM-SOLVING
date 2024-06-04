// SOLVED IN GEEKS FOR GEEKS
// PROBLEM NAME : Repetitive Addition Of Digits

//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class repetitiveAdditionOfDigits
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            long N=sc.nextLong();
			
            Solution ob = new Solution();
            int ans  = ob.singleDigit(N);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java
class Solution{
    static int singleDigit(long N){
        long ans;
        int sum;
        for(int i = 0;; i++){
            ans = addDigits(N);
            sum = addDigits(N);
            if(ans/10 == 0){
                return sum;
            }
            else{
                N = ans;
            }
        }
        
    }
    
    static int addDigits(long n){
        long num = n;
        int sum = 0;
        while(num!=0){
          long digit = num%10;
          sum += digit;
          num = num/10;
        }
        
        return sum;
    }
}


/*

INPUT:
2
98
1
OUTPUT:
8
1

 */