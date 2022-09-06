package com.company;

import com.company.questions.Question2;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        System.out.println("Starting program");

        // TODO: Find a way to pass arg for question number.
        String questionNumber = Arrays.stream(args).filter(arg -> arg.matches("")).findFirst().orElse(null);
        

    }
}
