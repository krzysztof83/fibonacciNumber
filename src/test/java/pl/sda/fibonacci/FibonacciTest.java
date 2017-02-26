package pl.sda.fibonacci;

import pl.sda.fibonacci.fibonacciImpl.FibonacciEnum;
import pl.sda.fibonacci.fibonacciImpl.FibonacciFabric;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Professional on 2/26/2017.
 */


public class FibonacciTest {

    @Test
    public void fibonnaciRecursive0() {
        Fibonacci fibonacciRecursive = FibonacciFabric.produce(FibonacciEnum.RECURSIVE);
        final int expected = 0;
        final int actual = (int) fibonacciRecursive.getN(0);
        assertEquals(expected, actual);
    }

    @Test
    public void fibonnaciRecursive1() {
        Fibonacci fibonacciRecursive = FibonacciFabric.produce(FibonacciEnum.RECURSIVE);
        final int expected = 1;
        final int actual = (int) fibonacciRecursive.getN(1);
        assertEquals(expected, actual);
    }

    @Test
    public void fibonnaciRecursive2() {
        Fibonacci fibonacciRecursive = FibonacciFabric.produce(FibonacciEnum.RECURSIVE);
        final int expected = 1;
        final int actual = (int) fibonacciRecursive.getN(2);
        assertEquals(expected, actual);
    }

    @Test
    public void fibonnaciRecursive3() {
        Fibonacci fibonacciRecursive = FibonacciFabric.produce(FibonacciEnum.RECURSIVE);
        final int expected = 2;
        final int actual = (int) fibonacciRecursive.getN(3);
        assertEquals(expected, actual);
    }

    @Test
    public void fibonnaciRecursive4() {
        Fibonacci fibonacciRecursive = FibonacciFabric.produce(FibonacciEnum.RECURSIVE);
        final int expected = 3;
        final int actual = (int) fibonacciRecursive.getN(4);
        assertEquals(expected, actual);
    }

    @Test
    public void fibonnaciRecursive5() {
        Fibonacci fibonacciRecursive = FibonacciFabric.produce(FibonacciEnum.RECURSIVE);
        final int expected = 5;
        final int actual = (int) fibonacciRecursive.getN(5);
        assertEquals(expected, actual);
    }

    @Test
    public void fibonnaciRecursive6() {
        Fibonacci fibonacciRecursive = FibonacciFabric.produce(FibonacciEnum.RECURSIVE);
        final int expected = -1;
        final int actual = (int) fibonacciRecursive.getN(-1);
        assertEquals(expected, actual);
    }

    @Test
    public void fibonnaciIteration0() {
        Fibonacci fibonacciIteration = FibonacciFabric.produce(FibonacciEnum.ITERATION);
        final int expected = 0;
        final int actual = (int) fibonacciIteration.getN(0);
        assertEquals(expected, actual);
    }

    @Test
    public void fibonnaciIteration1() {
        Fibonacci fibonacciIteration = FibonacciFabric.produce(FibonacciEnum.ITERATION);
        final int expected = 1;
        final int actual = (int) fibonacciIteration.getN(1);
        assertEquals(expected, actual);
    }

    @Test
    public void fibonnaciIteration2() {
        Fibonacci fibonacciIteration = FibonacciFabric.produce(FibonacciEnum.ITERATION);
        final int expected = 1;
        final int actual = (int) fibonacciIteration.getN(2);
        assertEquals(expected, actual);
    }

    @Test
    public void fibonnaciIteration3() {
        Fibonacci fibonacciIteration = FibonacciFabric.produce(FibonacciEnum.ITERATION);
        final int expected = 2;
        final int actual = (int) fibonacciIteration.getN(3);
        assertEquals(expected, actual);
    }

    @Test
    public void fibonnaciIteration4() {
        Fibonacci fibonacciIteration = FibonacciFabric.produce(FibonacciEnum.ITERATION);
        final int expected = 3;
        final int actual = (int) fibonacciIteration.getN(4);
        assertEquals(expected, actual);
    }

    @Test
    public void fibonnaciIteration5() {
        Fibonacci fibonacciIteration = FibonacciFabric.produce(FibonacciEnum.ITERATION);
        final int expected = 5;
        final int actual = (int) fibonacciIteration.getN(5);
        assertEquals(expected, actual);
    }

    @Test
    public void fibonnaciIteration6() {
        Fibonacci fibonacciIteration = FibonacciFabric.produce(FibonacciEnum.ITERATION);
        final int expected = -1;
        final int actual = (int) fibonacciIteration.getN(-1);
        assertEquals(expected, actual);
    }


}