package java4s;
 
public class MyOwnExceptionClass extends Exception {
 
    private int price;
 
    public MyOwnExceptionClass(int price){
        this.price = price;
    }
 
    public String toString(){
        return "Price should not be in negative, you are entered" +price;
    }
 
}