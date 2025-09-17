
class parent {

    String name;

    parent(String name) {
        this.name = name;
        System.out.println("Parent class constructor: " + name);
    }
}

class child extends parent {

    int age;

    child(int x) {
        super("siva");
        this.age = x;
    }
}// Calls the parent class constructor

public class extendss {

    public static void main(String[] args) {
        parent p = new parent("ParentName");
        child c = new child(10);
        System.out.println("Child class age: " + c.age);
    }

}
