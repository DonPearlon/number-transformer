package com.training.factorial;

/**
 * Class used to calculate factorial with 'For' cycle.
 *
 * @author Alexandr_Terehov
 */
public class FactorialFor extends Factorial {
    /**
     * Constructor.
     *
     * @param number
     *            number whose factorial needs to be calculated.
     */
    public FactorialFor(int number) {
        super(number);
    }

    /**
     * Method used to calculate factorial with 'For' cycle.
     */
    @Override
    protected void calculateFactorial() {
        for (int i = 1; i <= number; i++) {
            factorial = factorial * i;
        }
        System.out.println("Factorial " + number + " has been created using 'For' cycle");
    }
}
