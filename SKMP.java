import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeMap;
class Codechef
{
    public static void main(String args[]) throws IOException 
    {
        Scanner sc =new Scanner(System.in);
        int q = sc.nextInt();
        sc.nextLine();
        while(q-->0) 
        {
        String string = sc.nextLine();
        String pattern = sc.nextLine();
        
        TreeMap<Character,Integer> map = new TreeMap<>();
        char[] stringlist = string.toCharArray();
        ArrayList<Character> patternlist =new ArrayList<>();
        for(char c:pattern.toCharArray())
        {
            patternlist.add(c);
        }
        char first = pattern.charAt(0);
        for(char c:stringlist)
        {
            if(map.containsKey(c))
            {
                map.put(c,map.get(c)+1);
            }
            else
            {
                map.put(c,1);
            }
        }
        for(char c:patternlist)
        {
                if(map.containsKey(c))
                {
                        map.put(c,map.get(c)-1);
                }
        }
        ArrayList<Character> al =new ArrayList<>();
        Boolean b2=false;
        int index=0;
        while(pattern.charAt(index)==pattern.charAt(index+1)&&index!=pattern.length()-1) 
        {
                index++;
        }
        if(pattern.charAt(index)>pattern.charAt(index+1))
        {
             b2=true;
        }
        boolean f  = true;
        for(char c:map.keySet())
        {
            if(c>=first&&f)
            {
                if(c>first)
                {
                    al.addAll(patternlist);
                for(int i=0;i<map.get(c);i++)

                        al.add(c);
                        f=false;
                    }
                else if(c==first)
                {
                    if(b2)
                    {
                        al.addAll(patternlist);
                    for(int i=0;i<map.get(c);i++)
                        al.add(c);
                        f=false;
                    }
                    else
                    {
                    for(int i=0;i<map.get(c);i++)
                    {
                        al.add(c);
                        }
                    }
                    
                }
                
            }
                    else
                    {
                    for (int i = 0; i < map.get(c); i++) 
                    {
                            al.add(c);
                        }
                }
            
        }
        if(f)
        {
            al.addAll(patternlist);
            }
        for(char c:al)
        {
            System.out.print(c);
        }
        System.out.println();
        }
    }
    
}
