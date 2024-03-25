// SOLVED IN GEEKS FOR GEEKS
// PROBLEM NAME : Replace all 0's with 5

//{ Driver Code Starts
import java.util.*;
class replace0with5{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	while(t-->0){
		int n=sc.nextInt();
		Solution g=new Solution();
		System.out.println(g.convertFive(n));
	}
}
}
// } Driver Code Ends




/*Complete the function below*/
class Solution{
	public static int convertFive(int n){
        String s = String.valueOf(n);
        s = s.replaceAll("0", "5");
        
        return Integer.parseInt(s);
    }
}

/**

INPUT:
2
1004
121
OUTPUT:
1554
121

 */