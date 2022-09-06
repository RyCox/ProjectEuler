package com.company.questions;

public class Question9 {

    /*
    There exists exactly one Pythagorean triplet for which a + b + c = 1000.
Find the product abc.
     */
    public int pythagorasWasAnAss() {

        // if a^2 + b^2 = c^2, and a + b + c = 1000
        // also, a + 1 = b, b + 1 = c

        int result = 0;

        for (int a = 1; a < 1000; a++) {
            for (int b = 1; b < 1000; b++) {
                int c = 1000 - a - b;
                if (Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2) && a + b + c == 1000) {
                    result = a * b * c;
                }
            }
        }

        return result;
    }
}
