package com.training.fibonacci;

/**
 * Class used to calculate a sequence of Fibonacci numbers with 'While' cycle.
 *
 * @author Alexandr_Terehov
 */
public class FibonacciWhile extends Fibonacci {
    /**
     * Constructor.
     *
     * @param number
     *            quantity of Fibonacci sequence numbers.
     */
    public FibonacciWhile(int number) {
        super(number);
    }

    /**
     * Method used to calculate a sequence of Fibonacci numbers with 'While' cycle.
     */
    @Override
    protected void calcFibonacciWithCycle() {
        int i = 3;
        int n = fibonacciArray.length;
        while (i < n) {
            fibonacciArray[i] = fibonacciArray[i - 1] + fibonacciArray[i - 2];
            i++;
        }
        System.out.println("Fibonacci numbers has been created using 'While' cycle");
    }
}
