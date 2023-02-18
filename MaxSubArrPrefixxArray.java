public class MaxSubArrPrefixxArray {
    public static void PrintMax(int arr[]){
        int currSum=0;
        int prefix[] = new int[arr.length];
        int maxSum = Integer.MIN_VALUE;
        prefix[0] = arr[0];
        //prefix array ko bhar rahi hu with sums till that index
        for(int i=1;i<prefix.length;i++){
            prefix[i] = arr[i] + prefix[i-1];
        }

        for(int i=0;i<arr.length;i++){
            int start = i;
            
            for(int j=i ;j<arr.length;j++){
                int end = j;

                //since i is starting from i =0 so agar start 0 se hua toh 0-1 =>-1 which can lead to error 
                //so we will use ternary operator
                //agar start ==0 hua toh mera kuch minus mat karo
                //ab shirf end tak sum cal karo bs
                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];

                if(currSum > maxSum){
                    maxSum = currSum;
                }

            }
        }
        System.out.print("MaxSum is : " + maxSum);
    }
    public static void main(String srgs[]){

        int []arr= {1, -2, 6, -1,3};
    PrintMax(arr);    }
    
}
