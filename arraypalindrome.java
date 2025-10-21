
import java.util.Scanner;

public class arraypalindrome {
    public static boolean  palin(int[] arr){
        int i=0;
        while(i<arr.length/2){
            if(arr[i]!=arr[(arr.length-1)-i]){
                return false;
                
            }
            i++;
        }


        return true;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[5];

        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        if(palin(arr)){
            System.out.println("yess");
        }else{
            System.out.println("no");
        }
        
    }
    
}
