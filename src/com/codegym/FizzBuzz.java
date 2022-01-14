package com.codegym;

public class FizzBuzz {

    public static final java.lang.String FIZZ_BUZZ = "FizzBuzz";
    public static final java.lang.String FIZZ = "Fizz";
    public static final java.lang.String BUZZ = "Buzz";

    public static String fizzBuzz(int number) {
        boolean isFizz = number % 3 == 0;
        boolean isBuzz = number % 5 == 0;
        boolean isFizzBuzz = isFizz && isBuzz;
        if (isFizzBuzz)
            return FIZZ_BUZZ;

        if (isFizz)
            return FIZZ;

        if (isBuzz)
            return BUZZ;

        return number + "";
    }
}
