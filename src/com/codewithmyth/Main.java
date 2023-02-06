package com.codewithmyth;

public class Main {
    public static void main(String[] args) {
        TaxCalculator calculator= getCalculator();
        calculator.calculateTax();
    }

    public static TaxCalculator getCalculator() {
        return new TaxCalculator2019();
            /* In real-world application we are not going to write code like in line 10.
               We use dependency injection framework that gives us real implementation of
               an interface */
    }

}
