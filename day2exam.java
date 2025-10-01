
import java.util.Scanner;

public class day2exam {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n;
        System.out.println("enter array size");
        n=in.nextInt();
        int[] a=new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("enter the element"+(i+1)+":");
            a[i]=in.nextInt();
            
        }
        int[] sort=new int[n]; 
        for (int i = 0; i < n; i++) {
            sort[i]=a[i];
            
        }
        for (int i = 0; i < n; i++) {
            for(int j=0;j<n;j++){
                if(a[i]<a[j]){
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
 

                }
            }
            
        }
        
        System.out.println("Maximum element is="+a[n-1]);
      System.out.println("2nd largest element is="+a[n-2]);
      int count=0;
      for (int i = 0; i < n; i++) {
        if(a[i]==2){
            System.out.println("the element 2 is present in array");
            break;
        }}
              for (int i = 0; i < n; i++) {

         if(a[i]==2){
            count++;
        }
          
      }
      System.out.println("total 2 present in array="+count);
      int res=1;
      for (int i = 0; i < n-1; i++) {
            if(sort[i]>sort[i+1]){
                res=0;
                break;
            }}
            System.out.println(res==1 ? "array is sorted":"array is not sorted");
            if(res==0){
            System.out.println("sorted array is");
            
            for (int i = 0; i < n; i++) {
                System.out.print(" "+a[i]);
                
            }}
           
        
          
      
         
    }
}
