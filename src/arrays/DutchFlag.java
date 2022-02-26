package arrays;

import java.util.Collections;
import java.util.List;

public class DutchFlag {
    public static enum Color{ RED, WHITE, BLUE}
    public static void dutchFlagPartition(int pivotIndex, List<Color> A){
        Color pivot = A.get(pivotIndex);
        for(int i=0;i<A.size();++i){
            for(int j=i+1; j<A.size();++j){
                if(A.get(j).ordinal() < pivot.ordinal()){
                    Collections.swap(A,i,j);
                    break;
                }
            }
        }

        for(int i= A.size()-1; i>=0 && A.get(i).ordinal()>=pivot.ordinal(); --i){
            for(int j=i-1;j>=0 && A.get(j).ordinal() >= pivot.ordinal(); --j){
                if(A.get(j).ordinal() > pivot.ordinal()){
                    Collections.swap(A,i,j);
                    break;
                }
            }
        }
    }
}
