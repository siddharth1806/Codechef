import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int dp1[]=new int[n];
    int dp2[]=new int[n];
    System.out.println(countBinary(dp1,dp2,n));
 }
 public static int countBinary(int[] dp1, int[] dp2, int n){
    dp1[0]=1;
    dp2[0]=1;
    for(int i=1;i<n;i++){
        dp1[i]=dp2[i-1];
        dp2[i]=dp2[i-1]+dp1[i-1];
    }
    int count=dp1[n-1]+dp2[n-1];
    return count;
 }

}
