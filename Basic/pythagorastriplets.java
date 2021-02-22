import java.util.Scanner;

public class pythagorastriplets {

    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int max=n;
        if(n1>max){
            max=n1;

        }
        if(n2>max){
            max=n2;
        }
        if(max==n){
            boolean flag=((n1*n1+n2*n2)==(n*n));
            System.out.println(flag);
        }
        else if(max==n1){
            boolean flag=((n*n+n2*n2)==(n1*n1));
            System.out.println(flag);

        }
        else{
            boolean flag=((n1*n1+n*n)==(n2*n2));
            System.out.println(flag);

        }
    }
}
