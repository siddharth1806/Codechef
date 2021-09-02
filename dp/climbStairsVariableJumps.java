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
         int dp[]=new int[n+1];
        dp[n]=1;
        for(int i=n-1;i>=0;i--){
            for(int jump=1;jump<=arr[i];jump++){
                if(i+jump<=n){
                    dp[i]+=dp[i+jump];
                }
            }
        }
        return dp[0];
    }
    

}
