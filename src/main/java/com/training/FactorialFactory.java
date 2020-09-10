package com.training;

/**
 * Class used to create an instance of the Factorial class.
 *
 * @author Alexandr_Terehov
 */
public class FactorialFactory {
    public static final int WHILE_CYCLE = 1;
    public static final int DO_WHILE_CYCLE = 2;   
    public static final int FOR_CYCLE = 3; 
    
    /**
     * Method used to return an instance of the Factorial class.
     *
     * @param algorithmType
     *            type of algorithm used to calculate factorial.
     * @param n
     *            quantity of Fibonacci sequence numbers.
     * @return instance of the Factorial class.
     */
    public Factorial getFactorialInstance(int algorithmType, int n) {
        switch (algorithmType) {
            case WHILE_CYCLE:
                return new FactorialWhile(n);
            case DO_WHILE_CYCLE:
                return new FactorialDoWhile(n);
            case FOR_CYCLE:
                return new FactorialFor(n);
            default:
                throw new IllegalArgumentException("Algorithm Type must be 1, 2 or 3");
        }
    }
}
