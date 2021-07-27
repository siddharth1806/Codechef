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
        int x=sc.nextInt();
        int idx=0;
        System.out.println(lastIndex(arr,idx,x));
    }

    public static int lastIndex(int[] arr, int idx, int x){
        if(idx==arr.length){
            return -1;
        }
        int f1=lastIndex(arr,idx+1,x);
        if(f1!=-1){
            return f1;
        }
        else{
            if(arr[idx]==x){
                return idx;
            } 
            else{
                return -1;
            }
        }
        
    }

}
