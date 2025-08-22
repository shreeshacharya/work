
import java.util.Scanner;

public class armstrong{
    public static int arm(int no){
        int count=0;
        while(no>0){
            no=no/10;
            count++;
        }
        return count;
    }
    public static boolean power(int nom){
        int power=arm(nom);
        int sum=0;
        int temp=nom;
        while(temp>0){
            int rem=temp%10;
            temp/=10;
            sum+=Math.pow(rem,power);


        }
        return nom==sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("eneter a no");
        int no=sc.nextInt();
        if(power(no)){
            System.out.println(no+"its armstrong");
        }
        else{
            System.out.println(no+"not an armstrong");
        }

    }
}