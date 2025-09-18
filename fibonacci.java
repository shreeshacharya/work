
import java.util.Scanner;

public class fibonacci{
    public static void main(String[] args) {
        int first=0;
        int second=1;
        int next;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a no");
        int n=sc.nextInt();
        System.out.println("so the fibonacci sequence for the "+n+"term are:");
        for(int i=0;i<n;i++){
            System.out.println(first+"");
            first=second;
            next=first+second;
            second=next;

        }
    }
}