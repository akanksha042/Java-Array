public class KadaneAlgorithm {


    public static void printMaxSum(int arr[]){
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;


        for(int i=0;i<arr.length;i++){
            currSum = currSum + arr[i];
            if(currSum < 0 ){
                currSum = 0;
            }
            maxSum = Math.max(currSum,maxSum);


        }
        System.out.print("Max Sum is  : " + maxSum);
    }
    public static void main(String args[]){
        int arr[]= {-2,-3,4,-1,-2,1,5,-3};
        printMaxSum(arr);  
  }
    
}
