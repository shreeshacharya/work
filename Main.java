class Student {
    String name;

    // Constructor
    Student(String n) {
        name = n;
    }

    // Method
    void greet() {
        System.out.println("Hello, my name is " + name);
    }
}

public class Main {
    public static void main(String[] args) {
        Student c = new Student("Sita");  // Constructor called
        c.greet();                        // Method called
    }
}



// This is a separate class
// class Student {
//     // Constructor
//     Student() {
//         System.out.println("Constructor called");
//     }

//     // Method
//     void study() {
//         System.out.println("Studying");
//     }
// }

// // Main class
// public class MainClass {
//     public static void main(String[] args) {
//         Student s = new Student();  // calls constructor from Student class
//         s.study();                  // calls method from Student class
//     }
// }

