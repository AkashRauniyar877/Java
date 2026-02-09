import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        int ans = 0;
        Scanner ak = new Scanner(System.in);
        System.out.println("Enter a Binary Number:");
        int r = ak.nextInt();
        int pw = 1;

        while( r > 0){
             ans += (r % 10) * pw;
            r = r/10;
             pw = pw * 2;
        }
        

          System.out.println("Decimal Number: " +ans);
  ak.close();
    }
    
}
