class a{
    void text(){
        System.out.println("texting");
    }
}
class b extends a{
    void call(){
        System.out.println("calling");
    }
}
class c extends b{
    void status(){
        System.out.println("status update");
    }
}



public class inheritanc3 {
    public static void main(String[] args) {
        a a1=new a();
        b b1=new b();
        c c1=new c();
        c1.call();
        c1.text();
    }
    
}
