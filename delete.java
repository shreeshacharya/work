
import java.util.Scanner;

public class delete {
    public static int[] newarr(int arr[],int n){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=n){
                count++;
            }

        }

        
        int[] newarray=new int[count];

        int i=0,j=0;
        while(i<arr.length){
            if(arr[i]!=n){
                newarray[j]=arr[i];
                j++;
            }i++;

        }


        return newarray;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("enter size");
        n=sc.nextInt();
        System.out.println("eneter ele");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter no u want to dlt");
        int no=sc.nextInt();

        int[] newestarray=newarr(arr,no);
        for(int i=0;i<newestarray.length;i++){
            System.out.print(newestarray[i]);

        }

        


    }
    
}
