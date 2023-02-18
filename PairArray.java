public class PairArray {

    public static void Print(int arr[]){
        int totpair = 0;
        for(int i=0; i<arr.length;i++){
            for(int j=i+1; j<arr.length;j++){
                System.out.print(" (" + arr[i] + " "+ arr[j]+ ")");
                totpair++;
            }
            System.out.println();
            
        }
        System.out.print("Total Pair : " + totpair);
        //tp = n(n-1)/2
    }
    public static void main(String args[]){
        int arr[]= {2,4,6,8,10,12,14};
        Print(arr);

    
    
    
    }
    
}
