public class Main{
  public static void sayHello(int num){
    if(num<=1){
      return;
      sayHello(num-1);
      System.out.println("Hello!! ");
  }
  public static void main(String [] args){
    sayHello(4);
  }
}
