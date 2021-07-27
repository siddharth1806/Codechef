import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
          Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int arr[]=new int[n1];
        for(int i=0;i<n1;i++){
            arr[i]=sc.nextInt();
        }
        int idx=0;
        System.out.println(maxOfArray(arr,idx));
    }

    public static int maxOfArray(int[] arr, int idx){
      if(idx==arr.length){
          return Integer.MIN_VALUE;
      }
      int f1=  maxOfArray(arr,idx+1);
        int max=Math.max(f1,arr[idx]);
        return max;
        
        
        
    }

}
