package oopsJava.Array;

public class MaxElement {

   static void maxElement(int [] arr){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("Max Element: " + max);
    }

    
    public static void main(String[] args) {
        int []arr = {1,3,5,7,9};
        
        maxElement(arr);
       
    }
    
}