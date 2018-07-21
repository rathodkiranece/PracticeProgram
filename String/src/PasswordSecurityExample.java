public class PasswordSecurityExample {
 
    public static void main(String[] args) {
 
        char[] password = { 'p', 'a', 's', 's', 'w', 'o', 'r', 'd' };
 
        // Changing value of all characters in password
        for (int i = 0; i < password.length; i++) {
            password[i] = 'x';
        }
 
        System.out.print("New Password - ");
        // Priniting new Password
        for (int i = 0; i < password.length; i++) {
            System.out.print(password[i]);
        }
    }
}