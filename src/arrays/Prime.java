package arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Prime {
    public static List<Integer> generatePrimes(int n){
        List<Integer> primes = new ArrayList<Integer>();
        List<Boolean> isPrime = new ArrayList<Boolean>(Collections.nCopies(n+1, true));
        // isPrime
        isPrime.set(0,false);
        isPrime.set(1, false);

        for(int p=2; p<=n; ++p){
            primes.add(p);
            for(int j=p; j<=n; j+=p){
                isPrime.set(j,false);
            }
        }
        return primes;
    }

    public static void main(String[] args){
        int value;
        Scanner sc = new Scanner(System.in);
        value = sc.nextInt();
        System.out.println("value : " + value);
        System.out.println(generatePrimes(value));
    }
}
