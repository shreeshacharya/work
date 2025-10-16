
import java.util.Scanner;


public class maxmin {
    public static int min(int arr[]){
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=min){
                min=arr[i];
            }

        }
    
    return min;
}
public static int max(int arr[]){
    int max=arr[0];
    for(int i=0;i<arr.length;i++){
        if(arr[i]>max){
            max=arr[i];
        }
    }
    return max;

}


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enetr size");
        int n=sc.nextInt();
        System.out.println("enter ele");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
        int min=min(arr);
        int max=max(arr);
        System.out.println("max ele is "+max+"\n min ele is"+min);

        
    }
    
}
