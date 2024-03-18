// SOLVED IN GEEKS FOR GEEKS
// PROBLEM NAME : Average in a stream

//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
import java.text.DecimalFormat;

class avgInAStream {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            float[] ans = new Solution().streamAvg(arr, n);
            for (int i = 0; i < n; i++) {
                DecimalFormat df = new DecimalFormat("#.##");
            	String formatted1 = df.format(ans[i]);
            	String formatted2 = String.format("%.2f", ans[i]);
            	if(formatted1.length() >= 3 && formatted1.charAt(formatted1.length()-3) == '.')
            		System.out.print(formatted1+" ");
            	else
            		System.out.print(formatted2+" ");
            }
            System.out.println();
        }
    }
}



// } Driver Code Ends


//User function Template for Java

class Solution {
    float[] streamAvg(int[] arr, int n) {
        float[] ans = new float[n];
        float sum = 0;
        for(int i = 0; i < n; i++){
            sum = sum + arr[i];
            ans[i] = sum / (i+1);
        }
        return ans;
    }
}



/*

INPUT:
2
5
10 20 30 40 50
3
40 80 20
OUTPUT:
10.00 15.00 20.00 25.00 30.00
40.00 60.00 46.00

 */