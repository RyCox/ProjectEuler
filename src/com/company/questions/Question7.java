package com.company.questions;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class Question7 {

    public long countPrimes(int index) {

        List<Long> primeList = new ArrayList<>();

        for (int i = 1; primeList.size() < index; i++) {
            if (BigInteger.valueOf(i).isProbablePrime(100)) {
                primeList.add((long) i);
            }
        }
        return primeList.get(primeList.size() - 1);
    }
}
