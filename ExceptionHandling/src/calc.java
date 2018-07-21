import java.lang.*;
import java.util.*;
class calc{
public static void main(String args[])
{
    int a, b, c;
    char ch;
    do{

        Scanner s=new Scanner(System.in);

                System.out.print("1. Addition\n");
                System.out.print("2. Substraction\n");
                System.out.print("3. Multiplication\n");
                System.out.print("4. Division\n");
                System.out.print("5. Exit\n\n");

                System.out.print("Enter your choice : ");
                ch=s.next().charAt(0);
                    switch (ch)
                    {
                        case '1' :
                        Addition chose1=new Addition();
                        chose1.add();
                        break;

                        case '2' :
                        Substraction chose2=new Substraction();
                        chose2.sub();
                        break;

                        case '3' :
                        Multiplication chose3= new Multiplication();
                        chose3.multi();
                        break;

                        case '4' :
                        Division chose4=new Division();
                        chose4.divi();
                        break;

                        case '5' :
                        System.exit(0);
                        break;

                        default :
                        System.out.print("wrong choice!!!");
                        break;
                    }
        System.out.print("\n--------------------------\n");                     
    }while(ch !=5); 
}
}