package arrays;

import java.util.ArrayList;
import java.util.List;

public class ArbitraryPrecisionInt {
    public static List<Integer> plusOne(List<Integer> A){
        int n = A.size()-1; // length
        System.out.println("n" + n);
        A.set(n, A.get(n) + 1);
        for(int i=n; i>0 && A.get(i) == 10; --i){

            System.out.println("A.set(i,0)" + A.set(i,0));
            System.out.println("A.set(i-1, A.get(i-1) + 1)"+ A.set(i-1, A.get(i-1) + 1));
        }

        if(A.get(0) == 10){
            System.out.println("A.set(0,0)" + A.set(0,0));
            A.add(0,1);
        }

        return A;
    }


    public static void main(String[] args){
        List<Integer> arrList = new ArrayList<Integer>();
        arrList.add(0,1);
        arrList.add(1,2);
        arrList.add(2,9);

        System.out.println("__________");
        System.out.println(plusOne(arrList));
        System.out.println("__________");
    }
}
