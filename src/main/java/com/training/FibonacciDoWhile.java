package com.training;

/**
 * Class used to calculate a sequence of Fibonacci numbers with 'Do-While'
 * cycle.
 *
 * @author Alexandr_Terehov
 */
public class FibonacciDoWhile extends Fibonacci {
    /**
     * Constructor.
     *
     * @param number
     *            quantity of Fibonacci sequence numbers.
     */
    public FibonacciDoWhile(int number) {
        super(number);
    }

    /**
     * Method used to calculate a sequence of Fibonacci numbers with 'Do-While'
     * cycle.
     */
    @Override
    protected void calcFibonacciWithCycle() {
        int i = 3;
        int n = fibonacciArray.length;
        do {
            fibonacciArray[i] = fibonacciArray[i - 1] + fibonacciArray[i - 2];
            i++;
        } while (i < n);
        System.out.println("Fibonacci numbers has been created using 'Do-While' cycle");
    }
}
