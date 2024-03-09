//GEEKS FOR GEEKS
//{ Driver Code Starts
import java.io.*;
import java.util.*;

class sumOfSeries {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            int n;
            n = Integer.parseInt(br.readLine());
            
            Solution obj = new Solution();
            long res = obj.seriesSum(n);
            
            System.out.println(res);
            
        }
    }

    //logic

    static class Solution {
        public long seriesSum(int n) {
            long l = n;
            return l*(l+1)/2;
        }
    }
   
}

// } Driver Code Ends
//after running this code, give the inputs like
// 3           //no. of test cases
// 1
// 3
// 5