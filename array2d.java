public class array2d{
public static void main(String[] args) {
    int[][] arr={{1,2,5},{2,5,9}};
    arr[0][0]=5;
    System.out.println(arr[1].length);
    System.out.println(arr[1][2]);

    int i=0;
    while(i<arr.length){
        int j=0;
        while(j<arr[i].length){
            System.out.print(arr[i][j]+"");
            
            j++;
        }System.out.println();
        i++;
    }

}}