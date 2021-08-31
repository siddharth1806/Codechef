import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(csTab(n));
    }
    public static int csTab(int n){
        int dp[]=new int[n+1];
        dp[0]=1;
        for(int i=1;i<=n;i++){
            dp[i]=dp[i-1];
            if(i-2>=0){
                dp[i]+=dp[i-2];
                
            }
            if(i-3>=0){
                dp[i]+=dp[i-3];
            }
        }
        return dp[n];
    }

}
