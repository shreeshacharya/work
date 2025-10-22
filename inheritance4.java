class vehicle{
    void vehicle(){
        System.out.println("my vehicle");
    }
}
class car extends vehicle{
    void car(){
        System.out.println("my car");
    }
}
class bus extends vehicle{
    void bus(){
        System.out.println("my bus");
    }
}
class fav extends bus{
    void fav(){
        System.out.println("my favorite vehicle");
    }

}





public class inheritance4 {
public static void main(String[] args) {
    fav f1=new fav();
    f1.vehicle();
    f1.bus();

    car c1=new car();
    c1.vehicle();
    c1.car();
    
}    
    
}
