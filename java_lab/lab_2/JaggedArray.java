// AKASH RAUNIYAR
//Roll No: 2400320100120
package java_lab.lab_2;
import java.util.*;

public class JaggedArray {

   static void jaggedArray(int [][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows:");
        n = sc.nextInt();
        int [][] arr = new int[n][];
        for(int i=0;i<n;i++){
            System.out.print("Enter the number of columns for row " + i + ":");
            int m = sc.nextInt();
            arr[i] = new int[m];
        }
        System.out.println("Enter the elements of Jagged Array:");
        for(int i=0;i<n;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Jagged Array:");
        jaggedArray(arr);


      sc.close();  
    }
    
}
