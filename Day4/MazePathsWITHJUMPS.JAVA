import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        System.out.println(getMazePaths(0,0,n-1,m-1));
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        if(sr==dr && sc==dc){
            ArrayList<String> ans=new ArrayList<>();
            ans.add("");
            return ans;
        }
        
        ArrayList<String> mr=new ArrayList<String>();
        for(int i=1;i<=dc-sc;i++){
            ArrayList<String> rr=getMazePaths(sr,sc+i,dr,dc);
            for(int j=0;j<rr.size();j++){
                mr.add("h"+i+rr.get(j));
            }
        }
        for(int i=1;i<=dr-sr;i++){
            ArrayList<String> rr=getMazePaths(sr+i,sc,dr,dc);
            for(int j=0;j<rr.size();j++){
                mr.add("v"+i+rr.get(j));
            }
        }
        for(int i=1;i<=dc-sc && i<=dr-sr;i++){
            ArrayList<String> rr=getMazePaths(sr+i,sc+i,dr,dc);
            for(int j=0;j<rr.size();j++){
                mr.add("d"+i+rr.get(j));
            }
        }
        return mr;
    }

}
