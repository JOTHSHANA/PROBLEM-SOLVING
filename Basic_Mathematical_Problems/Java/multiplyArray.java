// SOLVED IN GEEKS FOR GEEKS
// PROBLEM NAME : Multiply Array

//{ Driver Code Starts
import java.util.*;

class multiplyArray {
	public static void main(String[] args)
	{
        Scanner sc=new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            int n = sc.nextInt();
            int arr[] = new int[n+5];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            
            Solution obj = new Solution();
            System.out.println(obj.product(arr, n));
        }
	}
}

// } Driver Code Ends



class Solution {

    public static int product(int arr[],int n)
    {
        int ans = 1;
        for(int i = 0; i < n; i++){
            ans = ans * arr[i];
        }
        return ans;
    }
}


/*

INPUT:
2
5
1 2 3 4 5
10
5 5 5 5 5 5 5 5 5 5
OUTPUT:
120
9765625

*/