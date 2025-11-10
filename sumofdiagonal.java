
import java.util.Scanner;

public class sumofdiagonal {
    public static int left(int[][] arr){
        int sum=0,i=0;
        while(i<arr.length){
            sum+=arr[i][i];
            i++;
        }
        
        return sum;
    }
    public static int right(int[][] arr){
        int sum=0,i=0;
        while(i<arr.length){
            int col=arr.length-1-i;
            sum+=arr[i][col];
            i++;

        }
        return sum;
    }
    public static int totalsum(int[][] arr){
        int sum=0;
        int left=left(arr);
        int right=right(arr);
        sum+=left+right;
        if(arr.length%2!=0){
            int mid=arr.length/2;
            sum-=arr[mid][mid];
            

        }

        return sum;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int row,col;
        System.out.println("enter row n col");
        row=sc.nextInt();
        col=sc.nextInt();
        int[][] arr=new int[row][col];
        System.out.println("enter ele");
        // while(i<row){
        //     int j=0;
        //     while(j<arr[i].length){
        //         arr[i][j]=sc.nextInt();
        //         j++;
        //     }i++;
        // }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j]=sc.nextInt();

            }
        }
        int res=totalsum(arr);
        System.out.println(res);
       
        
    }
    
}
