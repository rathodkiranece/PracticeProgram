//Java program to illustate prefering char[] arrays 
//over strings for passwords in Java
public class PasswordPreference
{
  
    public static void main(String[] args) 
    {
  
        String strPwd = "password";
        char[] charPwd = new char[] {'p','a','s','s','w','o','r','d'};
         
        System.out.println("String password: " + strPwd );
        System.out.println("Character password: " + charPwd );
    }
}