package AssignmentTask2;

import java.util.Scanner;

public class Ques6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*6.Write a program to create a
calculator using the switch case. */
		 Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Enter first number: ");
	        double num1 = scanner.nextDouble();
	        
	        System.out.print("Enter second number: ");
	        double num2 = scanner.nextDouble();
	        
	        System.out.print("Enter an operator (+, -, *, /): ");
	        char operator = scanner.next().charAt(0);
	        
	        double result;
	        
	        switch (operator) {
	            case '+':
	                result = num1 + num2;
	                System.out.println("Result: " + result);
	                break;
	            case '-':
	                result = num1 - num2;
	                System.out.println("Result: " + result);
	                break;
	            case '*':
	                result = num1 * num2;
	                System.out.println("Result: " + result);
	                break;
	            case '/':
	                if (num2 != 0) {
	                    result = num1 / num2;
	                    System.out.println("Result: " + result);
	                } else {
	                    System.out.println("Error: Cannot divide by zero.");
	                }
	                break;
	            default:
	                System.out.println("Error: Invalid operator.");
	        }
	        

	}

}
