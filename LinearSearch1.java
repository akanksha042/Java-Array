import java.util.Scanner;

public class LinearSearch1 {

    public static int print(int numbers[], int target){
        for(int i=0; i<numbers.length;i++){
            if(numbers[i] == target)
            return i;
        }

        return -1;

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int numbers[] = {2,4,6,8,10,12,14,16};
        System.out.print("Enter the target value : ");
        int target = sc.nextInt();
        int ans = print(numbers,target);
        if(ans == -1){
            System.out.println("Not Found");
        }
        else {
            System.out.println("Target is at : " + ans);
        }
        

    }
    
}
