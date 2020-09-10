package com.training;

/**
 * Class used to create an instance of the Fibonacci class.
 *
 * @author Alexandr_Terehov
 */
public class FibonacciFactory {
    public static final int WHILE_CYCLE = 1;
    public static final int DO_WHILE_CYCLE = 2;   
    public static final int FOR_CYCLE = 3;
                                                             
    /**
     * Method used to return an instance of the Fibonacci class.
     *
     * @param algorithmType
     *            type of algorithm used to calculate Fibonacci sequence.
     * @param n
     *            number whose factorial needs to be calculated.
     * @return instance of the Fibonacci class.
     */
    public Fibonacci getFibonacciInstance(int algorithmType, int n) {
        switch (algorithmType) {
            case WHILE_CYCLE:
                return new FibonacciWhile(n);
            case DO_WHILE_CYCLE:
                return new FibonacciDoWhile(n);
            case FOR_CYCLE:
                return new FibonacciFor(n);
            default:
                throw new IllegalArgumentException("Algorithm Type must be 1, 2 or 3");
        }
    }
}
