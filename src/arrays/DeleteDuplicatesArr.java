package arrays;

import java.util.ArrayList;
import java.util.List;

public class DeleteDuplicatesArr {
    public static int deleteDuplicates(List<Integer> A){
        if(A.isEmpty())
            return 0;
        int writeIndex = 1;
        for(int i=1; i<A.size(); ++i){
            if(!A.get(writeIndex -1).equals(A.get(i)))
                A.set(writeIndex++, A.get(i));
        }
        return writeIndex;
    }

    public static void main(String[] args){
        List<Integer> arrList = new ArrayList<Integer>();
        arrList.add(0,2);
        arrList.add(1,3);
        arrList.add(2,5);
        arrList.add(3,5);
        arrList.add(4,7);
        arrList.add(5,11);
        arrList.add(6,11);
        arrList.add(7,11);
        arrList.add(8,13);

        System.out.println(deleteDuplicates(arrList));
    }
}
