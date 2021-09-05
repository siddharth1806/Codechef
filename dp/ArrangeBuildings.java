
{
1. You are given a number n, which represents the length of a road. The road has n plots on it's each side.
2. The road is to be so planned that there should not be consecutive buildings on either side of the road.
3. You are required to find and print the number of ways in which the buildings can be built on both side of roads.
}








import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    long dp1[]=new long[n];
    long dp2[]=new long[n];
    System.out.println(countBinary(dp1,dp2,n));
 }
 public static long countBinary(long[] dp1, long[] dp2, int n){
    dp1[0]=1;
    dp2[0]=1;
    for(int i=1;i<n;i++){
        dp1[i]=dp2[i-1];
        dp2[i]=dp2[i-1]+dp1[i-1];
    }
    long count=dp1[n-1]+dp2[n-1];
    return count*count;
 }

}
