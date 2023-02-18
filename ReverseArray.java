import java.util.*;

// public class ReverseArray {
//     public static void Reverse(int arr[]){
//         int first = 0;
//         int last = arr.length - 1 ;
//         while(first<last){
//             int temp = arr[last];
//             arr[last] = arr[first];
//             arr[first] = temp;

//             first++;
//             last--;
//         }
         
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int numbers[] = {2,4,6,8,10,12,14,16};
//         Reverse(numbers);
//         for(int i=0; i<numbers.length;i++){
//             System.out.print(numbers[i]+ " ");
//         }
//         System.out.println();

//     }
    
// }






public class ReverseArray {
    public static void revarr(int arr[]){
       
        int f=0,l=arr.length-1;
        while(f<l){
              int temp=arr[l];
                arr[l]=arr[f];
                arr[f]=temp; 
                f++;
                l--;
        }
    }
    
    public static void main(String[] args) {
     int arr[]={2,4,8,10};
     revarr(arr);
     for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]);
     }
     
    }
}
