class linkedin{
    void like(){
        System.out.println("liking a post");
    }
}
class linkedin2 extends linkedin{
    void comment(){
        System.out.println("commenting on a post");
    }
}
public class override2 {
    public static void main(String[] args) {
        linkedin2 l2=new linkedin2();
        l2.like();
        l2.comment();
    }
    
}
