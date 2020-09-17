import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        
        int h = in.nextInt();
        int m = in.nextInt();
        String[] numbers = {"one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen",
                           "fourteen","quarter","sixteen","seventeen","eighteen","nineteen","twenty","twenty one","twenty two",
                           "twenty three","twenty four","twenty five","twenty six","twenty seven","twenty eight","twenty nine",
                           "half"};
        
        if(m == 0){
            System.out.print(numbers[h-1] + " o' clock");
        }
        else if(m == 15){
            System.out.print(numbers[m-1] + " past " + numbers[h-1]);
        }
        else if(m == 30){
            System.out.print(numbers[m-1] + " past " + numbers[h-1]);
        }
        else if (m == 45){
            System.out.print(numbers[14] + " to " + numbers[h]);
        }
        else if (m == 1){
            System.out.print("one minute past " + numbers[h-1]);
        }
        else if (m < 30){
            System.out.print(numbers[m-1] + " minutes past " + numbers[h-1]);
        }
        else if (m > 30){
            System.out.print(numbers[59-m] + " minutes to " + numbers[h]);
        }
       
    }
}
