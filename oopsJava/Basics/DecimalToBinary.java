import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        int ans = 0;
        int pw = 1;

        Scanner ak = new Scanner(System.in);
        System.out.print("Enter a Decimal Number:");
        int r = ak.nextInt();

        while( r > 0){
            int parity = r % 2;
            ans += (parity * pw);
            pw *=  10;
            r = r / 2;
        }
        System.out.println("Binary Number:" +ans);
         ak.close();

    }
    
}
