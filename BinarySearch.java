import java.util.*;
public class BinarySearch {

    public static int FindKey(int arr[], int key){
        int start =0;
        int end = arr.length -1;
        while(start<=end){
            int mid = (start+end)/2;

            //comparision
            if(arr[mid]==key){
                return mid;
            }
            if(arr[mid]<key){ //right
                start = mid+1;

            }
            else{ //left
                end  = mid-1;
            }
        }
        return -1;
        //mid = (start + end)/2;
        
    }
    public static void main(String args[]){
       
        int []arr = {2,4,6,8,10,12,14,16,18};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Key you want to Find : ");

        int key = sc.nextInt();
        int ans = FindKey(arr, key);
        if(ans == -1){
            System.out.println("Element is not Present in the Array");
        }
        else{
            System.out.println("Index for key " + key + " is " + ans);
        }
        // System.out.println(ans);
        
        //System.out.print("Index for key is : " + FindKey(arr, key));
        
        
    }
    
}
