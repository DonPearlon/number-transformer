package com.training.factorial;

/**
 * Abstract class used to calculate factorial of a number.
 *
 * @author Alexandr_Terehov
 */
public abstract class Factorial {
    protected int number;
    protected long factorial;

    /**
     * Constructor.
     *
     * @param number
     *            number whose factorial needs to be calculated.
     */
    public Factorial(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Number must be >= 0");
        } else {
            this.number = number;
            this.factorial = 1;
            if (number > 1) {
                calculateFactorial();
            }
        }
    }

    /**
     * Abstract method used for factorial calculations.
    */
    protected abstract void calculateFactorial();

    /**
     * Method used to return the factorial of a number.
     *
     * @return fact factorial of a number.
     */
    public long getFactorial() {
        return factorial;
    }

    /**
     * Method used to output the factorial to the console.
     */
    public void printToConsole() {
        System.out.println("Factorial " + number + " = " + factorial);
    }
}
