package oopsJava.Array;

import java.util.Scanner;

public class ArrayAddition {

    public static void main(String[] args) {
        int n,m;
        System.out.print("Enter the number of Rows:");
        Scanner sc = new Scanner(System.in);    
        n = sc.nextInt();
        System.out.print("Enter the number of Columns:");
        m = sc.nextInt();
        int[][] array1 = new int[n][m];
        int[][] array2 = new int[n][m];
        System.out.println("Enter the elements of first array:");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                array1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the elements of second array:");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                array2[i][j] = sc.nextInt();
            }
        }
        int[][] sumArray = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                sumArray[i][j] = array1[i][j] + array2[i][j];
            }
        }
        System.out.println("The sum of the two arrays is:");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(sumArray[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
    
}
