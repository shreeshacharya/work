
abstract class mobile {

    abstract void osc();

    void calling() {

        System.out.println("Calling...");
    }
}



    class onrlus extends mobile {

    @Override
    void osc() {
        System.out.println("Android OS");
    }
}

class redmi extends mobile {

    @Override
    void osc() {
        System.out.println("MIUI OS");
    }
}

public class abstractt {

    public static void main(String[] args) {
        mobile m1 = new onrlus();
        m1.osc();
        m1.calling();

        mobile m2 = new redmi();
        m2.osc();
        m2.calling();
    }

}
