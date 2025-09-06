
public class checksort {

    public static boolean checksort(int[] arr) {
        int n=arr.length;
        int low=arr[0];
        int high=arr[n-1];
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {2,  3, 4};
        // boolean issorted =true;
        // for(int i=0;i<arr.length;i++){
        //     if(arr[i]>arr[i+1]){
        //         issorted=false;
        //         break;

        //     }
        // }


        boolean issort=checksort(arr);
        System.out.println(checksort(arr));
        if(issort){
            System.out.println("sorted");
        }else{
            System.out.println("not sorted");
        }
    }
}
