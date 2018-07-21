public class StringtoCharWithoutbuiltinFunction{
  public static void main(String[] args)
  {
     String str = "RathodKiran";
     char[] chArray = new char[str.length()];
 
     for(int i=0; i<str.length(); i++){
        chArray[i] = str.charAt(i);
     }
 
     for(char ch : chArray){
        System.out.print(ch);
     }
  }
}
