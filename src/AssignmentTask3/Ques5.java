package AssignmentTask3;
import java.util.Scanner;
public class Ques5 {

	public static void main(String[] args) {
//Write a program to sum first n even numbers using a while loop.
		   Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a positive integer (n): ");
	        int n = scanner.nextInt();
	        

	        int sum = 0;
	        int number = 2;
	        int i = 0;

	        while (i < n) {
	            sum =sum+ number;
	            number = 2;
	            i++;
	        }

	        // Display the result
	        System.out.println("Sum of the first " + n + " even numbers: " + sum);
	    }
	
		}


