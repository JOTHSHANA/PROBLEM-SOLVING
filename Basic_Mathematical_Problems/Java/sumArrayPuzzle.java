// SOLVED IN GEEKS FOR GEEKS
// PROBLEM NAME : Sum Array Puzzle

//{ Driver Code Starts
//Initial Template for Java


import java.util.*;
import java.io.*;
import java.lang.*;

class sumArrayPuzzle
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int arr[] = new int[n];
            
            for(int i = 0; i < n; i++)
               arr[i] = sc.nextInt();
              
            Geeks obj = new Geeks();
            obj.SumArray(arr, n);
            for(int i = 0; i < n; i++)
                System.out.print(arr[i] + " ");
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java

// arr is the array
// n is the number of element in array
class Geeks
{
    public static void SumArray(int arr[], int n)
    {
        int res[] = new int[n];
        int sum;
    
        for(int i = 0; i < n; i++){
            sum = 0;
            for(int j = 0; j < n; j++){
                if(i == j){
                    continue;
                }
                sum = sum+arr[j];
            }
        
            res[i] = sum;
        }
    
        
        for(int i = 0; i < n; i++){
            arr[i] = res[i];
        }
    }
    
}



/*

INPUT:
2
5
3 6 4 8 9
6
4 5 7 3 10 1

OUTPUT:
27 24 26 22 21
26 25 23 27 20 29

*/