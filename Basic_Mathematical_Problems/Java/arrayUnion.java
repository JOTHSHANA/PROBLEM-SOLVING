// SOLVED IN GEEKS FOR GEEKS
// PROBLEM NAME : Union of two arrays

//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class arrayUnion{
	public static void main (String[] args) {
	    
	    //Taking input using class Scanner
		Scanner sc=new Scanner(System.in);
		
		//Taking total count of testcases
		int t=sc.nextInt();
		sc.nextLine();
		while(t-->0)
		{
		    
		    int n,m;
		    
		    //taking size of array a
		    n=sc.nextInt();
		    
		    //taking size of array b
		    m=sc.nextInt();
		    
		    //Creating 2 array of size n and m
		    int a[]=new int[n];
		    int b[]=new int[m];
		    
		    //inserting elements to array a
		    for(int i=0;i<n;i++)
		    {
		        a[i]=sc.nextInt();
		    }
		    
		    //inserting elements to array b
		    for(int i=0;i<m;i++)
		    {
		        b[i]=sc.nextInt();
		    }
		    Solution ob=new Solution();
		    //calling doUnion method and printing the results
		    System.out.println(ob.doUnion(a,n,b,m));
		}
		
	}
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    public static int doUnion(int a[], int n, int b[], int m) 
    {
        HashSet<Integer> unionSet = new HashSet<>();

        for (int num : a) {
            unionSet.add(num);
        }

        for (int num : b) {
            unionSet.add(num);
        }

        return unionSet.size();
    }
}



/*

INPUT:
2
5 3
1 2 3 4 5
1 2 3

6 2 
85 25 1 32 54 6
85 2 
OUTPUT:
5
7


*/