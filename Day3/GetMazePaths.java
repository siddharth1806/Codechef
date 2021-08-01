import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     int m=sc.nextInt();
     System.out.print(getMazePaths(0,0,n-1,m-1));
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        if(sr>dr || sc>dc){
        ArrayList<String> al=new ArrayList<>();
        return al;
        }
         if(sr==dr && sc==dc){
        ArrayList<String> al=new ArrayList<>();
        al.add("");
        return al;
        }
       ArrayList<String> rr1=getMazePaths(sr,sc+1,dr,dc);
       ArrayList<String> rr2=getMazePaths(sr+1,sc,dr,dc);
       ArrayList<String> mr=new ArrayList<>();
        for(int i=0;i<rr1.size();i++){
            mr.add("h"+rr1.get(i));
        }
        for(int i=0;i<rr2.size();i++){
            mr.add("v"+rr2.get(i));
        }
        return mr;
        
        
        
        
    }

}
