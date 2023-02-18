public class PrintSubarray {

    public static void Print(int arr[]){
        int totSubArr =0;
        
        for(int i=0; i<arr.length;i++){
            for(int j=i ; j<arr.length ;j++){
                for(int k=i; k<j ;k++){
                    System.out.print(arr[k] + " ");    
                }
                System.out.println();
            }
            
           // System.out.println();
        }
        System.out.print("Total SubArray is : " + totSubArr);

    }
    public static void main(String args[]){
        int arr[] = {2,4,6,8,10};
        Print(arr);



    }
    
}
