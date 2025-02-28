package Java_Final_Project;
	import java.awt.*;
	import javax.swing.*;
	import java.awt.event.*;
	import java.text.DecimalFormat;

//	Arithmetic interface
	abstract class ArithmeticOperators{
		protected double num1, num2;
		public abstract double perform(double num1, double num2);
	}

	class Addition extends ArithmeticOperators{
		public double perform(double num1, double num2) {
			return num1+num2;
		}
	}

	class Subtraction extends ArithmeticOperators{
		public double perform(double num1, double num2) {
			return num1-num2;
		}
	}

	class Multiplication extends ArithmeticOperators{
		public double perform(double num1, double num2) {
			return num1*num2;
		}
	}

	class Modulus extends ArithmeticOperators{
		public double perform(double num1, double num2) {
			return num1%num2;
		}
	}

	class Division extends ArithmeticOperators{
		public double perform(double num1, double num2) {
			if(num2!=0) {
				return num1/num2;
			}
			else {
				System.out.println("Error");
				return Double.NaN;
			}
		}
	}

	class Power extends ArithmeticOperators{
		public double perform(double num1, double num2) {
			return Math.pow(num1, num2);
		}
	}

//	Geometric Interface
	abstract class GeometricOperators{
		protected double num1;
		public abstract double performOperation(double num1);
	}

	class Absolute extends GeometricOperators{
		public double performOperation(double num1) {
			return Math.abs(num1);
		}
	}

	class Sine extends GeometricOperators{
		public double performOperation(double num1) {
			return Math.sin(num1);
		}
	}

	class Cosine extends GeometricOperators{
		public double performOperation(double num1) {
			return Math.cos(num1);
		}
	}

	class Tangent extends GeometricOperators{
		public double performOperation(double num1) {
			return Math.tan(num1);
		}
	}

	class SineHyp extends GeometricOperators{
		public double performOperation(double num1) {
			return Math.sinh(num1);
		}
	}

	class CosineHyp extends GeometricOperators{
		public double performOperation(double num1) {
			return Math.cosh(num1);
		}
	}

	class TangentHyp extends GeometricOperators{
		public double performOperation(double num1) {
			return Math.tanh(num1);
		}
	}

	class Square extends GeometricOperators{
		public double performOperation(double num1) {
			return num1*num1;
		}
	}

	class Cube extends GeometricOperators{
		public double performOperation(double num1) {
			return num1*num1*num1;
		}
	}

	class SquareRoot extends GeometricOperators{
		public double performOperation(double num1) {
			return Math.sqrt(num1);
		}
	}

	class Logarithm extends GeometricOperators{
		public double performOperation(double num1) {
			return Math.log(num1);
		}
	}

	class Base10 extends GeometricOperators{
		public double performOperation(double num1) {
			return Math.log10(num1);
		}
	}

	class Exponentiation extends GeometricOperators{
		public double performOperation(double num1) {
			return Math.exp(num1);
		}
	}

	class NegativePower extends GeometricOperators{
		public double performOperation(double num1) {
			return 1/num1;
		}
	}

	class Pi extends GeometricOperators{
		public double performOperation(double num1) {
			return Math.PI*num1;
			}
	}

	class OtherFunctions{
		public boolean isPrime(int n) {
			if (n<=1) return false;
			for (int i=2; i<=Math.sqrt(n); i++) {
				if (n%i==0) return false;
			}
			return true;
		}
		public long Permutation(int n, int r) {
			return factorial(n) / factorial(n-r);
		}
		public long Combination(int n, int r) {
			return factorial(n) / (factorial(r)*factorial(n-r));
		}
		private long factorial(int n) {
			if(n==0||n==1)return 1;
			return n*factorial(n-1);
		}
	}

	    
	public class Java_Final_Project implements ActionListener{

		JFrame frame;
		JTextField textfield;
		JButton[] numberButtons = new JButton[10];
		JButton[] functionButtons =new JButton[28];
		JButton addButton, subButton, mulButton, divButton, decButton, modButton;
		JButton delButton, equButton, clrButton, sinButton, sinhButton, absButton;
		JButton cosButton, coshButton, tanButton, tanhButton, degButton, radButton;
		JButton squareButton, cubeButton, sqrtButton, primeButton, permButton, comButton;
		JButton logButton, log10Button, expButton, powerButton, negButton, piButton;
	    JButton spaceButton;
	    
		JToggleButton radDegToggle;
		JPanel panel;

		boolean isRadian =true;

		Font myFont = new Font("Arial", Font.BOLD, 16);
		String currentInput = "";
		char operator;
		double num1 =0, num2=0,result=0;
		ArithmeticOperators operation;

		Java_Final_Project(){
			frame = new JFrame("Calculator");
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setSize(550, 700);
			frame.setLayout(null);
			
			textfield = new JTextField();
			textfield.setBounds(30, 25, 450, 50);
			textfield.setFont(myFont);
			textfield.setEditable(false);

			addButton = new JButton("+");//addition button
			subButton = new JButton("-");//subtraction button
			mulButton = new JButton("x");//multiplication button
			divButton = new JButton("/");//division button
			decButton = new JButton(".");//decimal point button
			delButton = new JButton("Delete");//delete button
			equButton = new JButton("=");//equal button
			clrButton = new JButton("Clear");//erase button
			modButton = new JButton("%");//modulus button
			spaceButton = new JButton("Space"); //space button
			absButton = new JButton("|x|");//absolute button
		    sinButton = new JButton("sin");//sine button
		    cosButton = new JButton("cos");//cosine button
		    tanButton = new JButton("tan");//tangent button
		    sinhButton = new JButton("sinh");//sine hypotenus button
		    coshButton = new JButton("cosh");//cosine hypoteneuse button
		    tanhButton = new JButton("tanh");//tangent hypotneuse button
		    
		    squareButton = new JButton("x²");//squared button
		    cubeButton = new JButton("x³");//cubed button
		    sqrtButton = new JButton("√"); //square root button
		    primeButton = new JButton("Prime");//prime check button
		    permButton = new JButton("nPr");//permutations button
		    comButton = new JButton("nCr");//combination button
		    logButton = new JButton("ln(x)");//logarithm button
		    log10Button = new JButton("log10(x)");//logarithm base 10 button
		    expButton = new JButton("exp(x)");//exponential of x button
		    negButton = new JButton("x^-1");//power of negative one button
		    piButton = new JButton("π");//pi button
		    powerButton = new JButton("x^y");//power button
		    radDegToggle = new JToggleButton("Radians");//radians to degree button
		    
			
			//setting the place for each button on the frame.
			functionButtons[0] = addButton;
			functionButtons[1] = subButton;
			functionButtons[2] = mulButton;
			functionButtons[3] = divButton;
			functionButtons[4] = decButton;
			functionButtons[5] = delButton;
			functionButtons[6] = equButton;
			functionButtons[7] = clrButton;
			functionButtons[8]= sinButton;
			functionButtons[9]= cosButton;
			functionButtons[10]= tanButton;
			functionButtons[11]= sinhButton;
			functionButtons[12]= coshButton;
			functionButtons[13]= tanhButton;
			functionButtons[14]= piButton;
			functionButtons[15]= comButton;
			functionButtons[16]= modButton;
			functionButtons[17]= primeButton;
			functionButtons[18] = squareButton;
			functionButtons[19] = cubeButton;
			functionButtons[20]= permButton;
			functionButtons[21] = sqrtButton;
			functionButtons[22] = logButton;
			functionButtons[23] = log10Button;
			functionButtons[24] = expButton;
			functionButtons[25] = powerButton;
			functionButtons[26]=absButton;
			functionButtons[27]=negButton;
			
			for(int i=0; i<28; i++) {
				functionButtons[i].addActionListener(this);
				functionButtons[i].setFont(myFont);
				functionButtons[i].setFocusable(false);
			}
			
			for(int i=0; i<10; i++) {
				numberButtons[i]=new JButton(String.valueOf(i));
				numberButtons[i].addActionListener(this);
				numberButtons[i].setFont(myFont);
				numberButtons[i].setFocusable(false);
			}
			
			spaceButton.setFont(myFont);
			spaceButton.setFocusable(false);
			spaceButton.addActionListener(this); //add action listener for space button
			
			primeButton.setBounds(10, 560, 100, 50); 
			radDegToggle.setBounds(120, 560, 100, 50); 
			delButton.setBounds(230, 560, 100, 50);
			clrButton.setBounds(340, 560, 100, 50); 
			spaceButton.setBounds(50, 490, 300, 50);
			
			//setting the area where the buttons will sit.
			panel = new JPanel();
			panel.setBounds(30, 100, 450, 350);
			panel.setLayout(new GridLayout(7,5, 15, 10));
			
			//placing buttons in order
			panel.add(numberButtons[1]);
			panel.add(numberButtons[2]);
			panel.add(numberButtons[3]);
			panel.add(sinButton);
			panel.add(sinhButton);
			panel.add(numberButtons[4]);
			panel.add(numberButtons[5]);
			panel.add(numberButtons[6]);
			panel.add(cosButton);
			panel.add(coshButton);
			panel.add(numberButtons[7]);
			panel.add(numberButtons[8]);
			panel.add(numberButtons[9]);
			panel.add(tanButton);
			panel.add(tanhButton);
			panel.add(numberButtons[0]);
			panel.add(addButton);
			panel.add(subButton);
			panel.add(squareButton);
			panel.add(cubeButton);
			panel.add(divButton);
			panel.add(mulButton);
			panel.add(decButton);
			panel.add(powerButton);
			panel.add(negButton);
			panel.add(log10Button);
			panel.add(logButton);
			panel.add(sqrtButton);
			panel.add(piButton);
			panel.add(modButton);
			panel.add(permButton);
			panel.add(comButton);
			panel.add(expButton);
			panel.add(absButton);
			panel.add(equButton);
			
			
			//adding functions to frame.
			frame.add(panel);
			frame.add(delButton);
			frame.add(clrButton);
			frame.add(radDegToggle);
			frame.add(primeButton);
			frame.add(textfield);
			frame.add(spaceButton);
			
			frame.setVisible(true);
		}

//		public static void main(String[] args) {	
//			Java_Final_Project calc = new Java_Final_Project();
//		}

		public void actionPerformed(ActionEvent e) {
		    // Number buttons
		    for (int i = 0; i < 10; i++) {
		        if (e.getSource() == numberButtons[i]) {
		            currentInput += String.valueOf(i);  // Concatenate the numbers
		            textfield.setText(currentInput);    // Update the display
		        }
		    }

		    if (e.getSource() == spaceButton) {
		    	if (!currentInput.isEmpty() && !currentInput.endsWith(" ")) {
		    		currentInput += " ";
		    	} 
		    		textfield.setText(textfield.getText() + " ");
		    	
		    }
		    
		    if (e.getSource() == decButton) {
		        currentInput += ".";  // Concatenate the decimal point
		        textfield.setText(currentInput);
		    }

		    if (e.getSource() == addButton) {
		        try {
		        num1 = Double.parseDouble(currentInput);  
		        operation = new Addition();  
		        currentInput = "";  // Reset the input for next number
		        textfield.setText(textfield.getText() + "+" );  // Display the operator on the screen
		    } catch (NumberFormatException ex) {
		    	textfield.setText("Error: Invalid Input");
		    }
		    }

		    if (e.getSource() == subButton) {
		    	try {
		    		num1 = Double.parseDouble(currentInput);
		            operation = new Subtraction();
		            currentInput = "";
		            textfield.setText(num1 + "-");
		    } catch (NumberFormatException ex) {
		    	textfield.setText("Error: Invalid Input");
		    }
		    }

		    if (e.getSource() == mulButton) {
		        num1 = Double.parseDouble(currentInput);
		        operation = new Multiplication();
		        currentInput = "";
		        textfield.setText(currentInput + "x");
		    }

		    if (e.getSource() == divButton) {
		        num1 = Double.parseDouble(currentInput);
		        operation = new Division();
		        currentInput = "";
		        textfield.setText(currentInput + "/");
		    }
		    
		    if (e.getSource() == equButton) {
		     num2 = Double.parseDouble(currentInput); 
		     result = operation.perform(num1, num2); 
		     DecimalFormat df = new DecimalFormat("#.#############"); //answer set to 13 decimal places if the decimal places exceed 12.
		     String formattedResult = df.format(result);   
		     textfield.setText(formattedResult);  
		     currentInput = formattedResult;  
		     num1 = result; 
		    }
		    
		    if (e.getSource() == clrButton) {
		        currentInput = "";
		        num1 = 0;
		        num2 = 0;
		        textfield.setText("");
		    }
		    if (e.getSource() == delButton) {
		        if (currentInput.length() > 0) {
		            currentInput = currentInput.substring(0, currentInput.length() - 1);  
		            textfield.setText(currentInput); 
		        }
		    }
		    
		    if (e.getSource() == powerButton) {
		        num2 = Double.parseDouble(currentInput);
		        ArithmeticOperators operation = new Power();
		        result = operation.perform(num1, num2);
		        textfield.setText(String.valueOf(result));
		        currentInput = String.valueOf(result);
		    }

		    
		    if (e.getSource() == modButton) {
		        if (!currentInput.isEmpty()) {
		            num1 = Double.parseDouble(currentInput); // Store the first number
		            operation = new Modulus(); // Set the operation to Modulus
		            currentInput = ""; // Reset the input for the second number
		            textfield.setText(currentInput + "%"); // Optional: Display the operator on the screen
		        }
		    }

		    if (e.getSource() == equButton) {
		        if (operation != null && !currentInput.isEmpty()) { // Check if operation is set and currentInput is not empty
		            num2 = Double.parseDouble(currentInput); // Parse the second number
		            result = operation.perform(num1, num2); // Perform the operation
		            DecimalFormat df = new DecimalFormat("#.#############"); // Format the result
		            String formattedResult = df.format(result);   
		            textfield.setText(formattedResult); // Display the result
		            currentInput = formattedResult; // Store the result for further calculations
		            operation = null; // Reset operation after use
		        } else {
		            textfield.setText("Error"); // Handle the case where operation is not set or input is empty
		        }
		    }
		    
		    if (e.getSource() == absButton) {
		        num1 = Double.parseDouble(currentInput);
		        GeometricOperators operation = new Absolute();
		        result = operation.performOperation(num1);
		        textfield.setText(String.valueOf(result));
		        currentInput = String.valueOf(result);
		    }
		    
		    if (e.getSource() == sinButton) {
		        num1 = Double.parseDouble(currentInput);
		        if (!isRadian) {
		            num1 = Math.toRadians(num1); }
		        GeometricOperators operation = new Sine();
		        result = operation.performOperation(num1);
		        textfield.setText(String.valueOf(result));
		        currentInput = String.valueOf(result);
		    }

		    if (e.getSource() == cosButton) {
		        num1 = Double.parseDouble(currentInput);
		        if (!isRadian) {
		            num1 = Math.toRadians(num1); }
		        GeometricOperators operation = new Cosine();
		        result = operation.performOperation(num1);
		        textfield.setText(String.valueOf(result));
		        currentInput = String.valueOf(result);
		    }

		    if (e.getSource() == tanButton) {
		        num1 = Double.parseDouble(currentInput);
		        if (!isRadian) {
		            num1 = Math.toRadians(num1); }
		        GeometricOperators operation = new Tangent();
		        result = operation.performOperation(num1);
		        textfield.setText(String.valueOf(result));
		        currentInput = String.valueOf(result);
		    }
		    if (e.getSource() == sinhButton) {
		        num1 = Double.parseDouble(currentInput);
		        if (!isRadian) {
		            num1 = Math.toRadians(num1); }
		        GeometricOperators operation = new SineHyp();
		        result = operation.performOperation(num1);
		        textfield.setText(String.valueOf(result));
		        currentInput = String.valueOf(result);
		    }

		    if (e.getSource() == coshButton) {
		        num1 = Double.parseDouble(currentInput);
		        if (!isRadian) {
		            num1 = Math.toRadians(num1); }
		        GeometricOperators operation = new CosineHyp();
		        result = operation.performOperation(num1);
		        textfield.setText(String.valueOf(result));
		        currentInput = String.valueOf(result);
		    }

		    if (e.getSource() == tanhButton) {
		        num1 = Double.parseDouble(currentInput);
		        if (!isRadian) {
		            num1 = Math.toRadians(num1); }
		        GeometricOperators operation = new TangentHyp();
		        result = operation.performOperation(num1);
		        textfield.setText(String.valueOf(result));
		        currentInput = String.valueOf(result);
		    }
		    
		    if (e.getSource() == squareButton) {
		        num1 = Double.parseDouble(currentInput);
		        GeometricOperators operation = new Square();
		        result = operation.performOperation(num1);
		        textfield.setText(String.valueOf(result));
		        currentInput = String.valueOf(result);
		    }
		    
		    if (e.getSource() == cubeButton) {
		        num1 = Double.parseDouble(currentInput);
		        GeometricOperators operation = new Cube();
		        result = operation.performOperation(num1);
		        textfield.setText(String.valueOf(result));
		        currentInput = String.valueOf(result);
		    }
		    
		    if (e.getSource() == sqrtButton) {
		        num1 = Double.parseDouble(currentInput);
		        GeometricOperators operation = new SquareRoot();
		        result = operation.performOperation(num1);
		        textfield.setText(String.valueOf(result));
		        currentInput = String.valueOf(result);
		    }
		    
		    if (e.getSource() == logButton) {
		        num1 = Double.parseDouble(currentInput);
		        GeometricOperators operation = new Logarithm();
		        result = operation.performOperation(num1);
		        textfield.setText(String.valueOf(result));
		        currentInput = String.valueOf(result);
		    }
		    
		    if (e.getSource() == log10Button) {
		        num1 = Double.parseDouble(currentInput);
		        GeometricOperators operation = new Base10();
		        result = operation.performOperation(num1);
		        textfield.setText(String.valueOf(result));
		        currentInput = String.valueOf(result);
		    }
		    
		    if (e.getSource() == piButton) {
		        num1 = Double.parseDouble(currentInput);
		        GeometricOperators operation = new Pi();
		        result = operation.performOperation(num1);
		        textfield.setText(String.valueOf(result));
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
		    
		    if (e.getSource() == radDegToggle) {
		        isRadian = !isRadian;
		        radDegToggle.setText(isRadian ? "Radians" : "Degrees");
		    }
		    
		    OtherFunctions of = new OtherFunctions();
		    if (e.getSource() == primeButton) {
		        int num = Integer.parseInt(currentInput);
		        boolean prime = of.isPrime(num);
		        textfield.setText(prime ? "Prime" : "Not Prime");
		        currentInput = "";
		    }
		    if (e.getSource() == permButton) {
		        try {
		            
		        	if (!currentInput.contains(" ")) {
		        		textfield.setText("Error: Please enter as 'n r' (with space)");
		        		currentInput = "";
		        		return;
		        	}
		        	String[] inputs = currentInput.split(" ");
		            if (inputs.length != 2) throw new Exception("Invalid Input. Enter as n r");
		            
		            int n = Integer.parseInt(inputs[0]);
		            int r = Integer.parseInt(inputs[1]);
		            
		            if (r > n) {
		                textfield.setText("Error: r cannot be greater than n");
		                return;
		            }
		            long perm = of.Permutation(n, r);
		            textfield.setText(String.valueOf(perm));
		            currentInput = "";
		        } catch (Exception ex) {
		            textfield.setText("Error: Use n r format");
		            currentInput = "";
		        }
		    }
		    if (e.getSource() == comButton) {
		        try {
		            
		        	String[] inputs = currentInput.split(" ");
		            if (inputs.length != 2) throw new Exception("Invalid Input. Enter as n r");
		            
		            int n = Integer.parseInt(inputs[0]);
		            int r = Integer.parseInt(inputs[1]);
		            
		            if (r > n) {
		            	textfield.setText("Error: r cannot be greater than n");
		            	return;
		            }
		            long comb = of.Combination(n, r);
		            textfield.setText(String.valueOf(comb));
		            currentInput = "";
		        } catch (Exception ex) {
		            textfield.setText("Error: Use n r format");
		            currentInput = "";
		        }
		    }
		    

		}
	}

	
	


