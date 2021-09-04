import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
         Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int tar=sc.nextInt();
        Boolean dp[][]=new Boolean[n][tar+1];
        System.out.println(tssTab(arr,tar));
    }
    //memorization
    public static boolean tss(int[] arr, int idx, int tar, Boolean[][] dp){
        if(tar==0){
            return true;
        }
        if(idx>=arr.length || tar<0){
            return false;
        }
        if(dp[idx][tar]!=null){
            return dp[idx][tar];
        }
        
        boolean f1=tss(arr,idx+1,tar,dp);
        boolean f2=tss(arr,idx+1,tar-arr[idx],dp);
        boolean ans=f1||f2;
        dp[idx][tar]=ans;
        return ans;
    }
    //tabulation
    public static boolean tssTab(int[] arr, int tar){
        boolean[][] dp=new boolean[arr.length+1][tar+1];
        for(int i=0;i<dp.length;i++){
            dp[i][0]=true;
        }
        
        for(int i=1;i<dp.length;i++){
            for(int j=1;j<dp[0].length;j++){
                dp[i][j]=dp[i-1][j];
                if( dp[i][j] == false && j-arr[i-1]>=0)
                {
                    dp[i][j]=dp[i-1][j-arr[i-1]];
                }
            }
        }
        return dp[dp.length-1][dp[0].length-1];
    }
    
    
    
    
    
    
    
}
