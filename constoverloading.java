public class constoverloading {
    double price;
    String company;
    int model;
    constoverloading(int x){
        model=x;
        System.out.println(model);
    }
   constoverloading(String name){
        company =name;
        System.out.println(company);
    }
    constoverloading(double val){
        price=val;
        System.out.println(price);
    }
    public static void main(String[] args) {
        constoverloading c1 = new constoverloading(2022);
       constoverloading c2 = new constoverloading("Toyota");
        constoverloading c3 = new constoverloading(30000.50);
    }
    
}
