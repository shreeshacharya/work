class base{
    void test(){
        System.out.println("test method in base class");
    }
}
class derived extends base{
    void test(){
        System.out.println("test method in derived class");
    }

    void dis(){
        System.out.println("dis method in derived class");

    }
}
public class inheritance {
    public static void main(String[] args) {
        // base b = new base();
        // b.test(); // Calls method from base class

        // derived d = new derived();
        // d.test(); // Calls method from derived class
        // d.dis();  // Calls method specific to derived class

        base bd = new derived();
        bd.test(); // Calls overridden method in derived class
    }
}





