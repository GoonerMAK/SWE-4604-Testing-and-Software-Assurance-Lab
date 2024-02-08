package org.example;

public class CombinationCalculator {
    public long factorial(int n) {
        if (n == 0)
            return 1;
        long res = 1;
        for (int i = 2; i <= n; i++)
            res *= i;
        return res;
    }

    public long combination(double n, double r) {
        HandleExceptions handler = new HandleExceptions();
        handler.handleException(n, r);

        int nInt = (int) n;
        int rInt = (int) r;

        long result = factorial(nInt) / (factorial(rInt) * factorial(nInt - rInt));
        return result;
    }

}
