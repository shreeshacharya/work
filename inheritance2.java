class wts1{
    void chat(){
        System.out.println("chatting");
    }
}
class wts2 extends wts1{
   
    void call(){
        System.out.println("calling");
    }
}
class wts3 extends wts2{
    void status(){
        System.out.println("statsus update");
    }
}




public class inheritance2 {
    public static void main(String[] args) {
        wts1 w1=new wts1();
    w1.chat();
    wts2 w2=new wts2();
    w2.chat();
    w2.call();
    wts3 w3=new wts3();
    w3.chat();  
    w3.call();
    w3.status();
        
    }
    
}
