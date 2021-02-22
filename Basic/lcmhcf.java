import java.util.Scanner;
public class GCDLCM {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int n2=sc.nextInt();
        int on1=n;
        int on2=n2;
        while(n%n2!=0){
            int rem=n%n2;
            n=n2;
            n2=rem;
        }
        int gcd=n2;
        int lcm=(on1*on2)/gcd;
        System.out.println(lcm+" "+ gcd);
    }
}
