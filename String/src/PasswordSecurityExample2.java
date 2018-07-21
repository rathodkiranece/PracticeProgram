public class PasswordSecurityExample2 {
 
    public static void main(String[] args) {
 
        String password = "password";
        char[] password2;
 
        System.out.println("Printing String -> " + password);
 
        password2 = password.toCharArray();
        System.out.println("Printing Char Array -> " + password2);
    }
}