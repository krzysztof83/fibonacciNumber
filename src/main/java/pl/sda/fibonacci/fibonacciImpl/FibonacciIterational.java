package pl.sda.fibonacci.fibonacciImpl;

import pl.sda.fibonacci.Fibonacci;

/**
 * Created by Professional on 2/26/2017.
 */
public class FibonacciIterational implements Fibonacci {


    @Override
    public long getN(int n) {
        int currentValue = 0;

        if(n<0){
            System.out.println("Wrong Data");
            currentValue=-1;
            return currentValue;
        }else if(n==1){
            currentValue=1;
        }else if(n>1) {
            currentValue = 1;
            int prevValue = 1;
            for (int i = 2; i < n; i++) {
                int tmpvalue = currentValue;
                currentValue = currentValue + prevValue;
                prevValue = tmpvalue;
            }

        }return currentValue;
    }
}
