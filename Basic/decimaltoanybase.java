import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int b = scn.nextInt();
      int dn = getValueInBase(n, b);
      System.out.println(dn);
   }
  
   public static int getValueInBase(int n, int b){
       // write code here
       int con=0;
         
           int i=1;
           while(n>0){
               int rem=n%b;
           con=con+(rem*i);
           i=i*10;
           
           n=n/b;
           
           }
           return con;
   }
  }
