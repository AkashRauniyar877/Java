package oopsJava.Feb;

public class finalVariable {
    public static void main(String[] args) {
        final int a = 10;
       // a = 20; // This will cause a compile-time error because 'a' is final and cannot be reassigned.
        System.out.println("The value of a is: " + a);
    }
    
}
