import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        int first = 0;
        int second = 1;
        int next;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of terms:");
        int n = sc.nextInt();

        System.out.println("Fibonacci sequence for " + n + " terms:");
        for (int i = 0; i < n; i++) {
            System.out.println(first);
            next = first + second;
            first = second;
            second = next;
        }

    }
}
