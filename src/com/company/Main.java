package com.company;

import com.company.questions.Question10;
import com.company.questions.Question9;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        System.out.println("Starting program");

        // TODO: Find a way to pass arg for question number.
        String questionNumber = Arrays.stream(args).filter(arg -> arg.matches("")).findFirst().orElse(null);

        Question10 question = new Question10();
        Question10.sumOfPrimes(2000000);

    }
}
