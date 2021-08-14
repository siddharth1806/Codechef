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
    printTargetSumSubsets(arr,0,"",0,tar);
      
  }

  // set is the subset
  // sos is sum of subset
  // tar is target
  public static void printTargetSumSubsets(int[] arr, int idx, String asf, int ssf, int tar) {
        if(ssf>tar){
            return;
        }
        
        
        if(idx==arr.length){
            if(ssf==tar){
            System.out.println(asf+".");
           
            }
             return;
        }
        
        printTargetSumSubsets(arr,idx+1,asf+arr[idx]+", ",ssf+arr[idx],tar);
        printTargetSumSubsets(arr,idx+1,asf,ssf,tar);
  }

}
