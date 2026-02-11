package java_lab.lab_2;
import java.util.*;

public class PrimeNumber {

    static void prime(int n){
      int count = 0;
      for(int i=1;i<=n;i++){
        if(n % i == 0){
            count++;
        }
    }
    if(count == 2){
        System.out.println("Prime Number");
    }
    else{
        System.out.println("Not Prime Number");
    }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter a number to check Prime Number::");
        n = sc.nextInt();
        prime(n);


       sc.close(); 
    }
    
}
