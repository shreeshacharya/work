
// import java.util.Scanner;

// public class foreach {
//     public static void main(String[] args) {
//         Scanner sc =new Scanner(System.in);
//         System.out.println("get the ma elel");
//         // int [] arr=ArrayUtility.inputArray();
//         int [] arr =new int [5];
//         for(int i=0;i<arr.length;i++){
//             arr[i]=sc.nextInt();
//         }
//         int max=Integer.MIN_VALUE;
//         for(int num:arr){
//             if(num>max){
//                 max=num;
//             }
//         }
//         System.out.println("max element is "+ max);
//     }
    
// }

import java.util.Scanner;
public class foreach {
    public static void main(String[] args) {

        int[] arr = ArrayUtility.inputArray(); // ✅ using your method
        
        int max = Integer.MIN_VALUE;

        for(int num : arr) {
            if(num > max) {
                max = num;
            }
        }

        System.out.println("Max element is: " + max);
    }
}
