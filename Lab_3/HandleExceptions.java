package org.example;

public class HandleExceptions
{
    public void handleException(double n, double r)
    {
        if (n != (int) n || r != (int) r) {
            throw new IllegalArgumentException("Inputs must be integers.");
        }

        if (n < 0) {
            throw new IllegalArgumentException("Input cannot be negative.");
        }

        if (n == 0) {
            throw new IllegalArgumentException("You provided 0 as value of n, Factorial of 0 is 1.");
        }

        if (n > 15) {
            throw new IllegalArgumentException("Input is too large. Maximum supported input is 15.");
        }

        if (n < r || n < 0 || r < 0 || n > 15 || r > 15) {
            throw new IllegalArgumentException("Invalid input. Ensure that this condition is satisfied: n >= r >= 0 and both n and r are in the range 0 to 15 inclusive!");
        }
    }
}
