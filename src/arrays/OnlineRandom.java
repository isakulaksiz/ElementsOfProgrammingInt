package arrays;

import java.util.*;

public class OnlineRandom {

    // k elemanı kadar bir listemiz olduğunu varsayalım
    public static List<Integer> onlineRandomSamole(Collection<Integer> sequence, int k){
        Iterator<Integer> iterator = sequence.iterator();
        List<Integer> runningSample = new ArrayList<>(k);
        for(int i=0; iterator.hasNext() && i<k; ++i){
            runningSample.add(iterator.next());
        }

        // ilk k elementini al
        int numSeenSoFar = k;
        Random randIxgen  = new Random();
        while(iterator.hasNext()){
            Integer x = iterator.next();
            ++numSeenSoFar;

            final int idxToReplace = randIxgen.nextInt(numSeenSoFar);
            if(idxToReplace < k){
                runningSample.set(idxToReplace, x);
            }
        }
        return runningSample;
    }

    public static void main(String[] args) {
        int k = 5;
        List<Integer> sequence = new ArrayList<>(k);
        sequence.add(1);
        sequence.add(2);
        sequence.add(2);
        sequence.add(4);
        sequence.add(2);

        System.out.println("output: "+ onlineRandomSamole(sequence,k));
    }

}
