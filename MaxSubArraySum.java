public class MaxSubArraySum {

    public static void PrintMax(int arr[]){
        int currSum =0;
        int MaxSum = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length;j++){
                currSum = 0;
                //important k<=end 
                for(int k=i;k<=j;k++){
                    currSum += arr[k];


                }
                System.out.println(currSum);
                if(MaxSum<currSum){
                    MaxSum = currSum;
                }
                
            }
        }
        System.out.print("MaxSum is : "+MaxSum);
    }
    public static void main(String args[]){
        int arr[]= {1, -2, 6, -1, 3};
        PrintMax(arr);

    }
    
}
