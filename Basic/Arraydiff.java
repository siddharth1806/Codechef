import java.util.Scanner;

public class ArrayDif {
    public static void  main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int n1=sc.nextInt();
        int arr[]=new int[n];
        int arr1[]=new int[n1];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
        for(int i=0;i<n1;i++){
            arr1[i]=sc.nextInt();

        }
        int diff[]=new int[n1];
        int i=arr.length-1;
        int j=arr1.length-1;
        int k=diff.length-1;
        int c=0;

        while(k>=0){
            int d=0;
            int a1v=i>=0?arr[i]:0;
            if(arr1[j]+c>=a1v){
                d=arr1[j]+c-a1v;
                c=0;
            }else{
                d=arr1[j]+c+10-a1v;
                c=-1;

            }
            diff[k]=d;
            i--;
            j--;
            k--;


        }
        int idx=0;
        while(idx<diff.length){
            if(diff[idx]==0){
                idx++;
            }
            else{
                break;
            }
        }
        while(idx<diff.length){
            System.out.println(diff[idx]);
            idx++;
        }

    }
}
