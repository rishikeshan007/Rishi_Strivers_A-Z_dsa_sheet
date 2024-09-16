package Arrays_basics;
import java.util.*;

public class move_zeros_end {


    //brute force method..
    public static int[] move_zeros_end(int[]a){

        //temporary array:
        ArrayList<Integer> temp = new ArrayList<>();
        //copy non-zero elements
        //from original -> temp array:
        for (int i = 0; i < a.length; i++) {
            if (a[i] != 0)
                temp.add(a[i]);
        }

        // number of non-zero elements.
        int nz = temp.size();

        //copy elements from temp
        //fill first nz fields of
        //original array:
        for (int i = 0; i < nz; i++) {
            a[i] = temp.get(i);
        }

        //fill rest of the cells with 0:
        for (int i = nz; i < a.length; i++) {
            a[i] = 0;
        }
        return a;
    }

    //Optimal solution

    public static int[] move_zeros_end_2(int[]a){

        int j=-1;
        for(int i=0;i<a.length;i++){
            if(a[i]==0){
                j=i;
                break;

            }
        }
        //temporary array:
        ArrayList<Integer> temp = new ArrayList<>();
        //copy non-zero elements
        //from original -> temp array:
        for (int i = 0; i < a.length; i++) {
            if (a[i] != 0)
                temp.add(a[i]);
        }

        // number of non-zero elements.
        int nz = temp.size();

        //copy elements from temp
        //fill first nz fields of
        //original array:
        for (int i = 0; i < nz; i++) {
            a[i] = temp.get(i);
        }

        //fill rest of the cells with 0:
        for (int i = nz; i < a.length; i++) {
            a[i] = 0;
        }
        return a;
    }

    public static void main(String[] args) {
        int[]a = {1 ,0 ,2 ,3 ,0 ,4 ,0 ,1};
        move_zeros_end(a);
        for(int i=0;i< a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
        move_zeros_end_2(a);
        for(int j=0;j<a.length;j++){
            System.out.print(a[j]+" ");
        }

    }
}
