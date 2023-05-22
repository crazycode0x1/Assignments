package AssignmentTask3;
import java.util.Scanner;
public class Ques1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the number of terms: ");
	        int numTerms = scanner.nextInt();

	        // Display Fibonacci series
	        System.out.println("Fibonacci Series:");
	        for (int i = 0; i < numTerms; i++) {
	            System.out.print(fibonacci(i) + " ");
	        }
	    }

	    // Recursive method to calculate Fibonacci number
	    public static int fibonacci(int n) {
	        if (n <= 1) {
	            return n;
	        } else {
	            return fibonacci(n - 1) + fibonacci(n - 2);
	        }
	    }
	}


