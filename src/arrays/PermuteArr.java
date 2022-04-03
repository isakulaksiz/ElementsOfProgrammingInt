package arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PermuteArr {
    // Time Complexity: O(n!)
    // Space Complexity: O(n!)
    public void applyPermutation(List<Integer> perm, List<Integer> A){
        for(int i=0; i<A.size(); ++i){
            // Eğer perm.get(i) negatif değilse i indisinin  konumunu takip et
            int next = i;
            while (perm.get(next) >= 0){
                Collections.swap(A, i, perm.get(next));
                int temp = perm.get(next);
                perm.set(next, perm.get(next) - perm.size());
                next = temp;
            }
        }

        // restore
        for(int i=0; i<perm.size(); i++)
            System.out.println(perm.set(i, perm.get(i) + perm.size()));
        System.out.println(perm);
        System.out.println(A);
    }
    public static void main(String[] args){
        PermuteArr permuteArr = new PermuteArr();
        List<Integer> arrPerm = new ArrayList<>();
        List<Integer> arrTemp = new ArrayList<>();

        arrPerm.add(0,2);
        arrPerm.add(1,0);
        arrPerm.add(2,1);
        arrPerm.add(3,3);

        arrTemp.add(0,3);
        arrTemp.add(1,2);
        arrTemp.add(2,1);
        arrTemp.add(3,0);

        permuteArr.applyPermutation(arrPerm, arrTemp);
    }
}
