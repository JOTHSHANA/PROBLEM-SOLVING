// SOLVED IN GEEKS FOR GEEKS
// PROBLEM NAME : Power of Four

//{ Driver Code Starts
import java.util.*;
class powerOf4
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
			long n = sc.nextLong();
			Solution ob = new Solution();
			System.out.println(ob.isPowerOfFour(n));
		t--;
		}
	}
}
// } Driver Code Ends


class Solution
{
    int isPowerOfFour(long n)
    {
        int x = ((int)(n & (n-1)))>0 ? 0 :1;
        int y = ((int)(n & 0xAAAAAAAAL))>0 ? 0 :1;
        return x*y;
    }
}



/*

INPUT:
2
64
75
OUTPUT:
1
0

*/