package com.training;

/**
 * Abstract class used to calculate a sequence of Fibonacci numbers.
 *
 * @author Alexandr_Terehov
 */
public abstract class Fibonacci {
    protected long[] fibonacciArray;

    /**
     * Constructor.
     *
     * @param number
     *            quantity of Fibonacci sequence numbers.
     */
    public Fibonacci(int number) {
        if (number <= 0) {
            throw new IllegalArgumentException("Number must be >= 0");
        } else {
            fibonacciArray = new long[number];
            calculateFibonacci();
        }
    }

    /**
     * Method used to output a sequence of Fibonacci numbers to the console.
     */
    public void printToConsole() {
        for (long i : fibonacciArray) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    /**
     * Fibonacci sequence calculation method.
     */
    protected void calculateFibonacci() {
        int n = fibonacciArray.length;
        if (n == 1) {
            fibonacciArray[0] = 0;
        } else if (n == 2) {
            fibonacciArray[0] = 0;
            fibonacciArray[1] = 1;
        } else if (n == 3) {
            fibonacciArray[0] = 0;
            fibonacciArray[1] = 1;
            fibonacciArray[2] = 1;
        } else {
            fibonacciArray[0] = 0;
            fibonacciArray[1] = 1;
            fibonacciArray[2] = 1;
            calcFibonacciWithCycle();
        }
    }

    /**
     * Abstract method used to calculate a sequence of Fibonacci numbers.
     */
    protected abstract void calcFibonacciWithCycle();

    /**
     * Method used to return an array of Fibonacci numbers.
     *
     * @return fibonacciArray array of Fibonacci numbers.
     */
    public long[] getFibonacciArray() {
        return fibonacciArray;
    }
}
