package com.company.questions;

import com.company.Configuration;

import java.util.ArrayList;
import java.util.List;

public class Question10 extends Configuration {

    /*
    The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.

    Find the sum of all the primes below two million.
     */
    public static void sumOfPrimes(long belowThis) {

        List<Long> primeList = new ArrayList<>();

        for (long i = 1; i < belowThis; i++) {
            if (pUtil.isPrime(i)) {
                primeList.add(i);
            }
        }
        System.out.println(primeList.stream().mapToLong(Long::longValue).sum());
    }
}
