
import java.util.*;

import javax.print.attribute.standard.NumberUpSupported;
public class Largest {
    public static int PrintLargest(int number[]){
        int largest = Integer.MIN_VALUE; //-infinity
        int smallest = Integer.MAX_VALUE;
        for(int i=0;i<number.length;i++){
            if(number[i]>largest){
                largest = number[i];
            }

            if(number[i]< smallest){
                smallest = number[i];
            }

        }
        System.out.println("smallest Element is : " + smallest);
        return largest;
        //return smallest;
    }

    public static void main(String args[]){
        int[] number = {-1,2,3,4,9,6,5};
        //int ans = PrintLargest(number);
        //System.out.println("Largest Element is : " + ans);
        //alternative 
        System.out.println("Largest Element is : " + PrintLargest(number));

    }
    
}
