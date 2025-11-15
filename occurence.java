import java.util.Scanner;

public class occurence {
    public static int occ(int arr[],int no){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==no){
                count++;
            }

        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("enter size");
        int n=sc.nextInt();
        System.out.println("eneter the no u want to find");
        int nom=sc.nextInt();
        
        int[] arr=new int[n];
        System.out.println("enetr ele");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int res=occ(arr,nom);
        // int[] no=ArrayUtility.inputArray();
        System.out.println("no occured"+res+"times");
        


    }
    
}
