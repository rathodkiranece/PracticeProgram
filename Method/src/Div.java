class Div{

public static int div_2(int a){
  if(a%2==0){
    return 1;
  }
  else{
    return 0;
  }
}

public static void div_6(int b){
  if( div_2(b)==1 && b%3 == 0 ){
    System.out.print("Yes, the number is divisible by 6.\n");
  }
  else{
    System.out.print("No, the number is not divisible by 6.\n");
  }
}

public static void main(String[] args){
  div_6(12);
  div_6(25);
}
}