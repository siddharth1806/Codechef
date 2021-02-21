import java.util.Scanner;

public class digdesc {
    public static void  main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        while(n!=0){
            int temp=n%10;
            System.out.println(temp);
            n=n/10;
        }

    }

}
