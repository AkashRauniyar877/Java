public class Operators {
    public static void main(String[] args) {
        
        int a = 10;
        int b = 2;
        System.out.println("Basic Arithmetic Operators:");
        System.out.println("Addition");
        System.out.println(+a+ " + " +b+ " = " + (a + b) );
        System.out.println("Subtraction");
        System.out.println(+a+ " - " +b+ " = " + (a - b) );
        System.out.println("Multiplication");
        System.out.println(+a+ " * " +b+ " = " + (a * b) );
        System.out.println("Division");
        System.out.println(+a+ " / " +b+ " = " + (a / b) );
        System.out.println("Modulus");
        System.out.println(+a+ " % " +b+ " = " + (a % b) );

         System.out.println("----------------------------");
        System.out.println("\nIncrement and Decrement Operators:");
        System.out.println("Post-increment: " + (a++));
        System.out.println("Pre-increment: " + (++a));

          System.out.println("----------------------------");
          System.out.println("Logical Operators:");
          System.out.println("AND:" + (a & b));

        System.out.println("OR:" + (a | b));

        
    }

    
}
