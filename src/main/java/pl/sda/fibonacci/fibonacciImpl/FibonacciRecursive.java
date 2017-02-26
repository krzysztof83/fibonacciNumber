package pl.sda.fibonacci.fibonacciImpl;

import pl.sda.fibonacci.Fibonacci;

/**
 * Created by Professional on 2/26/2017.
 */
public class FibonacciRecursive implements Fibonacci {


    @Override
    public long getN(int n) {

        long result = 0;
        if(n<0){
            System.out.println("Wrong data");
            return -1;
        }else if(n==0){
            result = 0;
        }else if (n == 1){
            result = 1;
        }else{
            result = getN(n - 1) + getN(n - 2);
        }
        return result;
    }
}
