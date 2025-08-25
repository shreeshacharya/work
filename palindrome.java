
import java.util.Scanner;

public class palindrome {

    public static int reverse(int num){
        int newno=0;
        while(num>0){
            int rem=num%10;
            newno=newno*10+rem;
            num=num/10;
        }
        return newno;
    }

    public static boolean ispalindrome(int num){
        int res=reverse(num);
        if(res==num){
            return true;
        }


        return false;

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("eneter no");
        int no= sc.nextInt();
        if(ispalindrome(no)){
            System.out.println("its a palindrome");
        }else{
            System.out.println("not");
        }
    }
    
}
