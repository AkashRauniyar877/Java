import java.util.Scanner;
import Mathematics.Matrix;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Matrix m = new Matrix();

        System.out.print("Enter rows and columns: ");
        int r = sc.nextInt();
        int c = sc.nextInt();

        int[][] A = new int[r][c];
        int[][] B = new int[r][c];

        System.out.println("Enter elements of Matrix A:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter elements of Matrix B:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                B[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nAddition:");
        int[][] sum = m.add(A, B);
        m.display(sum);

        System.out.println("\nSubtraction:");
        int[][] diff = m.subtract(A, B);
        m.display(diff);

        sc.close();
    }
}