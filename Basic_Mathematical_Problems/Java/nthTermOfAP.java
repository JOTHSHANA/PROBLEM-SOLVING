// SOLVED IN GEEKS FOR GEEKS
// PROBLEM NAME : Series AP

//{ Driver Code Starts
import java.io.*;
import java.util.*;

class nthTermOfAP {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            int a1;
            a1 = Integer.parseInt(br.readLine());
            
            
            int a2;
            a2 = Integer.parseInt(br.readLine());
            
            
            int n;
            n = Integer.parseInt(br.readLine());
            
            Solution obj = new Solution();
            int res = obj.nthTermOfAP(a1, a2, n);
            
            System.out.println(res);
            
        }
    }
}

// } Driver Code Ends



class Solution {
    public static int nthTermOfAP(int a1, int a2, int n) {
        int term = a1;
        for(int i = 1; i < n; i++){
            term += (a2-a1);
        }
        return term;
    }
}


/*

INPUT:
2        ------->num of test cases

2
3
4

1
3
10

OUTPUT:
5
19

*/
