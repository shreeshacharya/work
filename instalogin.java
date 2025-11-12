class instagram{
    void login(String email, String password){
        System.out.println("Logged in with email: " + email);
    }
    void login(long phoneno,int otp){
        System.out.println("Logged in with phone number: " + phoneno );
    }
}






public class instalogin {
    public static void main(String[] args) {
        instagram insta = new instagram();
        insta.login(988089084L,23455);
        insta.login("shreesha@gmail.com","23455");
    }
    
}
