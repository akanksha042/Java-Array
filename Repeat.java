public class Repeat {

    public static boolean print(int arr[]){
        for(int i=0 ; i<arr.length; i++){
            for(int j=i+1 ; j<arr.length;j++){
                if(arr[i] == arr[j]){
                    //System.out.println("true");
                    return true;
                }
                
            }
        }
        return false;
        
    }
    public static void main(String args[]){
        int arr[] = {1,2,3,2};
        System.out.println(print(arr));
        // print(arr);
        // if(print(arr) == false){
        //     System.out.println("FALSE");
        // }
        // else{
        //     System.out.println("TRUE");
        // }
    }
    
}
