package calc;

// Import necessary libraries
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.text.DecimalFormat;

// Abstract base class for arithmetic operations
abstract class ArithmeticOperators {
    protected double num1, num2; // Numbers involved in the operation
    public abstract double perform(double num1, double num2); // Abstract method to perform an operation
}

// Concrete classes for arithmetic operations
class Addition extends ArithmeticOperators {
    public double perform(double num1, double num2) {
        return num1 + num2; // Perform addition
    }
}

class Subtraction extends ArithmeticOperators {
    public double perform(double num1, double num2) {
        return num1 - num2; // Perform subtraction
    }
}

class Multiplication extends ArithmeticOperators {
    public double perform(double num1, double num2) {
        return num1 * num2; // Perform multiplication
    }
}

class Modulus extends ArithmeticOperators {
    public double perform(double num1, double num2) {
        return num1 % num2; // Perform modulus operation
    }
}

class Division extends ArithmeticOperators {
    public double perform(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2; // Perform division
        } else {
            System.out.println("Error"); // Handle division by zero
            return Double.NaN; // Return NaN for invalid division
        }
    }
}

class Power extends ArithmeticOperators {
    public double perform(double num1, double num2) {
        return Math.pow(num1, num2); // Perform power operation
    }
}

// Abstract base class for geometric operations
abstract class GeometricOperators {
    protected double num1; // Input for geometric operations
    public abstract double performOperation(double num1); // Abstract method to perform an operation
}

// Concrete classes for geometric operations
class Absolute extends GeometricOperators {
    public double performOperation(double num1) {
        return Math.abs(num1); // Calculate absolute value
    }
}

class Sine extends GeometricOperators {
    public double performOperation(double num1) {
        return Math.sin(num1); // Calculate sine
    }
}

class Cosine extends GeometricOperators {
    public double performOperation(double num1) {
        return Math.cos(num1); // Calculate cosine
    }
}

class Tangent extends GeometricOperators {
    public double performOperation(double num1) {
        return Math.tan(num1); // Calculate tangent
    }
}

class SineHyp extends GeometricOperators {
    public double performOperation(double num1) {
        return Math.sinh(num1); // Calculate hyperbolic sine
    }
}

class CosineHyp extends GeometricOperators {
    public double performOperation(double num1) {
        return Math.cosh(num1); // Calculate hyperbolic cosine
    }
}

class TangentHyp extends GeometricOperators {
    public double performOperation(double num1) {
        return Math.tanh(num1); // Calculate hyperbolic tangent
    }
}

class Square extends GeometricOperators {
    public double performOperation(double num1) {
        return num1 * num1; // Calculate square
    }
}

class Cube extends GeometricOperators {
    public double performOperation(double num1) {
        return num1 * num1 * num1; // Calculate cube
    }
}

class SquareRoot extends GeometricOperators {
    public double performOperation(double num1) {
        return Math.sqrt(num1); // Calculate square root
    }
}

class Logarithm extends GeometricOperators {
    public double performOperation(double num1) {
        return Math.log(num1); // Calculate natural logarithm
    }
}

class Base10 extends GeometricOperators {
    public double performOperation(double num1) {
        return Math.log10(num1); // Calculate base-10 logarithm
    }
}

class Exponentiation extends GeometricOperators {
    public double performOperation(double num1) {
        return Math.exp(num1); // Calculate exponential
    }
}

class NegativePower extends GeometricOperators {
    public double performOperation(double num1) {
        return 1 / num1; // Calculate reciprocal
    }
}

class Pi extends GeometricOperators {
    public double performOperation(double num1) {
        return Math.PI * num1; // Multiply with Pi
    }
}

// Class for miscellaneous functions
class OtherFunctions {
    // Check if a number is prime
    public boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    // Calculate permutation
    public long Permutation(int n, int r) {
        return factorial(n) / factorial(n - r);
    }

    // Calculate combination
    public long Combination(int n, int r) {
        return factorial(n) / (factorial(r) * factorial(n - r));
    }

    // Private method to calculate factorial
    private long factorial(int n) {
        if (n == 0 || n == 1) return 1;
        return n * factorial(n - 1);
    }
}

// Main calculator class implementing ActionListener for button actions
public class Calculator implements ActionListener {
    JFrame frame; // Main calculator frame
    JTextField textfield; // Display field for calculator
    JButton[] numberButtons = new JButton[10]; // Buttons for numbers 0-9
    JButton[] functionButtons = new JButton[28]; // Array to store function buttons
    JButton addButton, subButton, mulButton, divButton, decButton, modButton;
    JButton delButton, equButton, clrButton, sinButton, sinhButton, absButton;
    JButton cosButton, coshButton, tanButton, tanhButton, degButton, radButton;
    JButton squareButton, cubeButton, sqrtButton, primeButton, permButton, comButton;
    JButton logButton, log10Button, expButton, powerButton, negButton, piButton;
    JButton spaceButton; // Space button for better input separation

    JToggleButton radDegToggle; // Toggle for Radians/Degrees
    JPanel panel; // Panel to organize buttons

    boolean isRadian = true; // Flag to track Radians/Degrees
    Font myFont = new Font("Arial", Font.BOLD, 16); // Font for buttons and text field
    String currentInput = ""; // Current input being typed by the user
    char operator; // Current operator selected
    double num1 = 0, num2 = 0, result = 0; // Numbers and result variables
    ArithmeticOperators operation; // Current arithmetic operation

