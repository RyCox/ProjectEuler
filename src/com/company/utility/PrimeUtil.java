package com.company.utility;

import java.math.BigInteger;

public class PrimeUtil {

    public boolean isPrime(long num) {
        BigInteger bigInteger = BigInteger.valueOf(num);
        return bigInteger.isProbablePrime(100);
    }
}
