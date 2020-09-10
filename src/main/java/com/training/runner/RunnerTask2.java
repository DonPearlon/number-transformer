package com.training.runner;

import com.training.factorial.Factorial;
import com.training.factorial.FactorialFactory;
import com.training.fibonacci.Fibonacci;
import com.training.fibonacci.FibonacciFactory;

import java.util.Scanner;

/**
 * Application runner class.
 *
 * @author Alexandr_Terehov
 */
public class RunnerTask2 {
    /**
     * Application start point.
     *
     * @param args
     *            Command line arguments.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter algorithmId, loopType and n");
        int algorithmId = Integer.valueOf(scanner.nextLine());
        int loopType = Integer.valueOf(scanner.nextLine());
        int n = Integer.valueOf(scanner.nextLine());
        if (algorithmId == 1) {
            FibonacciFactory fibonacciFactory = new FibonacciFactory();
            Fibonacci fibonacci = fibonacciFactory.getFibonacciInstance(loopType, n);
            fibonacci.printToConsole();
        } else if (algorithmId == 2) {
            FactorialFactory factorialFactory = new FactorialFactory();
            Factorial factorial = factorialFactory.getFactorialInstance(loopType, n);
            factorial.printToConsole();
        } else {
            throw new IllegalArgumentException("Algorithm ID must be 1 or 2");
        }
    }
}
