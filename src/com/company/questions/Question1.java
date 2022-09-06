package com.company.questions;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Question1 {

    @Test
    @Tag("1")
    public static void multiplesOfThreeOrFive() {
        int limit = 1000;
        List<Integer> multipleArr = new ArrayList<>();

        for (int i = 1; i < limit; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                multipleArr.add(i);
            }
        }
        int count = multipleArr.stream().mapToInt(Integer::intValue).sum();
        System.out.println(count);
    }

    /*
    Each new term in the Fibonacci sequence is generated by adding the previous two terms.
    By starting with 1 and 2, the first 10 terms will be:

        1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...

    By considering the terms in the Fibonacci sequence whose values do not exceed four million,
    find the sum of the even-valued terms.
     */
    public static void fibonacciEvens() {
        long limit = 4000000;
        List<Long> fibonacciList = new ArrayList<>();
        List<Long> evenTerms = new ArrayList<>();
        long currentTerm = 1;
        fibonacciList.add(currentTerm);
        while (currentTerm < limit) {
            System.out.println("Current term is " + currentTerm);
            long localTerm = currentTerm;
            if (currentTerm % 2 == 0) {
                evenTerms.add(currentTerm);
            }
            currentTerm = fibonacciList.get(fibonacciList.size() - 1) + currentTerm;
            fibonacciList.add(localTerm);
        }
        long sum = evenTerms.stream().mapToLong(Long::longValue).sum();
        System.out.println(sum);
    }

    /*
    The prime factors of 13195 are 5, 7, 13 and 29.

    What is the largest prime factor of the number 600851475143 ?
     */
    public static void primeFactors() {

        long numberInQuestion = 600851475143L;
        List<Long> primeFactors = new ArrayList<>();

        for (long i = 1; i <= Math.sqrt(numberInQuestion); i++) {
            System.out.println(" i is " + i);
            if (numberInQuestion % i == 0) {
                System.out.println("Is a factor.");
                if (isPrime(i)) {
                    System.out.println("Is prime! " + i);
                    primeFactors.add(i);
                }
            }
        }

        //primeFactors.remove(numberInQuestion);
        long result = primeFactors.stream().max(Comparator.comparingLong(Long::longValue)).get();
        System.out.println("---> The result is ---> " + result);

    }

    private static boolean isPrime(long num) {
        BigInteger bigInteger = BigInteger.valueOf(num);
        return bigInteger.isProbablePrime(100);
    }
}
