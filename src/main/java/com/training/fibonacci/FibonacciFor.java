package com.training.fibonacci;

/**
 * Class used to calculate a sequence of Fibonacci numbers with 'For' cycle.
 *
 * @author Alexandr_Terehov
 */
public class FibonacciFor extends Fibonacci {
    /**
     * Constructor.
     *
     * @param number
     *            quantity of Fibonacci sequence numbers.
     */
    public FibonacciFor(int number) {
        super(number);
    }

    /**
     * Method used to calculate a sequence of Fibonacci numbers with 'For' cycle.
     */
    @Override
    protected void calcFibonacciWithCycle() {
        int n = fibonacciArray.length;
        for (int i = 3; i < n; i++) {
            fibonacciArray[i] = fibonacciArray[i - 1] + fibonacciArray[i - 2];
        }
        System.out.println("Fibonacci numbers has been created using 'For' cycle");
    }
}
