package com.training.factorial;

/**
 * Class used to calculate factorial with 'Do-While' cycle.
 *
 * @author Alexandr_Terehov
 */
public class FactorialDoWhile extends Factorial {
    /**
     * Constructor.
     *
     * @param number
     *            number whose factorial needs to be calculated.
     */
    public FactorialDoWhile(int number) {
        super(number);
    }

    /**
     * Method used to calculate factorial with 'Do-While' cycle.
     */
    @Override
    protected void calculateFactorial() {
        int i = 1;
        do {
            factorial = factorial * i;
            i++;
        } while (i <= number);
        System.out.println("Factorial " + number + " has been created using 'Do-While' cycle");
    }
}
