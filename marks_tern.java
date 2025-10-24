public class marks_tern{
    public static void marks(int marks ){
        String res=marks>80?"high":(marks>50?"mid":"low");
        System.out.println(res);

       
    
}
public static void main(String[] args) {
    marks(57);
}
}