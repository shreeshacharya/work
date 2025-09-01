
import java.util.Scanner;

public class stringArray {
    public static void length(String arr[]){
        System.out.println("size os array is"+arr.length);

    }
    public static void main(String[] args) {
        System.out.println("enter size");
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        String[] str=new String[n];

        for(int i=0;i<n;i++){
            str[i]=sc.nextLine();
        }
        length(str);
        
        
    }
    
}
