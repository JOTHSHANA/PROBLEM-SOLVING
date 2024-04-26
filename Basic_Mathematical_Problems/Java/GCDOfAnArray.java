// SOLVED IN GEEKS FOR GEEKS
// PROBLEM NAME : GCD of Array

//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;
class GCDOfAnArray
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    int N = sc.nextInt();
                    int Arr[] = new int[N];
                    for(int i = 0;i<N;i++)
                        Arr[i] = sc.nextInt();
                    Solution ob = new Solution();
                    System.out.println(ob.gcd(N,Arr));
                }
        }
}    
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int gcd(int N , int arr[]) 
    { 
       int min = arr[0];
       for(int i = 0; i < N; i++){
           if(arr[i]<min){
               min = arr[i];
           }
       }
       
       int temp;
       while(min >= 1){
           temp = 0;
           for(int i = 0; i < N;i++){
               int value = arr[i] % min;
               if(value == 0){
                   temp++;
               }
               
           }
           if(temp == N){
               return min;
           }
           else{
               min--;
           }
       }
       return 1;
    } 
}


/*

INPUT:
2
3
2 4 6
1
1
OUTPUT:
2
1

*/