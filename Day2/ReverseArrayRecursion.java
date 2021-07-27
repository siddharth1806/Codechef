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
        displayArrReverse(arr,idx);
    }

    public static void displayArrReverse(int[] arr, int idx) {
        if(idx==arr.length)return;
        displayArrReverse(arr,idx+1);
        System.out.println(arr[idx]);
    }

}
