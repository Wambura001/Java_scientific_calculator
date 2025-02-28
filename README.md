# JAVA SCIENTIFIC CALCULATOR

## Introduction
This project demonstrates application of java in implementation of a scientific calculator, supporting basic arithmetic operations (addition, subtraction, multiplication, division), trigonometric functions, logarithms, and more advanced mathematical operations. The program uses Swing components to create a simple graphical user interface (GUI) for interaction, with buttons for number input and operations.
This technical report details the structure, functionality, improvements, and refactoring made to the code to enhance usability and maintainability.

## Code Structure and Overview
The code is primarily divided into two classes:
•	Base Calculator: An abstract class that defines the core functionality of performing calculations and storing the result.
•	calculator: The main class that extends Base Calculator and implements the GUI components, event handling, and specific calculation logic

## GUI Implementation
The GUI is created using Java Swing components, including:
•	JFrame: The main window of the calculator.
•	JTextField: A text field to display input and output.
•	JButton: Buttons for numbers, operators, and functions.
•	JPanel: A panel to organize the layout of buttons.
The GUI is designed with a user-friendly layout, clear labeling, and intuitive button placement.

## Event Handling
The ActionListener interface is implemented to handle button clicks. When a button is clicked, the corresponding action is performed:
###	Number buttons:
Append the number to the text field.
###	Operator buttons: 
Add the current number and operator to the respective lists.
###	Function buttons:
Perform the specified mathematical operation and update the text field.
###	Equals button:
Perform all pending calculations and display the result.
###	Clear button:
Clear the text field and reset the calculation state.
###	Delete button: 
Delete the last character from the text field.
###	Degree/Radian toggle button: 
Switch between degree and radian mode for trigonometric functions.

## Calculation Logic
The performOperation method in the BaseCalculator class is responsible for executing the calculations. It iterates through the list of numbers and operators, performing the appropriate operation based on the current operator.

## Trigonometric and Logarithmic Functions
The calculator supports various trigonometric and logarithmic functions:
### Trigonometric functions: 
sin, cos, tan, sinh, cosh, tanh.
### Logarithmic functions: 
log, log10, ln.
### Other functions: 
Square root, square, cube, power, factorial, permutation, and combination.


## Error Handling
To ensure better user experience, error handling has been added for invalid operations such as division by zero.

## Decimal Scale Presentation Based on Student ID
As part of the design of the calculator, a decimal scale was calculated using the student ID number 2317422. This number was broken down into its individual digits (2, 3, 1, 7, 4, 2, 2), and the sum of these digits was calculated as:
2+3+1+7+4+2+2=21
21 / 2 = 10.5
Rounded off = 11

## Object Oriented Programming Application

### Encapsulation:
•	The BaseCalculator class encapsulates the core calculation logic, hiding the implementation details from the calculator class.
•	The calculator class encapsulates the GUI components and event handling, separating the user interface from the core functionality.
### Inheritance:
•	The calculator class inherits from the BaseCalculator class, inheriting its properties and methods. This promotes code reuse and a hierarchical structure.
### Polymorphism:
•	Polymorphism can be achieved through interfaces or abstract classes. For example, different calculator implementations could inherit from a common interface, allowing them to be treated uniformly.
### Abstraction:
•	The BaseCalculator class provides an abstract representation of a calculator, focusing on essential features like performing calculations and storing results. It hides the specific implementation details, promoting code flexibility and maintainability.


## Potential Improvements 
To enhance the calculator's functionality and user experience, the following improvements can be considered:
•	Input Validation: 
Validate user input to prevent invalid expressions and ensure correct calculations.
•	Additional Features: 
Consider adding features such as memory functions, unit conversions, and statistical calculations.


## Conclusion
The analyzed scientific calculator provides a solid foundation for performing a wide range of mathematical operations. By addressing the suggested improvements, the calculator can be further enhanced to offer a more robust and user-friendly experience.

## References 
https://www.javatpoint.com/building-a-scientific-calculator-in-java
https://www.geeksforgeeks.org/java-swing-simple-calculator/
https://www.youtube.com/watch?v=dfhmTyRTCSQ
https://www.youtube.com/watch?v=vrKQ49j36ok






 




