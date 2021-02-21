import java.util.Scanner;
import java.util.*;
import java.io.*;
import java.lang.Math;


public class printdigit {
    public static void  main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count=0;
        int temp=n;
        while(n!=0){
            n=n/10;
            count++;

        }
        System.out.println(count);
        int div=(int)Math.pow(10,count-1);
        while(div!=0){
            int quo=temp/div;
            System.out.println(quo);
            temp=temp%div;
            div=div/10;
        }

    }

}
