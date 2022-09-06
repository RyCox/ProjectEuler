package com.company;

import com.company.questions.Question2;
import com.company.questions.Question6;
import com.company.questions.Question7;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        System.out.println("Starting program");

        // TODO: Find a way to pass arg for question number.
        String questionNumber = Arrays.stream(args).filter(arg -> arg.matches("")).findFirst().orElse(null);

        Question7 q7 = new Question7();
        System.out.println(q7.countPrimes(10001));

    }
}
