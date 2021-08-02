import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        printSS(str,"");
    }

    public static void printSS(String str, String afs) {
        if(str.length()==0){
            System.out.println(afs);
            return;
        }
        char ch=str.charAt(0);
        String ros=str.substring(1);
        //yes
        printSS(ros,afs+ch);
        //no
        printSS(ros,afs);
    }

}
