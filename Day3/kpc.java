import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(getKPC(str));
    }
    static String[] arr={".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
     public static ArrayList<String> getKPC(String str) {
        if(str.length()==0){
            ArrayList<String> ans=new ArrayList<>();
            ans.add("");
            return ans;
        }
        char ch=str.charAt(0);
        String ros=str.substring(1);
        ArrayList<String> rr=getKPC(ros);
        ArrayList<String> mr=new ArrayList<>();
        String code=arr[ch -'0'];
        for(int i=0;i<code.length();i++){
            char c=code.charAt(i);
            for(int j=0;j<rr.size();j++){
                mr.add(c + rr.get(j));
            }
        }
        return mr;
    }
    

}
