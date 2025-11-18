// 5. Create a class Biggest that contains a single-dimensional array as a data member and a method display() to find and display the largest element of the array.
import java.util.*;
public class Biggest {

    private int[] arr;

    Biggest(int[] n){
        arr= n;
    }
    void displayLargest(int[] arr){
      if(arr==null || arr.length == 0 ){
        System.out.println("Array is Empty");

      }else{
        int l =arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>l) l=arr[i];
        }
        System.out.println("Largest "+ l);
      }
        
    }
    public static void main(String[] args) {
        int[] arr = {1,34,222,4,1,222};
        Biggest b = new Biggest(arr);
        b.displayLargest(arr);
    }
}