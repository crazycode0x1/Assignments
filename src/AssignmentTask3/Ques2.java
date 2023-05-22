package AssignmentTask3;
import java.util.Scanner;
public class Ques2 {
//Display Factorial of number
	public static void main(String[] args) {
	       Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a non-negative integer: ");
	        int num = scanner.nextInt();
	       
	        System.out.println("Factorial of " + num + " is " + factorial(num));
	    }

	    public static int factorial(int n) {
	        
	        if (n < 0) {
	            System.out.println("Invalid input. Please enter a non-negative integer.");
	            return -1;
	        }

	       
	        if (n == 0) {
	            return 1;
	        }

	        // Calculate the factorial using recursion
	        return n * factorial(n - 1);
	    }
	    }


	
	
	
	
	
	
		
	


