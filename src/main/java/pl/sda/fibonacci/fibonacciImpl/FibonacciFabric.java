package pl.sda.fibonacci.fibonacciImpl;

import pl.sda.fibonacci.Fibonacci;

/**
 * Created by Professional on 2/26/2017.
 */
public class FibonacciFabric {

    public static Fibonacci produce(FibonacciEnum type){
        if(FibonacciEnum.ITERATION.equals(type)){
            return new FibonacciIterational();
        }
        if(FibonacciEnum.RECURSIVE.equals(type)){
            return new FibonacciRecursive();
        }
        return null;
    }

}
