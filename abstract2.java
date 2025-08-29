abstract class bankk{
    abstract void acc();

    void account() {
        System.out.println("account  set!");
    }
}
 class savings extends bankk {

    @Override
    void acc() {
        System.out.println("Savings Account");
    }   }
    class current extends bankk {

    @Override
    void acc() {
        System.out.println("Current Account");
    }}






public class abstract2 {
    public static void main(String[] args) {
        bankk b1 = new savings();
        b1.acc();
        b1.account();

        bankk b2 = new current();
        b2.acc();
        b2.account();
    }
    

}
