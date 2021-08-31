import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int dp[]=new int[n+1];
    dp[0]=0;
    dp[1]=1;
    for(int i=2;i<dp.length;i++){
            dp[i]=dp[i-1]+dp[i-2];
                    
    }
    System.out.println(dp[dp.length-1]);
    
//  public static int fib(int n, int[] dp){
//     //  if(n==0 || n==1){
//     //      return n;
//     //  }
//     //  if(dp[n]!=0){
//     //      return dp[n];
//     //  }
//     //  int fnm1=fib(n-1,dp);
//     //  int fnm2=fib(n-2,dp);
//     //  int fn=fnm1+fnm2;
//     //  dp[n]=fn;
//     //  return fn;
    
//  }
    }

}
