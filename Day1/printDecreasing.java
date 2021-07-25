import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
         Scanner sc=new Scanner(System.in);
         int c=1;
        int n=sc.nextInt();
        printIncreasing(n,c);
    }

    public static void printIncreasing(int n,int c){
          
        if(n<c){
            return;
        }
      
        System.out.println(c);
        printIncreasing(n,c+1);
    }

}
