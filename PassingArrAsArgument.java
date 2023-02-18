import javax.swing.plaf.synth.SynthSplitPaneUI;

public class PassingArrAsArgument {



    public static void  update(int marks[], int nonChangeable){
        //here we chnage the value of unchangeable but main mai print hote time usski value update nhi hui
        nonChangeable =10;
        for(int i=0; i<marks.length;i++){
            marks[i] = marks[i] + 1 ;
        }
    }
    public static void main(String args[]){
        int marks[] = {99,88,97,98};
        int nonChangeable = 5;
        update(marks, nonChangeable);
        //print
        //pass by value nonchangeable ki value chamge nhi hui
        System.out.println(nonChangeable);
        //array always use pass arg by refernece 
        for(int i=0; i<marks.length;i++){
            System.out.print(marks[i] + " ");
        }
        System.out.println();
        }
    }
    

