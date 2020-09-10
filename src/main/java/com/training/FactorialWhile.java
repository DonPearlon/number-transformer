package com.training;

/**
 * Class used to calculate factorial with 'While' cycle.
 *
 * @author Alexandr_Terehov
 */
public class FactorialWhile extends Factorial {
    /**
     * Constructor.
     *
     * @param number
     *            number whose factorial needs to be calculated.
     */
    public FactorialWhile(int number) {
        super(number);
    }

    /**
     * Method used to calculate factorial with 'While' cycle.
     */
    @Override
    protected void calculateFactorial() {
        int i = 1;
        while (i <= number) {
            factorial = factorial * i;
            i++;
        }
        System.out.println("Factorial " + number + " has been created using 'While' cycle");
    }
}
