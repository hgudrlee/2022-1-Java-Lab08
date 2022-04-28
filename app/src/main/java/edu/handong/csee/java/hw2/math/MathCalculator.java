package edu.handong.csee.java.hw2.math;

/**
MathCalculator is a class that has several methods for calculation.
 */
public class MathCalculator {

    private String name;

    /**
    setName sets name of the driver.
     */
    public void setName(String arg) {
        name = arg;
    }

    /**
    getName sets name of the driver.
     */
    public String getName() {
        return name;
    }

    /**
    getMax evaluates two integer numbers and returns max one.
     */
    public int getMax(int a, int b) {
        if (a > b) return a;
        else return b;
    }

    /**
    getMin evaluates two integer numbers and returns min one.
     */
    public int getMin(int a, int b) {
        if (a > b) return b;
        else return a;
    }

    /**
    getAbs evaluates the sign of an integer number and returns Absolute value.
     */
    public int getAbs(int a) {
        if (a < 0) return a * -1;
        return a;
    }

    /**
    getSum returns sum of two integer numbers.
     */
    public int getSum(int a, int b) {
        return a + b;
    }

    /**
    getDiff returns a value from subtraction for two integer numbers.
     */
    public int getDiff(int a, int b) {
        return a - b;
    }
    
    /**
    getProduct returns a value from production for two integer numbers.
     */
    public int getProduct(int a, int b) {
        return a * b;
    }

    /**
    getQuotient returns quotient for two integer numbers.
     */
    public int getQuotient(int a, int b) {
        return a / b;
    }

    /**
    getRemainder returns remainder for two integer numbers.
     */
    public int getRemainder(int a, int b) {
        return a % b;
    }

    /**
    getPower returns a value from power for two integer numbers.
     */
    public int getPower(int a, int b) {
        int num = 1;
        for (int i = 0; i < b; i++) {
            num *= a;
        }
        return num;
    } 

    /**
    getFactorial returns a value from factorial for an integer number.
     */
    public int getFactorial(int a) {
        int num = 1;
        for (int i = 1; i <= a; i++) {
            num *= i;
        }
        return num;
    }

    /**
    getGcd returns Gcd for two integer numbers.
     */
    public int getGcd(int a, int b) {
        int x = getMax(a, b);
        int y = getMin(a, b);

        if (y == 0) return x;
        else return getGcd(y, x % y);
    }

    /**
    getLcm returns Lcm for two integer numbers.
     */
    public int getLcm(int a, int b) {
        int x = getMax(a, b);
        int y = getMin(a, b);

        return (x * y) / getGcd(x, y);
    }

    /**
    getSquare returns a value from square for an integer number.
     */
    public int getSquare(int a) {
        return a * a;
    }
}