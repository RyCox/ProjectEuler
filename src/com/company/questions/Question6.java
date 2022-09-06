package com.company.questions;

import java.util.ArrayList;
import java.util.List;

public class Question6 {
    /*
        The sum of the squares of the first ten natural numbers is,
        The square of the sum of the first ten natural numbers is,
        Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is .
        Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
     */
    public int question6(int limit) {

        List<Integer> numList = new ArrayList<>();

        for (int i = 1; i <= limit; i++) {
            numList.add(i);
        }

        List<Integer> squares = new ArrayList<>();
        numList.forEach(num -> squares.add((int) Math.round(Math.pow(num, 2))));

        int sumOfSquares = squares.stream().mapToInt(Integer::intValue).sum();
        int squareOfSums = (int) Math.round(Math.pow(numList.stream().mapToInt(Integer::intValue).sum(), 2));

        return squareOfSums - sumOfSquares;
    }
}
