public class LinearSearch {


    public static int print(String list[], String target,int index){
        for(int i = 0 ; i<list.length;i++){
            if(list[i] == target){
                return i;
                // System.out.println(list[i] + " is on " + (i));
                
            }
            
            
        }
        return -1;
        
    }
    public static void main(String args[]){
        String list[] = {"Dosa" , "Idli", "Samosa", "Frooti", "Pasta"};
        int index=0;
        String target = "Frooti";
        int ans = print(list, target, index);
        if(ans == -1){
            System.out.println("Not found");
        }
        else {
            System.out.println(target + " is at " + ans);

        }
        

    }
    
}
