
public class MaxInArray {
    public static void main(String[] args) {
         int[] arr = {1,3,7,8,2,4,12,14,13};
        // int max = Arrays.stream(arr).max().getAsInt();
        // System.out.println("Maximum element: " + max);

        // int count=0;
        // for(int i=0;i<arr.length;i++){
        //     if(arr[i]==2){
        //         count++;
        //     }
        //     }
        // System.out.println("Count of 2 in array: " + count);


        boolean isSorted = false;

        for(int i=0;i<arr.length-1;i++){
            if(arr[i]<=arr[i+1]){
                isSorted = true;
            }
            }
        if(isSorted) {
            System.out.println("Array is sorted");}
            else{
            System.out.println("Array is  not sorted");
            }


}}
 
