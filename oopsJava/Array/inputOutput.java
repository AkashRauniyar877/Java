package oopsJava.Array;

public class inputOutput {

   static void display(int [] arr){
         for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        
    }
    public static void main(String[] args) {
        int []arr = {1,3,5,7,9};
        display(arr);     
        }
    
}