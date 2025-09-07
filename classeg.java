 

    // Constructor must have the same name as the class
    




public class classeg {
    int capacity;

    // Constructor must have the same name as the class
    classeg(int x) {
        capacity = x;
    }

    public static void main(String[] args) {
        classeg c = new classeg(10);
        System.out.println("Container capacity: " + c.capacity);
         classeg d = new classeg(10);
        System.out.println("Container capacity: " + d.capacity);
    }
}
