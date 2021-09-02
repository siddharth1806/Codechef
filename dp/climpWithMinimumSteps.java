import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(cs2(arr));
        
    }
    public static int cs2(int[] arr){
        //tabulation
        int n=arr.length;
         int dp[]=new int[n];
        dp[n-1]=0;
        for(int i=n-2;i>=0;i--){
            int min=Integer.MAX_VALUE-1;
            for(int jump=1;jump<=arr[i];jump++){
                if(i+jump<dp.length){
                    min=Math.min(min,dp[i+jump]);
                }
            }
            dp[i]=min+1;
        }
        return dp[0];
    }
    

}
