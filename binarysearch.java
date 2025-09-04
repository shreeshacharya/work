import java.util.Arrays;

public class binarysearch {

    // public static int binarysearch(int[] arr, int num) {
    //     Arrays.sort(arr);
    //     int low = 0;
    //     int high = arr.length;
    //     while (low <= high) {
    //         int mid = (low + high) / 2;
    //         if (arr[mid] == num) {
    //             return mid;
    //         }
    //         if (arr[mid] < num) {
    //             low = mid + 1;
    //         } else {
    //             high = mid - 1;
    //         }
            

    //     }
    //     return -1;
    // }

    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 3, 9};
        int num=3;
        int n=arr.length;
        Arrays.sort(arr);
        int low=arr[0];
        int high=arr[n-1];
        while(low<=high){
            int mid=(low+high)/2;

            if(num==mid){
                System.out.println("ele found at "+mid);
                break;
            }else if(num<mid){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        // int num = binarysearch(arr, 3);
        // System.out.println("is present at "+num);

    }

}
