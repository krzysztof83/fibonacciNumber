package pl.sda.fibonacci;

import pl.sda.fibonacci.fibonacciImpl.FibonacciEnum;
import pl.sda.fibonacci.fibonacciImpl.FibonacciFabric;

/**
 * Created by Professional on 2/26/2017.
 */
public class Main {
    public static void main(String[] args) {
        Fibonacci fibonacciRecursive = FibonacciFabric.produce(FibonacciEnum.RECURSIVE);
        System.out.println(fibonacciRecursive.getN(-1));
        System.out.println(fibonacciRecursive.getN(1));
        System.out.println(fibonacciRecursive.getN(2));
        System.out.println(fibonacciRecursive.getN(3));
        System.out.println(fibonacciRecursive.getN(4));
        System.out.println(fibonacciRecursive.getN(5));
        System.out.println(fibonacciRecursive.getN(6));

        Fibonacci fibonacciIteration=FibonacciFabric.produce(FibonacciEnum.ITERATION);
        System.out.println(fibonacciIteration.getN(-1));
        System.out.println(fibonacciIteration.getN(1));
        System.out.println(fibonacciIteration.getN(2));
        System.out.println(fibonacciIteration.getN(3));
        System.out.println(fibonacciIteration.getN(4));
        System.out.println(fibonacciIteration.getN(5));
        System.out.println(fibonacciIteration.getN(6));



    }
}
