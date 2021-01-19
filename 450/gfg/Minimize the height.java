   // { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int k = Integer.parseInt(inputLine[0]);
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int ans = new Solution().getMinDiff(arr, n, k);
            System.out.println(ans);
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution {
    int getMinDiff(int[] arr, int n, int k) {
        // code here
/*       int ans=0;
        ArrayList<Integer> al=new ArrayList<Integer>();
        ArrayList<Integer> al1=new ArrayList<Integer>();

        for(int i=0;i<n;i++)
        {
            ans=arr[i]-k;
            if(ans>0)
            {
                al.add(arr[i]-k);
            }
            else{
                al1.add(arr[i]+k);
            }
            
        }
        for(int i=0;i<al.size();i++){
            al1.addAll(i,al);
        }
        Collections.sort(al1);
        int first=al1.get(0);
       
        int last=al1.get(al1.size()-1); 
        int diff=last-first;
        return diff;*/
        Arrays.sort(arr);
        int ans=arr[n-1]-arr[0];
        int min=Integer.MIN_VALUE;
        int max=Integer.MAX_VALUE;
        for(int i=1;i<n;i++)
        {
            if(arr[i]>=k)
            {
                min=Math.max(arr[i-1]+k,arr[n-1]-k);
                max=Math.min(arr[i]-k,arr[0]+k);
                ans=Math.min(ans,min-max);
            }
            else
                continue;}
            
        return ans;
        
    }
}
