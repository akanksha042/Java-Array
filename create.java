import java.util.*;

public class create{
    public static void main(String args[]){
        // creation of array
        Scanner sc = new Scanner(System.in);

        int marks[] = new int[6];
    
        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();
        marks[4] = sc.nextInt();
        marks[5] = sc.nextInt();
        System.out.println("phy : " + marks[0]);
        System.out.println("chem : " + marks[1]);
        marks[2]= marks[2] +5;
        System.out.println("math : " + marks[2]);
        System.out.println("cs : " + marks[3]);
        System.out.println("eng : " + marks[4]);
        System.out.println("vc : " + marks[5]);
        int percentage = (marks[0] +marks[1] +marks[2] +marks[3]+ marks[4]+ marks[5]) / 5;
        System.out.println("Percentage is : " + percentage + "%");
       
        // int n = sc.nextInt(); //size of array
        // int arr[] = new int[n];
        // for(int i =0;i<n;i++){
        //     System.out.println("enter the elements of arr : ");
        //     arr[i] = sc.nextInt();
        //     System.out.println(arr[i]);
        // }
        // System.out.println(arr);
    }
}