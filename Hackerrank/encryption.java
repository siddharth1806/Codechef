import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the encryption function below.
    static String encryption(String s) {
    s= s.replaceAll("\\s+", "");
        int l=s.length();
        String res="";
        int r=(int)Math.floor(Math.sqrt(l));
        int c=(int)Math.ceil(Math.sqrt(l));
        if(r*c<l)
            r++;
        for(int i=0;i<c;i++)
        {
            for(int j=0;j<r;j++)
            {
                if (i + j * c <l) 
                {
                    res += s.charAt(i + j * c);
                }
            }
                res += " ";
          }
         return res;
    

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        String result = encryption(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
