import java.util.Arrays;

public class SumOfSubArray {
    public static void Print(int arr[]){
        
        for(int i=0; i<arr.length;i++){
            int sum=0;
            for(int j=i ;j<arr.length;j++){
                
                
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k] + " ");
                    
                    
                    
                }
                Arrays.sort(arr);
                
                sum = sum + arr[j];
                //System.out.println();
                System.out.print( "     Sum is : "+ sum+ " ");
                System.out.print("      MAX is " + arr[arr.length-1]);
                System.out.println();
            }
            //System.out.println();
            
            
        }
        
    }

    public static void main(String args[]){
        int arr[] = {2,4,6,8,10};
        Print(arr);
    }
    
}
