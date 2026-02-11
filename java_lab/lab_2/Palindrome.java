package java_lab.lab_2;
import java.util.*;
public class Palindrome {
    static void  Palindrom(int n){
        int a = n;
        int num = 0;
        while(n>0){
          
            int r = n % 10;
            num = num * 10 + r;
            n = n / 10;
        }
        if(a == num){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
      
    }
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to Check Palindrom:");
        n = sc.nextInt();
        Palindrom(n);


      sc.close();  
    }   
}
