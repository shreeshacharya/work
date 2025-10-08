public  class hollowsquare {
    public static void main(String[] args) {
        int n = 10;
        // for(int i = 0; i < n; i++) {
        //     for(int j = 0; j < n; j++) {
        //         if(i == 0 || i == n-1 || j == 0 || j == n-1) {
        //             System.out.print("* ");
        //         } else {
        //             System.out.print("  ");
        //         }
        //     }
        //     System.out.println();

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(i-j== 0 || i +j==n-1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        
        // System.out.println("gm starts");
        // while(n>0){
        //     System.out.println(n);
        //     n=n-3;
        // }
        // System.out.println("gm ends");

        
        System.out.println("gm starts");
        do{
        
            System.out.println(n);
            n=n-3;
        }while (n>0) ;
        System.out.println("gm ends");


    }
}
 
