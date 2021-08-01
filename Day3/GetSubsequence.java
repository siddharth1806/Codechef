import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(gss(str));
    }

    public static ArrayList<String> gss(String str) {
        if(str.length()==0){
            ArrayList<String> ans=new ArrayList<>();
            ans.add("");
            return ans;
        }
        char ch=str.charAt(0);
        String ros=str.substring(1);
        ArrayList<String> rr=gss(ros);
        ArrayList<String> mr=new ArrayList<String>();
        for(int i=0;i<rr.size();i++){
            mr.add(rr.get(i));
        }
        for(int i=0;i<rr.size();i++){
            mr.add(ch+rr.get(i));
        }
        return mr;
        
    }

}