    // Constructor to initialize the calculator
    Calculator() {
        // Setting up frame, textfield, and buttons
        frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(550, 700);
        frame.setLayout(null);

        textfield = new JTextField();
        textfield.setBounds(30, 25, 450, 50);
        textfield.setFont(myFont);
        textfield.setEditable(false);

        // Initialize buttons and add action listeners
        // ...

        frame.add(panel);
        frame.add(delButton);
        frame.add(clrButton);
        frame.add(radDegToggle);
        frame.add(primeButton);
        frame.add(textfield);
        frame.add(spaceButton);

        frame.setVisible(true); // Make the frame visible
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator(); // Launch the calculator
    }

    // Method to handle button actions
    public void actionPerformed(ActionEvent e) {
        // Logic for handling each button press
        // ...
    }
}
	        ...String.valueOf(result));
	        currentInput = String.valueOf(result);
	    }

	    if (e.getSource() == negButton) {
	        num1 = Double.parseDouble(currentInput);
	        GeometricOperators operation = new NegativePower();
	        result = operation.performOperation(num1);
	        textfield.setText(String.valueOf(result));
	        currentInput = String.valueOf(result);
	    }

	    if (e.getSource() == expButton) {
	        num1 = Double.parseDouble(currentInput);
	        GeometricOperators operation = new Exponentiation();
	        result = operation.performOperation(num1);
	        textfield.setText(String.valueOf(result));
	        currentInput = String.valueOf(result);
	    }

	    if (e.getSource() == permButton) {
	        String[] inputs = textfield.getText().split(" ");
	        if (inputs.length >= 2) {
	            int n = Integer.parseInt(inputs[0]);
	            int r = Integer.parseInt(inputs[1]);
	            OtherFunctions functions = new OtherFunctions();
	            result = functions.Permutation(n, r);
	            textfield.setText(String.valueOf(result));
	            currentInput = String.valueOf(result);
	        }
	    }

	    if (e.getSource() == comButton) {
	        String[] inputs = textfield.getText().split(" ");
	        if (inputs.length >= 2) {
	            int n = Integer.parseInt(inputs[0]);
	            int r = Integer.parseInt(inputs[1]);
	            OtherFunctions functions = new OtherFunctions();
	            result = functions.Combination(n, r);
	            textfield.setText(String.valueOf(result));
	            currentInput = String.valueOf(result);
	        }
	    }

	    if (e.getSource() == primeButton) {
	        int n = Integer.parseInt(currentInput);
	        OtherFunctions functions = new OtherFunctions();
	        boolean isPrime = functions.isPrime(n);
	        textfield.setText(isPrime ? "Prime" : "Not Prime");
	        currentInput = "";
	    }

	    if (e.getSource() == radDegToggle) {
	        isRadian = !isRadian; // Toggle between Radians and Degrees
	        radDegToggle.setText(isRadian ? "Radians" : "Degrees");
	    }
	}
}
if (e.getSource() == negButton) {
    // Convert current input to double and compute the negative power
    num1 = Double.parseDouble(currentInput);
    GeometricOperators operation = new NegativePower();
    result = operation.performOperation(num1);
    
    // Display result and update current input
    textfield.setText(String.valueOf(result));
    currentInput = String.valueOf(result);
}

if (e.getSource() == expButton) {
    // Perform exponentiation
    num1 = Double.parseDouble(currentInput);
    GeometricOperators operation = new Exponentiation();
    result = operation.performOperation(num1);
    
    // Display result and update input
    textfield.setText(String.valueOf(result));
    currentInput = String.valueOf(result);
}

if (e.getSource() == permButton) {
    // Split input for permutation (expects format "n r")
    String[] inputs = textfield.getText().split(" ");
    if (inputs.length >= 2) {
        try {
            int n = Integer.parseInt(inputs[0]);
            int r = Integer.parseInt(inputs[1]);
            
            // Calculate permutation using helper class
            OtherFunctions functions = new OtherFunctions();
            result = functions.Permutation(n, r);
            
            // Display result
            textfield.setText(String.valueOf(result));
            currentInput = String.valueOf(result);
        } catch (NumberFormatException ex) {
            // Handle invalid input gracefully
            textfield.setText("Invalid Input");
        }
    } else {
        textfield.setText("Format: n r");
    }
}

if (e.getSource() == comButton) {
    // Split input for combination (expects format "n r")
    String[] inputs = textfield.getText().split(" ");
    if (inputs.length >= 2) {
        try {
            int n = Integer.parseInt(inputs[0]);
            int r = Integer.parseInt(inputs[1]);
            
            // Calculate combination using helper class
            OtherFunctions functions = new OtherFunctions();
            result = functions.Combination(n, r);
            
            // Display result
            textfield.setText(String.valueOf(result));
            currentInput = String.valueOf(result);
        } catch (NumberFormatException ex) {
            // Handle invalid input
            textfield.setText("Invalid Input");
        }
    } else {
        textfield.setText("Format: n r");
    }
}

if (e.getSource() == primeButton) {
    // Check if the current input is a prime number
    try {
        int n = Integer.parseInt(currentInput);
        OtherFunctions functions = new OtherFunctions();
        boolean isPrime = functions.isPrime(n);
        
        // Display result as "Prime" or "Not Prime"
        textfield.setText(isPrime ? "Prime" : "Not Prime");
        currentInput = ""; // Clear input after prime check
    } catch (NumberFormatException ex) {
        textfield.setText("Invalid Input");
    }
}

if (e.getSource() == radDegToggle) {
    // Toggle between Radians and Degrees for trigonometric calculations
    isRadian = !isRadian; 
    radDegToggle.setText(isRadian ? "Radians" : "Degrees");
}
