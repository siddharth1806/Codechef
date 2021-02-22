import java.util.Scanner;

public class reverse {

        public static void  main(String args[]) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int k=sc.nextInt();
            int nod=0;
            int temp=n;
            while(temp>0){
                temp=temp/10;
                nod++;

            }
            int div=1;
            int mul=1;
            for(int i=1;i<=nod;i++){
                if(i<=k){
                    div=div*10;
                }
                else{
                    mul=mul*10;
                }
            }
            int rem=n%div;
            int quo=n/div;
            rem=rem*mul+quo;
            System.out.println(rem);
        }



}
