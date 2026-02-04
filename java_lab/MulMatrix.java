package java_lab;

import java.util.Scanner;

public class MulMatrix {
    public static void main(String[] args) {
        
         int m, n, p, q;
           Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows of first Matrix:");
        m = sc.nextInt();
         System.out.print("Enter the number of column of first Matrix:");
         n = sc.nextInt();
         int arr1[][] = new int[m][n];
         System.out.println("Enter the elements of First Matrix: ");
         for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                  arr1[i][j] = sc.nextInt();
            }
         }
         // 2nnd Matrix
         System.out.print("Enter the number of rows of second Matrix:");
        p = sc.nextInt();
         System.out.print("Enter the number of column of second Matrix:");
         q = sc.nextInt();
         int arr2[][] = new int[p][q];
         System.out.println("Enter the elements of Second Matrix: ");
         for(int i=0;i<p;i++){
            for(int j=0;j<q;j++){
                  arr2[i][j] = sc.nextInt();
            }
         }
         //Multiplication Matrix
          int [][] arr3 = new int[m][q];
         if(n==p){
           
            for (int i = 0; i < m; i++) {      
              for (int j = 0; j < q; j++) {   
                   arr3[i][j] = 0;
                  for (int k = 0; k < n; k++) {
                       arr3[i][j] += arr1[i][k] * arr2[k][j];
                    }    
                }
            }
        }
        else{
            System.out.println("Matrix Multiplication is not possible::");
        }

         System.out.println("Resultant Matrix:");
         for (int i = 0; i < m; i++) {
            for (int j = 0; j < q; j++) {
               System.out.print(arr3[i][j] + " ");
            }
            System.out.println();
        }


        sc.close();
         
    }
    
}
