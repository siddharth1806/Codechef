import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int n=sc.nextInt();
        System.out.println(power(x,n));
    }

    public static int power(int x, int n){
        if(n==0){
            return 1;
        }
        int xpnm1=power(x,n/2);
        int xn=xpnm1*xpnm1;
        if(n%2!=0){
            xn*=x;
        }
        return xn;
    }

}
