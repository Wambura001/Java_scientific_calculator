package calc;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.text.DecimalFormat;

// Abstract class for arithmetic operations
abstract class ArithmeticOperators {
    protected double num1, num2;

    public abstract double perform(double num1, double num2);
}

// Concrete classes for specific arithmetic operations
class Addition extends ArithmeticOperators {
    public double perform(double num1, double num2) {
        return num1 + num2;
    }
}

// ... (similar classes for Subtraction, Multiplication, Modulus, Division, Power)

// Abstract class for geometric operations
abstract class GeometricOperators {
    protected double num1;

    public abstract double performOperation(double num1);
}

// Concrete classes for specific geometric operations
class Absolute extends GeometricOperators {
    public double performOperation(double num1) {
        return Math.abs(num1);
    }
}

// ... (similar classes for Sine, Cosine, Tangent, SineHyp, CosineHyp, TangentHyp, Square, Cube, SquareRoot, Logarithm, Base10, Exponentiation, NegativePower, Pi)

class OtherFunctions {
    public boolean isPrime(int n) {
        // ... (prime number checking logic)
    }

    public long Permutation(int n, int r) {
        // ... (permutation calculation logic)
    }

    public long Combination(int n, int r) {
        // ... (combination calculation logic)
    }

    private long factorial(int n) {
        // ... (factorial calculation logic)
    }
}

public class Calculator implements ActionListener {
    // ... (declarations for UI components)

    Calculator() {
        // ... (initialize UI components and layout)
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
    }

    public void actionPerformed(ActionEvent e) {
        // Handle button clicks
        for (int i = 0; i < 10; i++) {
            if (e.getSource() == numberButtons[i]) {
                // ... (handle number button clicks)
            }
        }

        // ... (handle other button clicks, including arithmetic, geometric, and other functions)

        // ... (handle special cases like prime number checking, permutations, combinations)
    }
}