package arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
/*
* suppose you need to write a load test for a server. you've studied  the inter-arrival time of request to the server
* over a period of one year. from this data u have computed a histogram of the distribution of the inter arrival time of request
* In the load test you would like to generate request for the server  such that inter arrival times come from the same distribution
* that was observed in the historical data
* */
public class NonuniformRand {
    public static int nonuniformRandomNumberGeneration(List<Integer> values, List<Double> prob){
        List<Double> prefixSumOfProb = new ArrayList<>();
        prefixSumOfProb.add(0.0);

        for(double p: prob){
            prefixSumOfProb.add(prefixSumOfProb.get(prefixSumOfProb.size()-1) + p);
        }

        Random rand = new Random();
        final double uniform01 = rand.nextDouble();

        int it = Collections.binarySearch(prefixSumOfProb, uniform01);
        if(it < 0){
            final int intervalIdx = (Math.abs(it)-1)-1;
            return values.get(intervalIdx);
        }else
            return values.get(it);
    }
    public static void main(String[] args) {
        List<Integer> values = new ArrayList<>();
        values.add(3);
        values.add(5);
        values.add(7);
        values.add(11);
        List<Double> prob = new ArrayList<>();
        prob.add(0.5);
        prob.add(0.333);
        prob.add(0.11);
        prob.add(0.055);
        System.out.println(nonuniformRandomNumberGeneration(values, prob));
    }
}
