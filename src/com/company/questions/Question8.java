package com.company.questions;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class Question8 {

    /*
        Find the thirteen adjacent digits in the number that have the greatest product.
     */
    public int findTheGreatestProduct(int adjacentDigits) {

        String number;
        try {
            number = new String(Files.readAllBytes(Paths.get("src/resources/static/question8.txt")));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        int indexProduct = 0;
        long largestProduct = 0;

        while (indexProduct < number.length()) {
            if (indexProduct + adjacentDigits < number.length()) {
                String substring = number.substring(indexProduct, indexProduct + adjacentDigits);
                if (!substring.contains("0")) {

                    long product = 1;

                    try {
                        for (int i = 0; i < substring.length(); i++) {
                            product = product * Long.parseLong(substring.substring(i, i + 1));
                        }
                    } catch (Exception ex) {
                        throw ex;
                    }

                    if (product > largestProduct) {
                        largestProduct = product;
                        System.out.println(largestProduct);
                    }
                }
            }
            indexProduct ++;
        }

        return (int) largestProduct;

    }
}
