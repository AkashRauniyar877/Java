package oopsJava.Array;

public class SecondMaxElement {

       static void display(int [] arr){
         for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        
    }

       static int maxElement(int [] arr){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
       return max;
    }
     
    static int SecondMax(int []arr){
        int n = arr.length;
        int a = maxElement(arr);
        for(int i=0;i<n;i++){
            if(arr[i]== a){
                arr[i]=Integer.MIN_VALUE;
            }
        }
        int secondmax = maxElement(arr);
        return secondmax;

    }
    public static void main(String[] args) {
        int []arr = {1,3,5,7,9};
        display(arr);   
        System.out.println();
        System.out.println("Maximum Number is: " + maxElement(arr));
      System.out.println("Second Maximum Number is: " + SecondMax(arr));

      }
}
