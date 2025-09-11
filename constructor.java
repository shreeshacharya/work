



public class constructor {
    int id;
    String name;
    constructor(int x,String n){
        id=x;
        name=n;
    }
    void dis(){
        System.out.println(id+""+name);
    }
    public static void main(String[] args) {
        constructor e = new constructor(1,"ram");
        constructor e1=new constructor(2,"sita");
        e.dis();
        e1.dis();
    }
    
}
