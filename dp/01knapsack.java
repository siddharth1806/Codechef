import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int price[]=new int[n];
        for(int i=0;i<n;i++){
            price[i]=sc.nextInt();
        }
        int[] weight=new int[n];
          for(int i=0;i<n;i++){
            weight[i]=sc.nextInt();
        }
        int cap=sc.nextInt();
        System.out.println(knapsack(price,weight,cap));
    }
    
    
    public static int knapsack(int[] price, int[] weight, int cap)
    {
        int[][] dp=new int[price.length+1][cap+1];
//         for(int i=0;i<dp.length;i++){
//             dp[i][0]=0;
//         }
//          for(int j=0;j<dp[0].length;j++){
//             dp[0][j]=0;
//         }
        for(int i=1;i<dp.length;i++){
            for(int j=1;j<dp[0].length;j++){
                dp[i][j]=dp[i-1][j]+0;
                if( j-weight[i-1]>=0)
                {
                    dp[i][j]=Math.max(dp[i][j],dp[i-1][j-weight[i-1]]+price[i-1]);
                }
            }
        }
        return dp[dp.length-1][dp[0].length-1];
    }
}
