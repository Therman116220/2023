public class incrementation {

  

public static void main(String[] args) {
    
    int var = 5;
 System.out.println("var++ :");
    System.out.println(++var);
     System.out.println("++var :");

    System.out.println(var++);
  
    int b = var++;
  System.out.println(b);

System.out.println("var++ + ++var:");
    int c = var++ + ++var;
    System.out.println(c);

}
 }