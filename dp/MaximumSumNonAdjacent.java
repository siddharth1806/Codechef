import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    long arr[]=new long[n];
    for(int i=0;i<n;i++){
        arr[i]=sc.nextLong();
    }
    long dp1[]=new long[n+1];
    long dp2[]=new long[n+1];
    System.out.println(countBinary(arr,dp1,dp2,n));
 }
 public static long countBinary(long[] arr,long[] dp1, long[] dp2, int n){
    dp1[0]=arr[0];
    dp2[0]=0;
    for(int i=1;i<n;i++){
        dp1[i]=dp2[i-1]+arr[i];
        dp2[i]=Math.max(dp2[i-1],dp1[i-1]);
    }

    return Math.max(dp1[n-1],dp2[n-1]);
 }

}
